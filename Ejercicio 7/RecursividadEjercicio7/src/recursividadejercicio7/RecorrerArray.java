/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadejercicio7;

/**
 *
 * @author gabri
 */
public class RecorrerArray {
 public static void recorrerArray(int[] arr, int i) {
    if (i >= arr.length) return;
    System.out.println(arr[i]);
    recorrerArray(arr, i + 1);
    }
}
