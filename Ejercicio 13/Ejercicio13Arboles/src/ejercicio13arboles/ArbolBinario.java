/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13arboles;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
Nodo raiz;

    // Método para insertar nodos en el árbol (estilo ABB)
    public Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } else {
            nodo.derecho = insertar(nodo.derecho, valor);
        }

        return nodo;
    }

    // Método que guarda los nodos entre min y max en la lista
    public void guardarEnRango(Nodo nodo, int min, int max, ArrayList<Integer> lista) {
        if (nodo == null) return;

        if (nodo.valor > min) {
            guardarEnRango(nodo.izquierdo, min, max, lista);
        }

        if (nodo.valor >= min && nodo.valor <= max) {
            lista.add(nodo.valor);
        }

        if (nodo.valor < max) {
            guardarEnRango(nodo.derecho, min, max, lista);
        }
    }
}
