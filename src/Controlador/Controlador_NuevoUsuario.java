package Controlador;

import Modelo.ModeloRegistro;
import Modelo.ModeloTipoDocumento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.RegistroUsuarioBD;
import Modelo.TipoDocBD;
import Vista.LoginUI;
import Vista.RegistroUsuario_UI;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Controlador_NuevoUsuario implements ActionListener {

    ModeloRegistro registro = new ModeloRegistro();
    RegistroUsuarioBD nuevoUsuario = new RegistroUsuarioBD();

    private RegistroUsuario_UI view;
    private RegistroUsuarioBD modelo = new RegistroUsuarioBD();

    public void Eventos() {

        view.btnCrearCuenta.addActionListener(this);

    }

    public Controlador_NuevoUsuario(RegistroUsuario_UI view) {
        this.view = view;
        Eventos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(view.btnCrearCuenta)) {

            if (!"".equals(view.txtCrearCuenta_Nombre.getText())
                    || !"".equals(view.txtCrearCuenta_Apellido.getText())
                    || !"".equals(view.txtCrearCuenta_Dni.getText())
                    || !"".equals(view.txtCrearCuenta_Edad.getText())
                    || !"".equals(view.txtCrearCuenta_Telefono.getText())
                    || !"".equals(view.txtCrearCuenta_Usuario.getText())
                    || !"".equals(view.txtCrearCuenta_Password.getText())) {

                ModeloTipoDocumento td = (ModeloTipoDocumento) view.Cbox_TipoDoc.getSelectedItem();

                registro.setDni(Integer.parseInt(view.txtCrearCuenta_Dni.getText()));
                registro.setTipoDoc(td.getCodigo());
                registro.setNombre(view.txtCrearCuenta_Nombre.getText());
                registro.setApellido(view.txtCrearCuenta_Apellido.getText());
                registro.setEdad(Integer.parseInt(view.txtCrearCuenta_Edad.getText()));
                registro.setTelefono(view.txtCrearCuenta_Telefono.getText());
                registro.setUsuario(view.txtCrearCuenta_Usuario.getText());
                registro.setPassword(view.txtCrearCuenta_Password.getText());

                nuevoUsuario.registrarUsuario(registro);

                JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO SASTICFACTORIAMENTE");
                LoginUI login = new LoginUI();
                login.setVisible(true);
                view.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "LOS CAMPOS ESTAN VACIOS, VUELVALO A INTENTAR");
            }

        }

    }

    public void llenarComboBox() {
        TipoDocBD td = new TipoDocBD();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(td.getTipoDocumento().toArray());
        view.Cbox_TipoDoc.setModel(modelo);
    }
}
