package Controlador;

import Modelo.ModeloReserva;
import Modelo.ReservaBD;
import Vista.Alquiler;
import Vista.EntradaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_Reservacion implements ActionListener {

    ModeloReserva reserva = new ModeloReserva();
    ReservaBD nuevaReserva = new ReservaBD();

    private Alquiler view;
    private ReservaBD modelo = new ReservaBD();

    public void Eventos() {
        view.btnReservacion_Reservar.addActionListener(this);
    }

    public Controlador_Reservacion(Alquiler view) {
        this.view = view;
        Eventos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(view.btnReservacion_Reservar)) {

            if (!"".equals(view.txtReservacion_NombreU.getText())
                    || !"".equals(view.txtReservacion_Dni.getText())
                    || !"".equals(view.txtReservacion_MarcaV.getText())
                    || !"".equals(view.txtReservacion_ColorVh.getText())
                    || !"".equals(view.txtReservacion_TiempoR.getText())) {

                reserva.setNombreUsuario(view.txtReservacion_NombreU.getText());
                reserva.setDniUsuario(Integer.parseInt(view.txtReservacion_Dni.getText()));
                reserva.setNumeroPlaca(view.txtReservacion_NumPlacaV.getText());
                reserva.setMarcaVehiculo(view.txtReservacion_MarcaV.getText());
                reserva.setColorVehiculo(view.txtReservacion_ColorVh.getText());
                reserva.setTiempoReserva(view.txtReservacion_TiempoR.getText());

                nuevaReserva.realizarReserva(reserva);

                JOptionPane.showMessageDialog(null, "RESERVACION REGISTRADO SASTICFACTORIAMENTE");
                EntradaUsuario reservacion = new EntradaUsuario();
                reservacion.setVisible(true);
                view.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS, VUELVALO A INTENTAR");
            }

        }
    }

}
