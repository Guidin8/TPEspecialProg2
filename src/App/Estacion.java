package App;

import criterioComida.CriterioComida;

public class Estacion {
    private String nombre;
    private CriterioComida especialidad;
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

    public void setEspecialidad(CriterioComida criterioComida) {
        this.especialidad = criterioComida;
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
