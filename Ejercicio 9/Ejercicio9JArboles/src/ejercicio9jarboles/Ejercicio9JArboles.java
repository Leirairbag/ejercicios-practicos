/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9jarboles;

/**
 *
 * @author gabri
 */
public class Ejercicio9JArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArbolBinario arbol = new ArbolBinario();
        arbol.raiz = new Nodo(1);
        arbol.raiz.izquierdo = new Nodo(2);
        arbol.raiz.derecho = new Nodo(3);
        arbol.raiz.izquierdo.izquierdo = new Nodo(4);
        arbol.raiz.izquierdo.derecho = new Nodo(5);

        // Contar los nodos interiores
        System.out.println("Número de nodos interiores: " + arbol.contarNodosInteriores());
    }
}
