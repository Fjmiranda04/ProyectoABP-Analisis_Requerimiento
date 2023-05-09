
package Modelo;


public class ModeloTipoDocumento {
    
    private int codigo;
    private String nombreDocumento;

    public ModeloTipoDocumento() {
    }

    public ModeloTipoDocumento(int codigo, String nombreDocumento) {
        this.codigo = codigo;
        this.nombreDocumento = nombreDocumento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    @Override
    public String toString() {
        return nombreDocumento;
    }
    
    

}
