package Modelo;

public class ModeloTipoVehiculo {

    private int codigo;
    private String tipoVhiculo;

    public ModeloTipoVehiculo() {
    }

    public ModeloTipoVehiculo(int codigo, String tipoVhiculo) {
        this.codigo = codigo;
        this.tipoVhiculo = tipoVhiculo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoVhiculo() {
        return tipoVhiculo;
    }

    public void setTipoVhiculo(String tipoVhiculo) {
        this.tipoVhiculo = tipoVhiculo;
    }

    @Override
    public String toString() {
        return  tipoVhiculo;
    }
    

}
