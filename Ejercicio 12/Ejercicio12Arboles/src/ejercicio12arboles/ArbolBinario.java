/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12arboles;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
  Nodo raiz;

    // Método recursivo para calcular el peso total (cantidad de nodos)
    public int calcularPeso(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        // Cuenta el nodo actual + nodos del subárbol izquierdo + nodos del subárbol derecho
        return 1 + calcularPeso(nodo.izquierdo) + calcularPeso(nodo.derecho);
    }
}
