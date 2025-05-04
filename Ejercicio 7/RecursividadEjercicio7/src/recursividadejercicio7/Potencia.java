/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadejercicio7;

/**
 *
 * @author gabri
 */
public class Potencia {
   public static double potencia(double base, int exponente) {
    if (exponente == 0) return 1;
    if (exponente > 0) return base * potencia(base, exponente - 1);
    else return 1 / potencia(base, -exponente);
    } 
}
