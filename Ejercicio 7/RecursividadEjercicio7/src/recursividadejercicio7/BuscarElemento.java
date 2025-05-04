/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadejercicio7;

/**
 *
 * @author gabri
 */
public class BuscarElemento {
 public static boolean buscarElemento(int[] arr, int i, int objetivo) {
    if (i >= arr.length) return false;
    if (arr[i] == objetivo) return true;
    return buscarElemento(arr, i + 1, objetivo);
    }
}