/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6supermercado;

/**
 *
 * @author gabri
 */
public class ListaEnlazada {
    private Nodo cabeza;

    public void insertarAlFinal(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void imprimirTicket() {
        System.out.println("************* CANTIDAD **** PRECIO **** TOTAL *************");
        Nodo actual = cabeza;
        double totalFinal = 0;

        while (actual != null) {
            Producto p = actual.producto;
            double totalProducto = p.obtenerTotal();
            System.out.printf("%-12s %10d %10.2f %10.2f\n", p.nombre, p.cantidad, p.precio, totalProducto);
            totalFinal += totalProducto;
            actual = actual.siguiente;
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("PRECIO FINAL: %38.2f\n", totalFinal);
    }
}
