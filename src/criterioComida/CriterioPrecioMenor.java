package criterioComida;

import app.Comida;

public class CriterioPrecioMenor implements CriterioComida{
    private double precio;

    public CriterioPrecioMenor(double precio) {
        this.precio = precio;
    }
    /**
     * devuelve true en caso de que el precio de una comida sean menor al que se pide
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getPrecio() < precio;
    }
}
