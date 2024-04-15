
package logica;


public class Voluntariado {
    private String nombre_voluntario;
    private String identificacion_voluntario;
    private String edad;
    private String ocupacion;
    private String disponibilidad;

    public Voluntariado() {
    }

    public Voluntariado(String nombre_voluntario, String identificacion_voluntario, String edad, String ocupacion, String disponibilidad) {
        this.nombre_voluntario = nombre_voluntario;
        this.identificacion_voluntario = identificacion_voluntario;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre_voluntario() {
        return nombre_voluntario;
    }

    public void setNombre_voluntario(String nombre_voluntario) {
        this.nombre_voluntario = nombre_voluntario;
    }

    public String getIdentificacion_voluntario() {
        return identificacion_voluntario;
    }

    public void setIdentificacion_voluntario(String identificacion_voluntario) {
        this.identificacion_voluntario = identificacion_voluntario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
