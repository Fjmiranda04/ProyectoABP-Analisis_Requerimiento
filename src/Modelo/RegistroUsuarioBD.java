package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroUsuarioBD {

    ConexionMySQL conexion = new ConexionMySQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarUsuario(ModeloRegistro nuevoUsuario) {

        String sql = "INSERT INTO loginusuario (Numero_Doc,TipoDoc,Nombre_Usuario, Password_Usuario, Nombre, Apellido, Edad, Telefono ) VALUES (?,?,?,?,?,?,?,?)";

        try {

            /*En esta  parte haremos la conexion con la BD y
             proporcionaremos los objetos de nuestra clase Cliente en las 
             columnas de la tabla cliente de la BD en sus respetivas posiciones*/
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, nuevoUsuario.getDni());
            ps.setInt(2, nuevoUsuario.getTipoDoc());
            ps.setString(3, nuevoUsuario.getUsuario());
            ps.setString(4, nuevoUsuario.getPassword());
            ps.setString(5, nuevoUsuario.getNombre());
            ps.setString(6, nuevoUsuario.getApellido());
            ps.setInt(7, nuevoUsuario.getEdad());
            ps.setString(8, nuevoUsuario.getTelefono());


            /*NOTA: 
             El metodo Execute Ejecuta la instrucción SQL especificada, 
             que puede devolver varios resultados, e indica al Controlador 
             para SQL  que las claves que se han generado automáticamente 
             y están presentes en la matriz dada deben estar disponibles
             para su recuperación.*/
            ps.execute();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {

                con.close();

            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
