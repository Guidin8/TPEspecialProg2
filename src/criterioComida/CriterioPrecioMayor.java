package criterioComida;

import app.Comida;

public class CriterioPrecioMayor implements CriterioComida{
    private double precio;

    public CriterioPrecioMayor(double precio) {
        this.precio = precio;
    }
    /**
     * devuelve true en caso de que el precio de una comida sean mayor al que se pide
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getPrecio() > precio;
    }
}
