/*BREVE EXPLICACION:
Esta clase (Conexion) es el puente a la conexion de nuestra BD
es la clase mas importante si deseamos tener una comunicacion con lo que es 
nuestra BD*/
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/sistemaparqueo?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());

        }
        return null;

    }
}
