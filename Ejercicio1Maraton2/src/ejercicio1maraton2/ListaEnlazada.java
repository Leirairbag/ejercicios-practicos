/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1maraton2;

/**
 *
 * @author gabri
 */
public class ListaEnlazada {
    Nodo cabeza;

    public void agregar(String linea) {
        Nodo nuevo = new Nodo(linea);
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

    public Nodo getCabeza() {
        return cabeza;
    }
}
