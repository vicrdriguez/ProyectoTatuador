
package Controlador;

import Modelo.Cliente;
import ConexionBD.Conexion;
import Modelo.Tatuador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

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
            
            //Consulta de base de dato
            String consulta = "INSERT INTO Cliente(rut_cliente, nom_cliente, ap_cliente, fono_cliente, correo_cliente) VALUES(?,?,?,?,?);";
            PreparedStatement stmt = cnx.prepareStatement(consulta);
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
    
    public ArrayList<Cliente> ListarCliente()
    {
        ArrayList<Cliente> lista = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM proyectotatuador.cliente;";
            PreparedStatement stmt = cnx.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Cliente cli = new Cliente();
                cli.setNum_cliente(rs.getInt("num_cliente"));
                cli.setNom_cliente(rs.getString("nom_cliente"));
                cli.setAp_cliente(rs.getString("ap_cliente"));
                cli.setRut_cliente(rs.getString("rut_cliente"));
                cli.setFono_cliente(rs.getInt("fono_cliente"));
                cli.setCorreo_cliente(rs.getString("correo_cliente"));
                
                lista.add(cli);
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para revisar las reservas" + e.getMessage());
        }
        return lista;   
    }
    
    public boolean eliminarCliente(int num_cliente)
    {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM proyectoTatuador.Cliente WHERE num_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setInt(1, num_cliente);

            stmt.executeUpdate();
            stmt.close();
            cnx.close(); 

            return true;
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al cancelar reserva" + e.getMessage());
            return false; 
        }
        catch (Exception e) {
            System.out.println("Error en el metodo cancelar reserva" + e.getMessage());  
            return false; 
        }
    }  
    public boolean AgregarTatuador(Tatuador tatuador)
    {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            //Consulta de base de dato
            String consulta = "INSERT INTO Tatuador(rut_Tatuador, nom_tatuador, ap_tatuador, correo_tatuador, fono_tatuador) VALUES(?,?,?,?,?);";
            PreparedStatement stmt = cnx.prepareStatement(consulta);
            stmt.setString(1, tatuador.getRut_tatuador());
            stmt.setString(2, tatuador.getNom_tatuador());
            stmt.setString(3, tatuador.getAp_tatuador());
            stmt.setString(4, tatuador.getCorreo_tatuador());
            stmt.setInt(5, tatuador.getFono_tatuador());
            
            stmt.executeUpdate(); //el update cambia el estado de la tabla
            stmt.close(); // cierras el camino
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para insertar datos" + e.getMessage());
            return false;
        }
    }
}