package Base;

public class Dcuarto {

    private int idCuarto;
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private Double precio_diario;
    private String estado;
    private String tipocuarto;
    private String nomimagen;

    public Dcuarto(int idCuarto, String numero, String piso, String descripcion, String caracteristicas, Double precio_diario, String estado, String tipocuarto, String nomimagen) {
        this.idCuarto = idCuarto;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_diario = precio_diario;
        this.estado = estado;
        this.tipocuarto = tipocuarto;
        this.nomimagen = nomimagen;
    }

    public Dcuarto() {
    }

    public int getIdCuarto() {
        return idCuarto;
    }

    public void setIdCuarto(int idCuarto) {
        this.idCuarto = idCuarto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPrecio_diario() {
        return precio_diario;
    }

    public void setPrecio_diario(Double precio_diario) {
        this.precio_diario = precio_diario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipocuarto() {
        return tipocuarto;
    }

    public void setTipocuarto(String tipocuarto) {
        this.tipocuarto = tipocuarto;
    }

    public String getNomimagen() {
        return nomimagen;
    }

    public void setNomimagen(String nomimagen) {
        this.nomimagen = nomimagen;
    }

    
    
}
