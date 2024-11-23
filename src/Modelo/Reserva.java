
package Modelo;

import java.util.Date;

/**
 *
 * @author Kevin
 */
public class Reserva {
    
    private int id_reserva;
    private Date fecha, hora;
    private Cliente cliente;
    private Tatuador tatuador;

    public Reserva() {
    }

    public Reserva(int id_reserva, Date fecha, Date hora, Cliente cliente, Tatuador tatuador) {
        this.id_reserva = id_reserva;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.tatuador = tatuador;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tatuador getTatuador() {
        return tatuador;
    }

    public void setTatuador(Tatuador tatuador) {
        this.tatuador = tatuador;
    }
    
    @Override
    public String toString() {
        return "Reserva{" + "id_reserva=" + id_reserva + ", fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", tatuador=" + tatuador + '}';
    }
    
    //metodos para acceder a los atributos de cliente o tatuador a traves de los objetos
}
