
package clases;

/**
 *
 * @author patro
 */
public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private int edad;

    public Estudiante(int idEstudiante, String nombre, String apellido, int edad) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
}
