package criterioComida;

import App.Comida;

public class CriterioOr implements CriterioComida{
    CriterioComida criterio1;
    CriterioComida criterio2;

    public CriterioOr(CriterioComida criterio1, CriterioComida criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public boolean cumple(Comida comida) {
        return criterio1.cumple(comida) || criterio2.cumple(comida);
    }
}
