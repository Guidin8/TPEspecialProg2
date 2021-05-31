package app;

import criterioComida.CriterioComida;


public class Estacion {
    private String nombre;
    private CriterioComida criterioComida;
    private Comida comida;

    public Estacion(String nombre) {
        this.nombre = nombre;
    }
    public Estacion(String nombre, CriterioComida criterioComida){
        this.nombre = nombre;
        this.criterioComida = criterioComida;
    }

    public boolean recibeComida(Comida comida){
        if (criterioComida == null) return true;
        if (criterioComida.cumple(comida)) return true;
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(CriterioComida criterioComida) {
        this.criterioComida = criterioComida;
    }

    public void setComida(Comida comida){
        if (recibeComida(comida)) this.comida = comida;
    }

    public void setCriterioComida(CriterioComida criterioComida) {
        this.criterioComida = criterioComida;
    }

    @Override
    public boolean equals(Object o) {
        Estacion estacion = (Estacion) o;
        return getNombre().equals(estacion.getNombre());
    }

}
