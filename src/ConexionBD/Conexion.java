/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vicente
 */
public class Conexion {
    
    public Connection obtenerConexion()
    {
        Connection conexion = null;
        //trycatch + tab
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "#IGGN.KVv18");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Fallo conexión con Servidor");
        }
        
        return conexion;
    }
    }

    

