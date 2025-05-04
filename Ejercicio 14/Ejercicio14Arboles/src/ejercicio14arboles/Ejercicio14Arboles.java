/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14arboles;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Ejercicio14Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArbolBinario arbol = new ArbolBinario();
        int[] valores = {20, 10, 30, 5, 15, 25, 35};
        for (int val : valores) {
            arbol.raiz = arbol.insertar(arbol.raiz, val);
        }

        int numeroBuscado = 15;
        ArrayList<Integer> camino = new ArrayList<>();
        boolean encontrado = arbol.buscarCamino(arbol.raiz, numeroBuscado, camino);

        if (encontrado) {
            System.out.println("Camino hacia " + numeroBuscado + ": " + camino);
            System.out.println("Longitud del camino: " + (camino.size() - 1));
        } else {
            System.out.println("Número no encontrado en el árbol.");
        }
    }
}
