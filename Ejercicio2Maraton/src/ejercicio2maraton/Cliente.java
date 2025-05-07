/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2maraton;

/**
 *
 * @author gabri
 */
public class Cliente {
   String identificacion, tipoIdentificacion, nombres, apellidos, telefono, correo;

    public Cliente(String identificacion, String tipoIdentificacion, String nombres, String apellidos, String telefono, String correo) {
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }
}

