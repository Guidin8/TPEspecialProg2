package criterioComida;

import app.Comida;

public class CriterioAnd implements CriterioComida{
    CriterioComida criterio1;
    CriterioComida criterio2;

    public CriterioAnd(CriterioComida criterio1, CriterioComida criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Comida comida) {
        return criterio1.cumple(comida) && criterio2.cumple(comida);
    }
}
