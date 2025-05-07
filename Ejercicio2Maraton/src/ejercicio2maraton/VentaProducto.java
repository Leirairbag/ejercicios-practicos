/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2maraton;

/**
 *
 * @author gabri
 */
public class VentaProducto {
Producto producto;
    int cantidad;

    public VentaProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return producto.getPrecioSinIva() * cantidad;
    }

    public double getIva() {
        return (producto.precioConIva - producto.getPrecioSinIva()) * cantidad;
    }

    public double getTotal() {
        return producto.precioConIva * cantidad;
    }
}

