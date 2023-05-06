package Controlador;

import Modelo.LoginBD;
import Modelo.ModeloLogin;
import Vista.Alquiler;
import Vista.EntradaAdministrador;
import Vista.LoginUI;
import Vista.RegistroUsuario_UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_LoginBD implements ActionListener {

    Modelo.ModeloLogin lg = new Modelo.ModeloLogin();
    LoginBD login = new LoginBD();

    private LoginUI view;
    private LoginBD modelo = new LoginBD();

    public void Eventos() {
        view.btnacceder.addActionListener(this);
        view.btncrearUsuario.addActionListener(this);
    }

    public Controlador_LoginBD(LoginUI view) {
        this.view = view;
        Eventos();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object evt = e.getSource();

        if (evt.equals(view.btnacceder)) {

            String usuario = view.txtusuario.getText();
            String password = String.valueOf(view.txtpassword.getPassword());

            if (!"".equals(usuario) || !"".equals(password)) {

                lg = login.log(usuario, password);

                if (lg.getUsuario() != null && lg.getPassword() != null) {
                    Alquiler reservacion = new Alquiler();
                    reservacion.setVisible(true);
                    view.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "USUARIO O LA CONTRASENA INCORRECTAS");
                }

            }
        } else if (evt.equals(view.btncrearUsuario)) {

            RegistroUsuario_UI crearCuenta = new RegistroUsuario_UI();
            crearCuenta.setVisible(true);
            view.dispose();

        }
    }
}
