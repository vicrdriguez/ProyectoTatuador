
package Modelo;

/**
 *
 * @author Vicente, Kevin
 */
public class Cliente {
    
    private int num_cliente;
    private String rut_cliente, nom_cliente, ap_cliente;
    private String fono_cliente, correo_cliente;

    public Cliente() {
    }

    public Cliente(int num_cliente, String rut_cliente, String nom_cliente, String ap_cliente, String fono_cliente, String correo_cliente) {
        this.num_cliente = num_cliente;
        this.rut_cliente = rut_cliente;
        this.nom_cliente = nom_cliente;
        this.ap_cliente = ap_cliente;
        this.fono_cliente = fono_cliente;
        this.correo_cliente = correo_cliente;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getAp_cliente() {
        return ap_cliente;
    }

    public void setAp_cliente(String ap_cliente) {
        this.ap_cliente = ap_cliente;
    }

    public String getFono_cliente() {
        return fono_cliente;
    }

    public void setFono_cliente(String fono_cliente) {
        this.fono_cliente = fono_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }
    
    /*
    @Override
    public String toString() {
        return "Cliente{" + "num_cliente=" + num_cliente + ", rut_cliente=" + rut_cliente + ", nom_cliente=" + nom_cliente + ", ap_cliente=" + ap_cliente + ", fono_cliente=" + fono_cliente + ", correo_cliente=" + correo_cliente + '}';
    }
    */
}
