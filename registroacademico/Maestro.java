package registroacademico;

public class Maestro extends DatoGeneral {
    private String dui;
    private String grados;
    public Maestro() {
    }
    public Maestro(String nombre, String direccion, String telefono, String email, String dui, String grados) {
        super(nombre, direccion, telefono, email);
        this.dui = dui;
        this.grados = grados;
    }
    public String getDui() {
        return dui;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }
    public String getGrados() {
        return grados;
    }
    public void setGrados(String grados) {
        this.grados = grados;
    }

}
