/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaejercicio1;

/**
 *
 * @author gabri
 */
public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    public void push(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(tope);
        tope = nuevo;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        Object dato = tope.getDato();
        tope = tope.getSiguiente();
        return dato;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return tope.getDato();
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void print() {
        Nodo actual = tope;
        System.out.println("Contenido de la pila:");
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
