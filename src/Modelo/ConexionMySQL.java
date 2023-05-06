/*BREVE EXPLICACION:
 Esta clase (ConexionMySQL) es el puente a la conexion de nuestra BD
 es la clase mas importante si deseamos tener una comunicacion con lo que es 
 nuestra BD*/
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
/*
   private String database_name = "bd_sistema_parqueo";
    private String user = "Soporte";
    private String password = "Fj_Miranda22/";
    private String url = "jdbc:mysql://localhost:3307/" + database_name;
    Connection con = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println("ha ocurrido un ClassNotFoundException" + e.getMessage());

        } catch (SQLException e) {
            System.err.println("ha ocurrido un SQLException" + e.getMessage());
        }
        return con;

    }
    */
   Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3307/bd_sistema_parqueo?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "Soporte", "Fj_Miranda22/");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());

        }
        return null;

    }
}
