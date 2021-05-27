package CriteriosParaCostoComida;

import app.Comida;


public class SumarAdicionalExtra extends CriterioParaCostoComida {
    private double adicionarAlCosto;

    public SumarAdicionalExtra(String nombreCriterio, double adicionarAlCosto) {
        super(nombreCriterio);
        this.adicionarAlCosto = adicionarAlCosto;
    }

    @Override
    public double agregarAlMonto() {
        return adicionarAlCosto;
    }
}
