/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.Date;

/**
 *
 * @author Vicente
 */
public class Cliente {
    public String nombre;
    public String Apellido;
    public String rut;
    public Date diaAgendar;

    public Cliente() {
    }

    public Cliente(String nombre, String Apellido, String rut, Date diaAgendar) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.rut = rut;
        this.diaAgendar = diaAgendar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getDiaAgendar() {
        return diaAgendar;
    }

    public void setDiaAgendar(Date diaAgendar) {
        this.diaAgendar = diaAgendar;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", rut=" + rut + ", diaAgendar=" + diaAgendar + '}';
    }


       
    
    
    
    
    
    
}
