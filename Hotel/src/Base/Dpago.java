package Base;

public class Dpago {

    private int idPago;
    private String tipo;
    private Double monto;
    private Double iva;
    private int idReservacion;
    private String fecha_pago;
    private String no_comprobante;

    public Dpago() {
    }

    public Dpago(int idPago, String tipo, Double monto, Double iva, int idReservacion, String fecha_pago, String no_comprobante) {
        this.idPago = idPago;
        this.tipo = tipo;
        this.monto = monto;
        this.iva = iva;
        this.idReservacion = idReservacion;
        this.fecha_pago = fecha_pago;
        this.no_comprobante = no_comprobante;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getNo_comprobante() {
        return no_comprobante;
    }

    public void setNo_comprobante(String no_comprobante) {
        this.no_comprobante = no_comprobante;
    }

}
