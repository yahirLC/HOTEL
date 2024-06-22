package Base;

public abstract class Dpersona implements Ipersona {

    private int idPersona;
    private String nombre;
    private String a_paterno;
    private String a_materno;
    private String fecha_nacimiento;
    private String telefono;
    private String Correo;

    public Dpersona() {
    }

    
    //constructor para ser utilizado por las padres hijas (clientes, trabajador)
    public Dpersona(int idPersona, String nombre, String a_paterno, String a_materno, String fecha_nacimiento, String telefono, String Correo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.a_paterno = a_paterno;
        this.a_materno = a_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.Correo = Correo;
    }

    @Override
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getA_paterno() {
        return a_paterno;
    }

    @Override
    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    @Override
    public String getA_materno() {
        return a_materno;
    }

    @Override
    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }

    @Override
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    @Override
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getCorreo() {
        return Correo;
    }

    @Override
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

}
