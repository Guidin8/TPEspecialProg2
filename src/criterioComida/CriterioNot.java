package criterioComida;

import app.Comida;

public class CriterioNot implements CriterioComida{
    CriterioComida criterio;

    public CriterioNot(CriterioComida criterio) {
        this.criterio = criterio;
    }

    @Override
    public boolean cumple(Comida comida) {
        return !criterio.cumple(comida);
    }
}
