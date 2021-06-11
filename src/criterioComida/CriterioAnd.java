package criterioComida;

import app.Comida;

public class CriterioAnd implements CriterioComida{
    CriterioComida criterio1;
    CriterioComida criterio2;

    public CriterioAnd(CriterioComida criterio1, CriterioComida criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    /**
     * devuelve true en el caso de que una comida cumpla con dos criterios buscados
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return criterio1.cumple(comida) && criterio2.cumple(comida);
    }
}
