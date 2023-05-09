
package Modelo;


public class ModeloLoginAdmin {

    private String usuarioAdmin;
    private String passwordAdmin;

    public ModeloLoginAdmin() {
    }

    public ModeloLoginAdmin(String usuarioAdmin, String passwordAdmin) {
        this.usuarioAdmin = usuarioAdmin;
        this.passwordAdmin = passwordAdmin;
    }

    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    public void setUsuarioAdmin(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }
    
    
}
