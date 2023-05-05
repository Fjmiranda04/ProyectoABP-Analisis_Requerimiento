/*BREVE EXPLICACION:
 La clase (LoginBD) es la encargada de hacer la conexion con la tabla ModeloLogin 
 que esta en nuestra base de datos, creada anteriormente..*/
package Modelo;

//Importamos las librerias que vamos a usar para el puente de conexion con la BD.
import java.sql.Connection;
//La clase Connection representa una conexión a una base de datos

import java.sql.PreparedStatement;
/*El objeto PreparedStatement proporciona varios métodos para establecer
 parámetros siendo asi como el set*/

import java.sql.ResultSet;
/*El objeto ResultSet proporciona varios métodos para obtener los datos de 
 columna correspondientes a un fila y a diferencia del PreparedStatement ResultSet
 vendria siendo el get*/

import java.sql.SQLException;
/*La clase SQLException y sus subtipos proporcionan información acerca de los 
 errores y avisos que se producen mientras se está accediendo a un 
 origen de datos*/

public class LoginBD {

    //Creamos las respectivas variables(con,ps,rs)
    Connection con;

    PreparedStatement ps;
    ResultSet rs;

    //Instanciamos la conexion
    Conexion cn = new Conexion();

    /*Creamos un metodo con la clase ModeloLogin llamada (log) con los parametros de
     nombre(nombre de usuario) y password(contrasena).*/
    public ModeloLogin log(String usuario, String password) {
        //Intanciamos la clase ModeloLogin
        ModeloLogin l = new ModeloLogin();

        /*Creamos una variable llamada (sql) que sera la encargada de
         proporcionar la informacion almacenada en la BD*/
        String sql = "SELECT * FROM loginusuario WHERE usuario = ? AND password = ?";

        /*Este bloque nos ayudara adetectar y controlar lo que haremos a
         continuacion
         */
        try {

            /*En esta primera parte haremos la conexion con la BD y
             proporcionaremos las columnas nombre y password de la BD en sus
             respetivas posiciones*/
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,usuario );
            ps.setString(2, password);

            /*NOTA:
             executeQuery es para obtener un conjunto de resultados de una llamada 
             de procedimiento almacenado, si ese procedimiento almacenado 
             devuelve un solo conjunto de resultados.*/
            rs = ps.executeQuery();

            if (rs.next()) {
                /*En esta segunda ya nos enfocamos en nuestra clase login 
                 con sus objetos los cuales recibiran los valores que tendremos 
                 almacenados en nuestra BD*/
                
                l.setUsuario(rs.getString("usuario"));
                l.setPassword(rs.getString("password"));

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }

}
