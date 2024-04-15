
package logica;

public class Donaciones {
    private String nombre;
    private String identificacion;
    private String monto;

    public Donaciones() {
    }

    public Donaciones(String nombre, String identificacion, String monto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
     
}