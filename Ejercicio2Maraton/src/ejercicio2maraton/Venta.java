/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2maraton;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
/**
 *
 * @author gabri
 */
public class Venta {
 static int contador = 1;
    String numero;
    LocalDateTime fecha;
    Cliente cliente;
    List<VentaProducto> productos;

    public Venta(Cliente cliente) {
        this.numero = String.format("VEN%03d", contador++);
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.add(new VentaProducto(producto, cantidad));
    }

    public double calcularSubtotal() {
        return productos.stream().mapToDouble(VentaProducto::getSubtotal).sum();
    }

    public double calcularIva() {
        return productos.stream().mapToDouble(VentaProducto::getIva).sum();
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(VentaProducto::getTotal).sum();
    }

    public void generarArchivo() throws IOException {
        File dir = new File("C:\\Maraton APOO\\Ventas");
        dir.mkdirs();
        FileWriter writer = new FileWriter(new File(dir, numero + ".txt"));

        writer.write("EMPRESA: SuperTienda S.A.\n");
        writer.write("NIT: 900123456-7\n\n");

        writer.write("Numero de Venta: " + numero + "\n");
        writer.write("Fecha: " + fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n\n");

        writer.write("Cliente: " + cliente.getNombreCompleto() + "\n");
        writer.write("ID: " + cliente.identificacion + " - " + cliente.tipoIdentificacion + "\n");
        writer.write("Telefono: " + cliente.telefono + "\n");
        writer.write("Correo: " + cliente.correo + "\n\n");

        writer.write("Productos:\n");
        for (VentaProducto vp : productos) {
            writer.write("- " + vp.producto.codigo + " " + vp.producto.nombre + ": $" + String.format("%.2f", vp.producto.getPrecioSinIva()) + " x" + vp.cantidad + "\n");
        }

        writer.write("\nSubtotal: $" + String.format("%.2f", calcularSubtotal()) + "\n");
        writer.write("IVA: $" + String.format("%.2f", calcularIva()) + "\n");
        writer.write("Total: $" + String.format("%.2f", calcularTotal()) + "\n\n");

        writer.write("Factura generada por SistemaVentas - UT\n");
        writer.close();
    }
}