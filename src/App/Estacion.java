package App;

import especialidad.Especialidad;

public class Estacion {
    private String nombre;
    private Especialidad especialidad;
    private Comida comida;

    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    public boolean recibeComida(Comida comida){
        if (especialidad == null) return true;
        if (especialidad.cumple(comida)) return true;
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setComida(Comida comida){
        if (recibeComida(comida)) this.comida = comida;
    }

    @Override
    public boolean equals(Object o) {
        Estacion estacion = (Estacion) o;
        return getNombre().equals(estacion.getNombre());
    }

}
