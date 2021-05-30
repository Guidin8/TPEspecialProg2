package criterioComida;

import app.Comida;

public class CriterioPrecioMayor implements CriterioComida{
    private double precio;

    public CriterioPrecioMayor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getPrecio() > precio;
    }
}
