/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class Tatuador {
    
    private String rut_tatuador, nom_tatuador, ap_tatuador;
    private String correo_tatuador, fono_tatuador;
    private boolean disponibilidad;

    public Tatuador() {
    }

    public Tatuador(String rut_tatuador, String nom_tatuador, String ap_tatuador, String correo_tatuador, String fono_tatuador, boolean disponibilidad) {
        this.rut_tatuador = rut_tatuador;
        this.nom_tatuador = nom_tatuador;
        this.ap_tatuador = ap_tatuador;
        this.correo_tatuador = correo_tatuador;
        this.fono_tatuador = fono_tatuador;
        this.disponibilidad = disponibilidad;
    }

    public String getRut_tatuador() {
        return rut_tatuador;
    }

    public void setRut_tatuador(String rut_tatuador) {
        this.rut_tatuador = rut_tatuador;
    }

    public String getNom_tatuador() {
        return nom_tatuador;
    }

    public void setNom_tatuador(String nom_tatuador) {
        this.nom_tatuador = nom_tatuador;
    }

    public String getAp_tatuador() {
        return ap_tatuador;
    }

    public void setAp_tatuador(String ap_tatuador) {
        this.ap_tatuador = ap_tatuador;
    }

    public String getCorreo_tatuador() {
        return correo_tatuador;
    }

    public void setCorreo_tatuador(String correo_tatuador) {
        this.correo_tatuador = correo_tatuador;
    }

    public String getFono_tatuador() {
        return fono_tatuador;
    }

    public void setFono_tatuador(String fono_tatuador) {
        this.fono_tatuador = fono_tatuador;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    /*
    @Override
    public String toString() {
        return "Tatuador{" + "rut_tatuador=" + rut_tatuador + ", nom_tatuador=" + nom_tatuador + ", ap_tatuador=" + ap_tatuador + ", correo_tatuador=" + correo_tatuador + ", fono_tatuador=" + fono_tatuador + ", disponibilidad=" + disponibilidad + '}';
    }
    */
}
