package misc.fut.Modelo;

public class Futbolista {
    private String dni;
    private String nombre;

    public Futbolista(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
}
