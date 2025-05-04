/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadejercicio7;

/**
 *
 * @author gabri
 */
public class SumaHastaN {
    public static int sumaHastaN(int n) {
    if (n <= 1) return n;
    return n + sumaHastaN(n - 1);
    }
}
