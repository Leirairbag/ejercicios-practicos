/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9jarboles;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
 Nodo raiz;

    // Método recursivo para calcular el número de nodos interiores
    public int contarNodosInteriores(Nodo nodo) {
        // Si el nodo es null, no hay nodos interiores
        if (nodo == null) {
            return 0;
        }

        // Si el nodo tiene al menos un hijo, es un nodo interior
        if (nodo.izquierdo != null || nodo.derecho != null) {
            return 1 + contarNodosInteriores(nodo.izquierdo) + contarNodosInteriores(nodo.derecho);
        }

        // Si no tiene hijos, no es un nodo interior
        return 0;
    }

    // Método para iniciar el conteo desde la raíz
    public int contarNodosInteriores() {
        return contarNodosInteriores(raiz);
    }
}

