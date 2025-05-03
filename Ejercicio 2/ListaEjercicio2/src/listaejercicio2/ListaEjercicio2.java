/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaejercicio2;

import java.util.Random;

/**
 *
 * @author gabri
 */
public class ListaEjercicio2 {

     public static void main(String[] args) {
        Lista lista = new Lista();
        Random rand = new Random();

        // Insertar 25 enteros aleatorios entre 0 y 100
        for (int i = 0; i < 25; i++) {
            int numero = rand.nextInt(101); // 0 a 100
            lista.insertarAlFinal(numero);
        }

        System.out.println("Lista generada:");
        lista.imprimirLista();

        int suma = lista.calcularSuma();
        int total = lista.contarElementos();
        double media = (double) suma / total;

        System.out.println("Suma de elementos: " + suma);
        System.out.println("Media: " + media);
    }
}
