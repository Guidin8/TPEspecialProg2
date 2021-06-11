package criterioComida;

import app.Comida;

public class SaleConFritas implements CriterioComida{

    /**
     * Acepta cualquier tipo de comida
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return true;
    }
}
