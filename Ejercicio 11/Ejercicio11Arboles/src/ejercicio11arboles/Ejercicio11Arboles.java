/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11arboles;

/**
 *
 * @author gabri
 */
public class Ejercicio11Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArbolBinario arbol = new ArbolBinario();

        // Construcción de un árbol binario de ejemplo
        arbol.raiz = new Nodo(1);
        arbol.raiz.izquierdo = new Nodo(2);
        arbol.raiz.derecho = new Nodo(3);
        arbol.raiz.izquierdo.izquierdo = new Nodo(4);
        arbol.raiz.izquierdo.derecho = new Nodo(5);
        arbol.raiz.derecho.derecho = new Nodo(6);

        int altura = arbol.calcularAltura(arbol.raiz);
        System.out.println("Altura del árbol: " + altura);
    }
}
