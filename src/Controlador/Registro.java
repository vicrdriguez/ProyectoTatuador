
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
    
    public boolean eliminarCliente(String rut_cliente)
    {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELETE FROM proyectoTatuador.Cliente WHERE rut_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);

            stmt.setString(1, rut_cliente);

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
    public boolean EliminarTatuador(String rut_tatuador)
    {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            //Consulta de base de dato
            String consulta = "DELETE FROM ProyectoTatuador.Tatuador WHERE rut_tatuador=?;";
            PreparedStatement stmt = cnx.prepareStatement(consulta);
            
            stmt.setString(1,rut_tatuador);
            
            stmt.executeUpdate(); //el update cambia el estado de la tabla
            stmt.close(); // cierras el camino
            cnx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar tatuador" + e.getMessage());
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

            String consulta = "INSERT INTO Tatuador(rut_Tatuador, nom_tatuador, ap_tatuador, correo_tatuador, fono_tatuador,disponibilidad) VALUES(?,?,?,?,?,?);";

            PreparedStatement stmt = cnx.prepareStatement(consulta);
            stmt.setString(1, tatuador.getRut_tatuador());
            stmt.setString(2, tatuador.getNom_tatuador());
            stmt.setString(3, tatuador.getAp_tatuador());
            stmt.setString(4, tatuador.getCorreo_tatuador());
            stmt.setInt(5, tatuador.getFono_tatuador());
            stmt.setBoolean(6, tatuador.isDisponibilidad());
            stmt.executeUpdate(); //el update cambia el estado de la tabla
            stmt.close(); // cierras el camino
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para insertar datos" + e.getMessage());
            return false;
        }
    }
    

    
    public ArrayList<Tatuador> ListarTatuador(){
        ArrayList<Tatuador> listaTatuador = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "SELECT * FROM proyectotatuador.tatuador;";
            PreparedStatement stmt = cnx.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Tatuador tat = new Tatuador();
                tat.setNum_tatuador(rs.getInt("num_tatuador"));
                tat.setRut_tatuador(rs.getString("rut_tatuador"));
                tat.setNom_tatuador(rs.getString("nom_tatuador"));
                tat.setAp_tatuador(rs.getString("ap_tatuador"));
                tat.setCorreo_tatuador(rs.getString("correo_tatuador"));
                tat.setFono_tatuador(rs.getInt("fono_tatuador"));
                tat.setDisponibilidad(rs.getBoolean("disponibilidad"));
                
                listaTatuador.add(tat);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta SQL para revisar los tatuadores "+ e.getMessage());
        }
        return listaTatuador;
    }
    
    
    
    public Cliente buscarCliente(String rut_cliente)
    {
        Cliente cli = new Cliente();
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT FROM * Cliente WHERE rut_cliente=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut_cliente);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cli.setRut_cliente(rs.getString("rut_cliente"));
            }
            
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error en SQL al buscar cliente por el rut" + e.getMessage());
        }
        return cli;
    }

    public void ListarTatuador(Tatuador tat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public void RellenarCombo(String valor,JComboBox combo) {


        try {
            String sql = "SELECT "+ valor+ " FROM proyectoTatuador.Tatuador WHERE disponibilidad = true";
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            PreparedStatement stmt = cnx.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        }
             catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }
        public boolean ActualizarTatto(String nombre, String apellido,String correo, int fono,boolean disponibilidad){
            try {
                
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "UPDATE proyectoTatuador.Tatuador set nom_tatuador=?, ap_tatuador=?, correo_tatuador=?, fono_tatuador=?,disponibilidad=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, correo);
            stmt.setInt(4, fono);
            stmt.setBoolean(5, disponibilidad);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
            } catch (SQLException e) {
                System.out.println("error en el SQL al actualizar libro "+e.getMessage());
            return false;
            }
            catch (Exception e) {
                System.out.println("error en el metodo al actualizar libro "+e.getMessage());
            return false;}
        }
        
        
        public Tatuador buscarTatuador(String rut_tatuador)
    {
        Tatuador tatuadore = new Tatuador();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "SELECT * FROM Tatuador WHERE rut_tatuador=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut_tatuador);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                tatuadore.setRut_tatuador(rs.getString("rut_tatuador"));
                tatuadore.setNom_tatuador(rs.getString("nom_tatuador"));
                tatuadore.setAp_tatuador(rs.getString("ap_tatuador"));
                tatuadore.setCorreo_tatuador(rs.getString("correo_tatuador"));
                tatuadore.setFono_tatuador(rs.getInt("fono_tatuador"));
                
                
            }
            
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error en SQL al buscar tatuador por el rut" + e.getMessage());
        }
        return tatuadore;
    }
}


