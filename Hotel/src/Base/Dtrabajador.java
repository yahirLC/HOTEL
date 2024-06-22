package Base;

public class Dtrabajador extends Dpersona {

    String login;
    String acceso;
    String contra;
    Double sueldo;

    public Dtrabajador() {
    }

    public Dtrabajador(String login, String acceso, String contra, Double sueldo) {
        this.login = login;
        this.acceso = acceso;
        this.contra = contra;
        this.sueldo = sueldo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

}
