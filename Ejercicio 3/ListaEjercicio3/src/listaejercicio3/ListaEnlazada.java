/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaejercicio3;

/**
 *
 * @author gabri
 */
class ListaEnlazada {
    Nodo cabeza;

    // Constructor
    public ListaEnlazada() {
        cabeza = null;
    }

    // Método para insertar un nuevo nodo al final de la lista
    public void insertarAlFinal(char data) {
        Nodo nuevoNodo = new Nodo(data);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    // Método para copiar la lista en el orden inverso
    public ListaEnlazada copiarInvertido() {
        ListaEnlazada nuevaLista = new ListaEnlazada();
        Nodo temp = cabeza;
        while (temp != null) {
            nuevaLista.insertarAlFrente(temp.data);
            temp = temp.siguiente;
        }
        return nuevaLista;
    }

    // Método para insertar al frente (para invertir la lista)
    public void insertarAlFrente(char data) {
        Nodo nuevoNodo = new Nodo(data);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }
}
