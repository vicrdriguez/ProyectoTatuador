
package ConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vicente
 */
public class Conexion {
    
    //jdbc:mysql://localhost:3306/ProyectoTatuador
    //es el mismo para todos, da igual estemos en distintas PC
    public Connection obtenerConexion()
    {
        Connection conexion = null;
        //trycatch + tab
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //el nombre de la URL es ProyectoTatuador porque a la hora de crear el MySQL,
            //deben ponerle asi y hacer las tablas tal cual indica
            //la clave varia dependiendo el usuario del proyecto
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoTatuador", "root", "LuisCabello123+");
            System.out.println("Conexion exitosa!!");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la clase conexión con Servidor" + e.getMessage());
        } 
        return conexion;
    }
}