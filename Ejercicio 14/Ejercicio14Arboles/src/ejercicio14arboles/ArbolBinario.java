/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14arboles;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
 Nodo raiz;

    // Insertar en ABB
    public Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) return new Nodo(valor);
        if (valor < nodo.valor) nodo.izquierdo = insertar(nodo.izquierdo, valor);
        else nodo.derecho = insertar(nodo.derecho, valor);
        return nodo;
    }

    // Buscar y guardar el camino hacia el valor
    public boolean buscarCamino(Nodo nodo, int objetivo, ArrayList<Integer> camino) {
        if (nodo == null) return false;

        camino.add(nodo.valor); // Agrega al camino

        if (nodo.valor == objetivo) {
            return true;
        }

        // Buscar en la izquierda o derecha
        if ((objetivo < nodo.valor && buscarCamino(nodo.izquierdo, objetivo, camino)) ||
            (objetivo > nodo.valor && buscarCamino(nodo.derecho, objetivo, camino))) {
            return true;
        }

        // Si no lo encuentra, retrocede
        camino.remove(camino.size() - 1);
        return false;
    }
}
