
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
          
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoTatuador", "root", "duoc.2024");

            System.out.println("Conexion exitosa!!");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la clase conexión con Servidor" + e.getMessage());
        } 
        return conexion;
    }
    //Tablas de MySQL:
    /*
    DROP table proyectotatuador.Reserva;
    DROP table proyectoTatuador.Cliente;
    DROP table proyectoTatuador.Tatuador;

    create database proyectoTatuador;
    use proyectoTatuador;

    create table proyectoTatuador.Cliente(
	num_cliente int not null auto_increment,
	rut_cliente varchar(10) not null,
        nom_cliente varchar(20) not null,
        ap_cliente varchar(20) not null,
        fono_cliente int not null,
        correo_cliente varchar(30) not null,
        primary key(num_cliente)
    );

    create table  proyectoTatuador.Tatuador(
        num_tatuador int not null auto_increment,
        rut_tatuador varchar(10) not null,
        nom_tatuador varchar(20) not null,
        ap_tatuador varchar(20) not null,
        correo_tatuador varchar(20) not null,
        fono_tatuador int not null,
        disponibilidad bit not null,
        primary key(num_tatuador)
    );

    create table proyectoTatuador.Reserva(
	id_reserva int not null auto_increment,
        fecha date not null,
        hora time not null,
        num_cliente int not null,
        num_tatuador int not null,
        primary key(id_reserva), 
        foreign key(num_cliente) references proyectoTatuador.Cliente(num_cliente),
        foreign key(num_tatuador) references proyectotatuador.Tatuador(num_tatuador)
    );

    INSERT INTO Cliente(rut_cliente, nom_cliente, ap_cliente, fono_cliente, correo_cliente)
    VALUES('123-K', '----', '----', 456789, '---@');
*/
}