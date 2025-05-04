/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balanceoparentesis;

/**
 *
 * @author gabri
 */
public class Pila {
private Nodo tope;

    public Pila() {
        tope = null;
    }

    public void agregar(char valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public char sacar() {
        if (isEmpty()) {
            throw new IllegalStateException("Pila vacía");
        }
        char valor = tope.valor;
        tope = tope.siguiente;
        return valor;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public char verTope() {
        if (isEmpty()) {
            throw new IllegalStateException("Pila vacía");
        }
        return tope.valor;
    }
}
