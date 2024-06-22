package Base;


public class Dcliente extends Dpersona {

    private String Nocliente;
    private Integer StatusCliente;

    public Dcliente() {
    }

    public Dcliente(String Nocliente,int StatusCliente) {
        this.Nocliente = Nocliente;
        this.StatusCliente = StatusCliente;
    }

    public String getNocliente() {
        return Nocliente;
    }

    public void setNocliente(String Nocliente) {
        this.Nocliente = Nocliente;
    }

    public Integer getStatusCliente() {
        return StatusCliente;
    }

    public void setStatusCliente(int StatusCliente) {
        this.StatusCliente = StatusCliente;
    }
    
    
    
}
