/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11arboles;

/**
 *
 * @author gabri
 */
public class ArbolBinario {
      Nodo raiz;

    // Método recursivo para calcular la altura del árbol
    public int calcularAltura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = calcularAltura(nodo.izquierdo);
        int alturaDerecha = calcularAltura(nodo.derecho);

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }
}
