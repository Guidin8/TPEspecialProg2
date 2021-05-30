package criterioComida;

import app.Comida;

public class CriterioPrecioMenor implements CriterioComida{
    private double precio;

    public CriterioPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getPrecio() < precio;
    }
}
