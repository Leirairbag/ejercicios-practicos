/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadejercicio7;

import java.util.Scanner;
import static recursividadejercicio7.BuscarElemento.buscarElemento;
import static recursividadejercicio7.Potencia.potencia;
import static recursividadejercicio7.RecorrerArray.recorrerArray;
import static recursividadejercicio7.SumaDigitios.sumaDigitos;
import static recursividadejercicio7.SumaHastaN.sumaHastaN;

/**
 *
 * @author gabri
 */
public class RecursividadEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // a. Sumar hasta N
    System.out.print("Ingrese N para la suma: ");
    int n = sc.nextInt();
    System.out.println("Suma recursiva: " + sumaHastaN(n));

    // b. Recorrer array
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Recorriendo array:");
    recorrerArray(arr, 0);

    // c. Buscar elemento
    System.out.print("Buscar número en array: ");
    int objetivo = sc.nextInt();
    System.out.println("¿Encontrado?: " + buscarElemento(arr, 0, objetivo));

    // d. Potencia
    System.out.print("Base: ");
    double base = sc.nextDouble();
    System.out.print("Exponente: ");
    int exp = sc.nextInt();
    System.out.println("Resultado: " + potencia(base, exp));

    // e. Suma de dígitos
    System.out.print("Número para sumar dígitos: ");
    int numero = sc.nextInt();
    System.out.println("Suma de dígitos: " + sumaDigitos(numero));
}
    }
    

