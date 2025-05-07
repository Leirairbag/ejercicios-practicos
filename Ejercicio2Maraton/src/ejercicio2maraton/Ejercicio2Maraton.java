/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2maraton;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 *
 * @author gabri
 */
public class Ejercicio2Maraton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ArbolClientes arbolClientes = new ArbolClientes();
    ArbolProductos arbolProductos = new ArbolProductos();

    try {
        // Leer clientes
        BufferedReader brClientes = new BufferedReader(new FileReader("C:\\Maraton APOO\\Datos_Iniciales\\MP APOO NVL2 CLIENTES.txt"));
        String linea;
        while ((linea = brClientes.readLine()) != null) {
            String[] datos = linea.split("\\*");
            if (datos.length == 6) {
                Cliente c = new Cliente(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                arbolClientes.insertar(c);
            } else {
                System.out.println("Error al cargar cliente: " + linea + " - Formato incorrecto");
                return;
            }
        }
        brClientes.close();

        // Leer productos
        BufferedReader brProductos = new BufferedReader(new FileReader("C:\\Maraton APOO\\Datos_Iniciales\\MP APOO NVL2 PRODUCTOS.txt"));
        while ((linea = brProductos.readLine()) != null) {
            String[] datos = linea.split("\\*");
            if (datos.length == 3) {
                Producto p = new Producto(datos[0], datos[1], Double.parseDouble(datos[2]));
                arbolProductos.insertar(p);
            } else {
                System.out.println("Error al cargar producto: " + linea + " - Formato incorrecto");
                return;
            }
        }
        brProductos.close();

        // Obtener listas completas
        List<Cliente> todosClientes = arbolClientes.obtenerTodos();
        List<Producto> todosProductos = arbolProductos.obtenerTodos();

        for (Cliente cliente : todosClientes) {
            Venta venta = new Venta(cliente);

            // Seleccionar productos (puedes ajustar esta lógica si quieres variedad)
            if (todosProductos.size() >= 2) {
                venta.agregarProducto(todosProductos.get(0), 2);
                venta.agregarProducto(todosProductos.get(1), 1);
            } else {
                for (Producto producto : todosProductos) {
                    venta.agregarProducto(producto, 1);
                }
            }

            venta.generarArchivo();
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}