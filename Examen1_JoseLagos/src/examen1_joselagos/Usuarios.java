package examen1_joselagos;

/**
 *
 * @author Tony
 */
public class Usuarios {
    private int code, edad;
    private String nombre, apellido;

    public Usuarios() {
    }

    public Usuarios(int code, int edad, String nombre, String apellido) {
        this.code = code;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "code=" + code + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
