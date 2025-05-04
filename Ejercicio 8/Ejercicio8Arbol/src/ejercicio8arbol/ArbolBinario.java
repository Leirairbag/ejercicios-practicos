/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8arbol;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
     Nodo raiz;

    // Método para contar las hojas
    public int contarHojas(Nodo nodo) {
        // Caso base: si el nodo es nulo, no hay hojas
        if (nodo == null) {
            return 0;
        }

        // Si el nodo es una hoja (no tiene hijos), contar 1
        if (nodo.izquierdo == null && nodo.derecho == null) {
            return 1;
        }

        // Si no es hoja, recorrer ambos subárboles
        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    // Método auxiliar para empezar desde la raíz
    public int contarHojas() {
        return contarHojas(raiz);
    }
}
