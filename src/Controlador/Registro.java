
package Controlador;

import Modelo.Cliente;
import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ignacio, Kevin
 */
public class Registro { //vamos hacer el CRUD
    
    public boolean agregarCliente(Cliente cli)
    {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSERT INTO Cliente(rut_cliente, nom_cliente, ap_cliente, fono_cliente, correo_cliente) VALUES(?,?,?,?,?);";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cli.getRut_cliente());
            stmt.setString(2, cli.getNom_cliente());
            stmt.setString(3, cli.getAp_cliente());
            stmt.setInt(4, cli.getFono_cliente());
            stmt.setString(5, cli.getCorreo_cliente());
            
            stmt.executeUpdate(); //el update cambia el estado de la tabla
            stmt.close(); // cierras el camino
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para insertar datos" + e.getMessage());
            return false;
        }
    }
    /*
    public boolean agregar(Cliente cliente)
    {
        try {
            Date date;
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            date = cliente.getDiaAgendar();
            //SQL
            String query = "INSERT INTO Cliente(nombre,apellido,rut,diaAgendar) VALUES(?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            //ahora le diremos los ?,?,?,?,?
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3,cliente.getRut());
            stmt.setDate(4, new java.sql.Date(date.getTime()));

            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al agregar cliente " + e.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método agregar cliente " + e.getMessage());
            return false;
        }
        
    }
    */
}