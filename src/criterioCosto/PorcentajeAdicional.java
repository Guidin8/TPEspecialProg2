package criterioCosto;

import app.Comida;

public class PorcentajeAdicional implements CriterioCosto{
    private double porcentaje;

    public PorcentajeAdicional(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * devuelve el porcentaje adicional para el costo de una comida
     * @param comida
     * @return
     */
    @Override
    public double costoAdicionalComida(Comida comida) {
        return comida.getPrecio() * (porcentaje/100);
    }
}
