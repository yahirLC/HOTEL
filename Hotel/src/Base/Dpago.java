package Base;

public class Dpago {

    private int idPago;
    private String tipo;
    private Float monto;
    private Float iva;
    private int idReservacion;
    private String fecha_pago;


    public Dpago() {
    }

    public Dpago(int idPago, String tipo, Float monto, Float iva, int idReservacion, String fecha_pago) {
        this.idPago = idPago;
        this.tipo = tipo;
        this.monto = monto;
        this.iva = iva;
        this.idReservacion = idReservacion;
        this.fecha_pago = fecha_pago;
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

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
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




}
