package app;

import criterioComida.CriterioComida;


public class Estacion {
    private String nombre;
    private CriterioComida criterioComida;
    private Comida comida;

    /**
     * constructores de la estacion, pueden estar compuestos solo de un nombre o de un nombre y
     * un criterio en caso de tenerlo
     * @param nombre
     */
    public Estacion(String nombre) {
        this.nombre = nombre;
    }
    public Estacion(String nombre, CriterioComida criterioComida){
        this.nombre = nombre;
        this.criterioComida = criterioComida;
    }

    /**
     * metodo por el cual una estacion acepta una comida
     * en caso de no tener criterio y no tener ninguna comida en preparacion la acepta
     * @param comida
     * @return
     */
    public boolean recibeComida(Comida comida){
        if (criterioComida == null) return true;
        if ((criterioComida.cumple(comida))&&(comida!=null)) return true;
        return false;
    }

    /**
     * devuelve el nombre de la estacion
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * modifica el nombre de la estacion
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * ocupa la estacion asignandole una comida
     * @param comida
     */
    public void setComida(Comida comida){
        if (recibeComida(comida)) this.comida = comida;
    }

    /**
     * modifica la especialidad de la estacion, cambiando su criterio
     * @param criterioComida
     */
    public void setCriterioComida(CriterioComida criterioComida) {
        this.criterioComida = criterioComida;
    }

    /**
     * se redefine el equals para saber siu una estacion es igual a otra segun su nombre
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        Estacion estacion = (Estacion) o;
        return getNombre().equals(estacion.getNombre());
    }

}
