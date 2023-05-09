package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoVehBD {

    ConexionMySQL cn = new ConexionMySQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public List getTipoVehiculo() {
        List<ModeloTipoVehiculo> tabla2 = new ArrayList();
        String sql = "SELECT * FROM Tipo_Vehiculo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                //Instanciamos la clase Clientes (cl)
                ModeloTipoVehiculo tipoVehiculo = new ModeloTipoVehiculo();
                tipoVehiculo.setCodigo(rs.getInt("Codigo"));
                tipoVehiculo.setTipoVhiculo(rs.getString("Tipo_Vehiculos"));

                tabla2.add(tipoVehiculo);

            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return tabla2;
    }

}
