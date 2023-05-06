package Modelo;

public class ModeloReserva {

    private int id_reserva;
    private String nombreUsuario;
    private int dniUsuario;
    private String numeroPlaca;
    private String colorVehiculo;
    private String marcaVehiculo;
    private String tiempoReserva;

    public ModeloReserva() {
    }

    public ModeloReserva(int id_reserva, String nombreUsuario, int dniUsuario, String numeroPlaca, String colorVehiculo, String marcaVehiculo, String tiempoReserva) {
        this.id_reserva = id_reserva;
        this.nombreUsuario = nombreUsuario;
        this.dniUsuario = dniUsuario;
        this.numeroPlaca = numeroPlaca;
        this.colorVehiculo = colorVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.tiempoReserva = tiempoReserva;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(int dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getTiempoReserva() {
        return tiempoReserva;
    }

    public void setTiempoReserva(String tiempoReserva) {
        this.tiempoReserva = tiempoReserva;
    }

}
