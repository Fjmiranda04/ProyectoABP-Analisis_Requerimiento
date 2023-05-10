package Controlador;

import Modelo.LoginUsuarioBD;
import Modelo.ModeloLoginUsuario;
import Vista.Alquiler;
import Vista.EntradaAdministrador;
import Vista.LoginUI;
import Vista.RegistroUsuario_UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_LoginUsuarioBD implements ActionListener {

    ModeloLoginUsuario lg = new ModeloLoginUsuario();
    LoginUsuarioBD login = new LoginUsuarioBD();

    private LoginUI view;
    private LoginUsuarioBD modelo = new LoginUsuarioBD();

    public void Eventos() {
        view.btnacceder.addActionListener(this);
        view.btncrearUsuario.addActionListener(this);
    }

    public Controlador_LoginUsuarioBD(LoginUI view) {
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
