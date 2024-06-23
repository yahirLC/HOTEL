package Base;


public class Dreserva {

    private String idReservacion;
    private int idCliente;
    private int idCuarto;
    private int idTrabajador;

    private String fecha_reservacion;
    private String fecha_ingreso;
    private String fecha_salida;
    private Float costo_total;
    private String estado;
    private String tipo;

    public Dreserva() {
    }

    public Dreserva(String idReservacion, int idCliente, int idCuarto, int idTrabajador, String fecha_reservacion, String fecha_ingreso, String fecha_salida, Float costo_total, String estado, String tipo) {
        this.idReservacion = idReservacion;
        this.idCliente = idCliente;
        this.idCuarto = idCuarto;
        this.idTrabajador = idTrabajador;
        this.fecha_reservacion = fecha_reservacion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.costo_total = costo_total;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(String idReservacion) {
        this.idReservacion = idReservacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCuarto() {
        return idCuarto;
    }

    public void setIdCuarto(int idCuarto) {
        this.idCuarto = idCuarto;
    }

    public String getFecha_reservacion() {
        return fecha_reservacion;
    }

    public void setFecha_reservacion(String fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Float getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(Float costo_total) {
        this.costo_total = costo_total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
