/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2maraton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class ArbolProductos {
  NodoProducto raiz;

    public void insertar(Producto producto) {
        raiz = insertarRec(raiz, producto);
    }

    private NodoProducto insertarRec(NodoProducto nodo, Producto producto) {
        if (nodo == null) return new NodoProducto(producto);
        if (producto.codigo.compareTo(nodo.producto.codigo) < 0)
            nodo.izquierdo = insertarRec(nodo.izquierdo, producto);
        else
            nodo.derecho = insertarRec(nodo.derecho, producto);
        return nodo;
    }

    public Producto buscar(String codigo) {
        return buscarRec(raiz, codigo);
    }

    private Producto buscarRec(NodoProducto nodo, String codigo) {
        if (nodo == null) return null;
        if (nodo.producto.codigo.equals(codigo)) return nodo.producto;
        if (codigo.compareTo(nodo.producto.codigo) < 0)
            return buscarRec(nodo.izquierdo, codigo);
        else
            return buscarRec(nodo.derecho, codigo);
    }
    public List<Producto> obtenerTodos() {
    List<Producto> lista = new ArrayList<>();
    inOrden(raiz, lista);
    return lista;
}

private void inOrden(NodoProducto nodo, List<Producto> lista) {
    if (nodo != null) {
        inOrden(nodo.izquierdo, lista);
        lista.add(nodo.producto);
        inOrden(nodo.derecho, lista);
    }
}
}
