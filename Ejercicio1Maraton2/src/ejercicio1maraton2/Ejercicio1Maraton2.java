/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1maraton2;
import java.io.*;
/**
 *
 * @author gabri
 */
public class Ejercicio1Maraton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String rutaEntrada = "C:\\Maraton APOO\\MP_APOO NVL1.txt";
        String rutaSalida = "C:\\Maraton APOO\\MP_APOO_NVL1_RESP.txt";

        ListaEnlazada listaLineas = new ListaEnlazada();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaEntrada))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listaLineas.agregar(linea.trim().replace(" ", "")); // quitar espacios
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaSalida))) {
            Nodo actual = listaLineas.cabeza;
            while (actual != null) {
                String resultado = procesarLinea(actual.linea);
                bw.write(resultado);
                bw.newLine();
                actual = actual.siguiente;
            }
        } catch (IOException e) {
            System.out.println("Error escribiendo el archivo de salida: " + e.getMessage());
        }
    }

    static String procesarLinea(String linea) {
        if (linea.startsWith("1.") && linea.contains("F(") && linea.endsWith(")")) {
            try {
                int n = Integer.parseInt(linea.substring(linea.indexOf("(") + 1, linea.indexOf(")")));
                if (n < 0) return "RESP. [Error: número negativo no permitido]";
                StringBuilder sb = new StringBuilder("RESP. ");
                for (int i = 0; i <= n; i++) {
                    sb.append(fibonacci(i));
                    if (i != n) sb.append(", ");
                }
                return sb.toString();
            } catch (Exception e) {
                return "RESP. [Error: formato inválido en ejercicio 1]";
            }
        }

        if (linea.startsWith("2.") && linea.contains("B=") && linea.contains("E=")) {
            try {
                int base = Integer.parseInt(linea.substring(linea.indexOf("B=") + 2, linea.indexOf(":E=")));
                int exp = Integer.parseInt(linea.substring(linea.indexOf("E=") + 2));
                if (base < 0 || exp < 0) return "RESP. [Error: número negativo no permitido]";
                return "RESP. " + potencia(base, exp);
            } catch (Exception e) {
                return "RESP. [Error: formato inválido en ejercicio 2]";
            }
        }

        if (linea.startsWith("3.") && linea.contains("B=") && linea.contains("A=")) {
            try {
                int base = Integer.parseInt(linea.substring(linea.indexOf("B=") + 2, linea.indexOf(":A=")));
                int altura = Integer.parseInt(linea.substring(linea.indexOf("A=") + 2));
                if (base < 0 || altura < 0) return "RESP. [Error: número negativo no permitido]";
                StringBuilder sb = new StringBuilder("RESP.\n");
                for (int i = 0; i < altura; i++) {
                    sb.append("*".repeat(base)).append("\n");
                }
                return sb.toString().trim();
            } catch (Exception e) {
                return "RESP. [Error: formato inválido en ejercicio 3]";
            }
        }

        return "RESP. [Error: formato no reconocido]";
    }

    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }
}
