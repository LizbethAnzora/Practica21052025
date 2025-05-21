package registroacademico;

public class Alumno extends DatoGeneral {
    private String nCarnet;
    private String encargado;
    public Alumno() {
    }
    public Alumno(String nombre, String direccion, String telefoo, String email, String nCarnet, String encargado) {
        super(nombre, direccion, telefoo, email);
        this.nCarnet = nCarnet;
        this.encargado = encargado;
    }
    public String getnCarnet() {
        return nCarnet;
    }
    public void setnCarnet(String nCarnet) {
        this.nCarnet = nCarnet;
    }
    public String getEncargado() {
        return encargado;
    }
    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    public void verNotas() {
        System.out.println("Notas del alumno " + getNombre() + ":");
        // Aquí se pueden agregar las notas del alumno
    }
    public void entregarTareas() {
        System.out.println("Entregando tareas del alumno " + getNombre() + ":");
        // Aquí se pueden agregar las tareas entregadas por el alumno
    }
    public void registrar() {
        super.registrar();
        System.out.println("Registro de alumno:");
        System.out.println("Número de carnet: " + nCarnet);
        System.out.println("Encargado: " + encargado);

    }

}


