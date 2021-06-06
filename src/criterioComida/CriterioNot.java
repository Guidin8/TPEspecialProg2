package criterioComida;

import app.Comida;

public class CriterioNot implements CriterioComida{
    CriterioComida criterio;

    public CriterioNot(CriterioComida criterio) {
        this.criterio = criterio;
    }
    /**
     * devuelve true en el caso de que una comida NO cumpla un criterio buscado
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return !criterio.cumple(comida);
    }
}
