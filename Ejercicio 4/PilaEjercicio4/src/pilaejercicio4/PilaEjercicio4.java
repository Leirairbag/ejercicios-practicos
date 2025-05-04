/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaejercicio4;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class PilaEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String entrada = scanner.nextLine();

        // Paso 1: Limpiar la cadena (eliminar espacios y signos de puntuación, convertir a minúsculas)
        String limpia = entrada.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Pila pila = new Pila();

        int longitud = limpia.length();
        int mitad = longitud / 2;

        // Paso 2: Agregar la primera mitad a la pila
        for (int i = 0; i < mitad; i++) {
            pila.agregar(limpia.charAt(i));
        }

        // Paso 3: Si la longitud es impar, saltamos el carácter del medio
        int inicioSegundaMitad = (longitud % 2 == 0) ? mitad : mitad + 1;

        // Paso 4: Comparar la segunda mitad con lo que se saca de la pila
        boolean esPalindromo = true;
        for (int i = inicioSegundaMitad; i < longitud; i++) {
            if (pila.sacar() != limpia.charAt(i)) {
                esPalindromo = false;
                break;
            }
        }

        // Resultado
        if (esPalindromo) {
            System.out.println("La cadena SÍ es un palíndromo.");
        } else {
            System.out.println("La cadena NO es un palíndromo.");
        }
    }
}
