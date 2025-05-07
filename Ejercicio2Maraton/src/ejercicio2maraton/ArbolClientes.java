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
public class ArbolClientes {
    NodoCliente raiz;

    public void insertar(Cliente cliente) {
        raiz = insertarRec(raiz, cliente);
    }

    private NodoCliente insertarRec(NodoCliente nodo, Cliente cliente) {
        if (nodo == null) return new NodoCliente(cliente);
        if (cliente.identificacion.compareTo(nodo.cliente.identificacion) < 0)
            nodo.izquierdo = insertarRec(nodo.izquierdo, cliente);
        else
            nodo.derecho = insertarRec(nodo.derecho, cliente);
        return nodo;
    }

    public Cliente buscar(String id) {
        return buscarRec(raiz, id);
    }

    private Cliente buscarRec(NodoCliente nodo, String id) {
        if (nodo == null) return null;
        if (nodo.cliente.identificacion.equals(id)) return nodo.cliente;
        if (id.compareTo(nodo.cliente.identificacion) < 0)
            return buscarRec(nodo.izquierdo, id);
        else
            return buscarRec(nodo.derecho, id);
    }
    public List<Cliente> obtenerTodos() {
    List<Cliente> lista = new ArrayList<>();
    inOrden(raiz, lista);
    return lista;
}

private void inOrden(NodoCliente nodo, List<Cliente> lista) {
    if (nodo != null) {
        inOrden(nodo.izquierdo, lista);
        lista.add(nodo.cliente);
        inOrden(nodo.derecho, lista);
    }
}
}
  