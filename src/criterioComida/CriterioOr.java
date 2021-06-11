package criterioComida;

import app.Comida;

public class CriterioOr implements CriterioComida{
    CriterioComida criterio1;
    CriterioComida criterio2;

    public CriterioOr(CriterioComida criterio1, CriterioComida criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }
    /**
     * devuelve true en el caso de que una comida cumpla alguno de dos criterios buscados
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return criterio1.cumple(comida) || criterio2.cumple(comida);
    }
}
