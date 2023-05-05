package Modelo;

public class ModeloRegistro extends ModeloLogin {

    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private String telefono;

    public ModeloRegistro() {
    }

    public ModeloRegistro(String nombre, String apellido, int dni, int edad, String telefono, int id, String usuario, String password) {
        super(id, usuario, password);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
