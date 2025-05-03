/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaejercicio3;

/**
 *
 * @author gabri
 */
public class ListaEjercicio3 {

  public static void main(String[] args) {
        ListaEnlazada listaOriginal = new ListaEnlazada();

        // Insertamos 10 caracteres en la lista original
        listaOriginal.insertarAlFinal('a');
        listaOriginal.insertarAlFinal('b');
        listaOriginal.insertarAlFinal('c');
        listaOriginal.insertarAlFinal('d');
        listaOriginal.insertarAlFinal('e');
        listaOriginal.insertarAlFinal('f');
        listaOriginal.insertarAlFinal('g');
        listaOriginal.insertarAlFinal('h');
        listaOriginal.insertarAlFinal('i');
        listaOriginal.insertarAlFinal('j');

        // Imprimimos la lista original
        System.out.println("Lista Original:");
        listaOriginal.imprimirLista();

        // Creamos una copia de la lista en orden inverso
        ListaEnlazada listaInvertida = listaOriginal.copiarInvertido();

        // Imprimimos la lista invertida
        System.out.println("Lista Invertida:");
        listaInvertida.imprimirLista();
    }
}
