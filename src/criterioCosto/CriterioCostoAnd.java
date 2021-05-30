package criterioCosto;

import app.Comida;

public class CriterioCostoAnd implements CriterioCosto{
    CriterioCosto criterio1;
    CriterioCosto criterio2;

    public CriterioCostoAnd(CriterioCosto criterio1, CriterioCosto criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public double costoAdicionalComida(Comida comida) {
        return criterio1.costoAdicionalComida(comida) + criterio2.costoAdicionalComida(comida);
    }
}
