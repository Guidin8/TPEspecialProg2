package criterioCosto;

import app.Comida;
import criterioComida.CriterioComida;

public class ImporteCondicional implements CriterioCosto{
    private CriterioComida criterio;
    private double importeCumple;
    private double importeNoCumple;

    public ImporteCondicional(CriterioComida criterio, double importeCumple, double importeNoCumple) {
        this.criterio = criterio;
        this.importeCumple = importeCumple;
        this.importeNoCumple = importeNoCumple;
    }

    @Override
    public double costoAdicionalComida(Comida comida) {
        if (criterio.cumple(comida))
            return importeCumple;
        return importeNoCumple;
    }
}
