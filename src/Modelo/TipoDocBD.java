package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class TipoDocBD {

    ConexionMySQL cn = new ConexionMySQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List getTipoDocumento() {
        List<ModeloTipoDocumento> tabla1 = new ArrayList();
        String sql = "SELECT * FROM tipo_documento";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                //Instanciamos la clase Clientes (cl)
                ModeloTipoDocumento tipoDoc = new ModeloTipoDocumento();
                tipoDoc.setCodigo(rs.getInt("Codigo"));
                tipoDoc.setNombreDocumento(rs.getString("Nombre_Doc"));

                tabla1.add(tipoDoc);

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return tabla1;
    }
    
    
    
}
