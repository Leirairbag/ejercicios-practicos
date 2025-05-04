/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadejercicio7;

/**
 *
 * @author gabri
 */
public class SumaDigitios {
    public static int sumaDigitos(int n) {
    if (n < 10) return n;
    return (n % 10) + sumaDigitos(n / 10);
    }
}
