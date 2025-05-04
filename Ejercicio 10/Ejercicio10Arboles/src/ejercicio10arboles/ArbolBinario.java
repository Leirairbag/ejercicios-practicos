/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10arboles;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
Nodo raiz;

    public void nodosPorNivel() {
        if (raiz == null) return;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        int nivel = 0;

        while (!cola.isEmpty()) {
            int cantidadEnNivel = cola.size();
            System.out.println("Nivel " + nivel + ": " + cantidadEnNivel + " nodos");

            for (int i = 0; i < cantidadEnNivel; i++) {
                Nodo actual = cola.poll();
                if (actual.izquierdo != null) cola.add(actual.izquierdo);
                if (actual.derecho != null) cola.add(actual.derecho);
            }
            nivel++;
        }
    }
}