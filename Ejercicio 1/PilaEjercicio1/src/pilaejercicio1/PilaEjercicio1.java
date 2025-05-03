/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaejercicio1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class PilaEjercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        // Guardar cada letra en la pila
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        // Sacar las letras para invertir la palabra
        System.out.print("Palabra invertida: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
            
        }
        System.out.println();
    }
}

