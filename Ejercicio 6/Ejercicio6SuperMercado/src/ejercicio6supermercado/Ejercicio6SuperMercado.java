/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6supermercado;

import java.util.Random;

/**
 *
 * @author gabri
 */
public class Ejercicio6SuperMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ListaEnlazada lista = new ListaEnlazada();
        Random rand = new Random();

        int cantidadProductos = rand.nextInt(8) + 1;

        for (int i = 1; i <= cantidadProductos; i++) {
            String nombre = "Producto" + i;
            int cantidad = rand.nextInt(10) + 1; // 1 a 10
            double precio = Math.round((rand.nextDouble() * 20 + 1) * 100.0) / 100.0; // 1.00 a 21.00
            Producto producto = new Producto(nombre, cantidad, precio);
            lista.insertarAlFinal(producto);
        }

        lista.imprimirTicket();
    }
}
