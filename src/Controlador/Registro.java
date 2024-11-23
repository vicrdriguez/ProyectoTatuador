
package Controlador;



import ConexionBD.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.sql.ResultSet;

/**
 *
 * @author USRVI-LC2
 */
public class Registro { //vamos hacer el CRUD
    
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
    
}