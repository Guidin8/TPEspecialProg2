package criterioCosto;

import app.Comida;

public class PorcentajeAdicional implements CriterioCosto{
    private double porcentaje;

    public PorcentajeAdicional(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double costoAdicionalComida(Comida comida) {
        return comida.getPrecio() * (porcentaje/100);
    }
}
