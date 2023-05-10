/*BREVE EXPLICACION:
 En esta clase (ModeloLogin) simplemente creamos los objetos(id, nombre, password),sus 
 respectivos metodos get-set, un constructor vacio, asi como un constructor para
 los objetos los cuales usaremospara el ingreso del nombre de usuario 
 y la contrasena. */
package Modelo;

public class ModeloLoginUsuario {

    private int id;
    private String usuario;
    private String password;

    public ModeloLoginUsuario() {
    }

    public ModeloLoginUsuario(int id, String usuario, String password) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
