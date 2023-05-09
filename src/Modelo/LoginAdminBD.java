package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginAdminBD {

 
    Connection con;

    PreparedStatement ps;
    ResultSet rs;

  
    ConexionMySQL cn = new ConexionMySQL();

   
    public ModeloLoginAdmin loginAdmin(String usuarioAdmin, String passwordAdmin) {

        ModeloLoginAdmin login = new ModeloLoginAdmin();

       
        String sql = "SELECT * FROM loginadmin WHERE Nombre_UsuarioAdmin = ? AND Password_UsuarioAdmin = ?";

      
        try {

           
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuarioAdmin);
            ps.setString(2, passwordAdmin);

           
            rs = ps.executeQuery();

            if (rs.next()) {
              

                login.setUsuarioAdmin(rs.getString("Nombre_UsuarioAdmin"));
                login.setPasswordAdmin(rs.getString("Password_UsuarioAdmin"));

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return login;
    }

}
