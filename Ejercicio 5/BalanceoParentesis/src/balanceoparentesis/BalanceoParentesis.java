/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balanceoparentesis;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class BalanceoParentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una expresión con paréntesis:");
        String expresion = scanner.nextLine();

        if (verificarBalanceo(expresion)) {
            System.out.println("El uso de paréntesis es CORRECTO.");
        } else {
            System.out.println("El uso de paréntesis es INCORRECTO.");
        }
    }

    public static boolean verificarBalanceo(String cadena) {
        Pila pila = new Pila();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.agregar(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;
                char tope = pila.sacar();
                if (!esParentesisCompatible(tope, c)) return false;
            }
        }

        return pila.isEmpty();
    }

    public static boolean esParentesisCompatible(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']') ||
               (apertura == '{' && cierre == '}');
    }
}
