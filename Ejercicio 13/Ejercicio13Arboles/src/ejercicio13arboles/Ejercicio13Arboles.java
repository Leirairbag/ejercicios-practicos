/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13arboles;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Ejercicio13Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        // Insertar nodos en el árbol
        int[] valores = {20, 10, 30, 5, 15, 25, 35, 3, 7, 13, 17};
        for (int val : valores) {
            arbol.raiz = arbol.insertar(arbol.raiz, val);
        }

        // Guardar e imprimir los nodos entre 10 y 25
        ArrayList<Integer> nodosEnRango = new ArrayList<>();
        arbol.guardarEnRango(arbol.raiz, 10, 25, nodosEnRango);

        System.out.println("Nodos entre 10 y 25:");
        for (int num : nodosEnRango) {
            System.out.print(num + " ");
        }
    }
}