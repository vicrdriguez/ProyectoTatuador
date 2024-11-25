
package Modelo;

/**
 *
 * @author Kevin
 */
public class Tatuador {
    
    private int num_tatuador;
    private String rut_tatuador, nom_tatuador, ap_tatuador;
    private String correo_tatuador;
    private int fono_tatuador;
    private boolean disponibilidad;

    public Tatuador() {
    }

    public Tatuador(int num_tatuador, String rut_tatuador, String nom_tatuador, String ap_tatuador, String correo_tatuador, int fono_tatuador, boolean disponibilidad) {
        this.num_tatuador = num_tatuador;
        this.rut_tatuador = rut_tatuador;
        this.nom_tatuador = nom_tatuador;
        this.ap_tatuador = ap_tatuador;
        this.correo_tatuador = correo_tatuador;
        this.fono_tatuador = fono_tatuador;
        this.disponibilidad = disponibilidad;
    }

    public int getNum_tatuador() {
        return num_tatuador;
    }

    public void setNum_tatuador(int num_tatuador) {
        this.num_tatuador = num_tatuador;
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

    public int getFono_tatuador() {
        return fono_tatuador;
    }

    public void setFono_tatuador(int fono_tatuador) {
        this.fono_tatuador = fono_tatuador;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Tatuador{" + "num_tatuador=" + num_tatuador + ", rut_tatuador=" + rut_tatuador + ", nom_tatuador=" + nom_tatuador + ", ap_tatuador=" + ap_tatuador + ", correo_tatuador=" + correo_tatuador + ", fono_tatuador=" + fono_tatuador + ", disponibilidad=" + disponibilidad + '}';
    }
}
