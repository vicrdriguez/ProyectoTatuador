/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Date;

/**
 *
 * @author LiuCho
 */
public class Sesion {
    String Tatutador,local;
    int Valor, tamaño, tiempo_estimado;
    Date fecha;

    public Sesion() {
    }

    public Sesion(String Tatutador, String local, int Valor, int tamaño, int tiempo_estimado, Date fecha) {
        this.Tatutador = Tatutador;
        this.local = local;
        this.Valor = Valor;
        this.tamaño = tamaño;
        this.tiempo_estimado = tiempo_estimado;
        this.fecha = fecha;
    }

    public String getTatutador() {
        return Tatutador;
    }

    public void setTatutador(String Tatutador) {
        this.Tatutador = Tatutador;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTiempo_stimadas() {
        return tiempo_estimado;
    }

    public void setTiempo_stimadas(int tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Sesion{" + "Tatutador=" + Tatutador + ", local=" + local + ", Valor=" + Valor + ", tama\u00f1o=" + tamaño + ", tiempo_stimadas=" + tiempo_estimado + ", fecha=" + fecha + '}';
    }
    
}

