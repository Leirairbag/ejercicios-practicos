/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1maraton2;

/**
 *
 * @author gabri
 */
public class Operaciones {
  public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * potencia(base, exponente - 1);
    }

    public static String rectangulo(int base, int altura) {
        if (base <= 0 || altura <= 0) return "";
        return rectanguloRec(base, altura, "");
    }

    private static String rectanguloRec(int base, int altura, String resultado) {
        if (altura == 0) return resultado;
        resultado += "*".repeat(base) + "\n";
        return rectanguloRec(base, altura - 1, resultado);
    }
}
