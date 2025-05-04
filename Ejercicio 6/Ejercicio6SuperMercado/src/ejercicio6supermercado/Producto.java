/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6supermercado;

/**
 *
 * @author gabri
 */
public class Producto {
    String nombre;
    int cantidad;
    double precio; // precio unitario (con impuestos)

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double obtenerTotal() {
        return cantidad * precio;
    }
}
