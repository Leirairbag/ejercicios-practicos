/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2maraton;

/**
 *
 * @author gabri
 */
public class Producto {
   String codigo, nombre;
    double precioConIva;

    public Producto(String codigo, String nombre, double precioConIva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioConIva = precioConIva;
    }

    public double getPrecioSinIva() {
        return precioConIva / 1.19;
    }
}