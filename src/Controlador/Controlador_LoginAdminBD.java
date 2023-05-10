package Controlador;

import Modelo.LoginAdminBD;
import Vista.EntradaAdministrador;
import Vista.LoginAdminUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_LoginAdminBD implements ActionListener {

    Modelo.ModeloLoginAdmin lg = new Modelo.ModeloLoginAdmin();
    LoginAdminBD login = new LoginAdminBD();

    private LoginAdminUI view;
    private LoginAdminBD modelo = new LoginAdminBD();

    public void Eventos() {
        view.btnaccederAdmin.addActionListener(this);
    }

    public Controlador_LoginAdminBD(LoginAdminUI view) {
        this.view = view;
        Eventos();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object evt = e.getSource();

        if (evt.equals(view.btnaccederAdmin)) {

            String usuario = view.txtusuarioAdmin.getText();
            String password = String.valueOf(view.txtpasswordAdmin.getPassword());

            if (!"".equals(usuario) || !"".equals(password)) {

                lg = login.loginAdmin(usuario, password);

                if (lg.getUsuarioAdmin() != null && lg.getPasswordAdmin() != null) {
                    EntradaAdministrador sistemaAdmin = new EntradaAdministrador();
                    sistemaAdmin.setVisible(true);
                    view.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "USUARIO O LA CONTRASENA INCORRECTAS");
                }

            }
        }
    }
}
