import java.util.Objects;

public abstract class Estacion {
    private String nombre;
    private String especialidad;
    private Comida comida;

    public Estacion(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public boolean recibeComida(Comida comida){
        if(this.comida == null && aceptoComida(comida)){
            this.comida = comida;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object o) {
        Estacion estacion = (Estacion) o;
        return getNombre().equals(estacion.getNombre());
    }

    protected abstract boolean aceptoComida(Comida comida);
}
