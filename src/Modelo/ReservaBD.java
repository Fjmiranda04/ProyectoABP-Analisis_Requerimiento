package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReservaBD {

    ConexionMySQL conexion = new ConexionMySQL();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean realizarReserva(ModeloReserva nuevaReserva) {

        String sql = "INSERT INTO reservacion (Nombre_usuario, Dni_Usuario, Numero_Puesto_Reservacion,Tipo_Vehiculo, Numero_Placa, Color_Vehiculo, Marca_Vehiculo, Tiempo_Reserva) VALUE (?,?,?,?,?,?,?,?)";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, nuevaReserva.getNombreUsuario());
            ps.setInt(2, nuevaReserva.getDniUsuario());
            ps.setInt(3, nuevaReserva.getPuestoReservacion());
            ps.setInt(4, nuevaReserva.getTipoVehiculo());
            ps.setString(5, nuevaReserva.getNumeroPlaca());
            ps.setString(6, nuevaReserva.getColorVehiculo());
            ps.setString(7, nuevaReserva.getMarcaVehiculo());
            ps.setString(8, nuevaReserva.getTiempoReserva());

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
