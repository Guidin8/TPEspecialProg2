package criterioCosto;

import app.Comida;

public class CriterioCostoSuma implements CriterioCosto{
    CriterioCosto criterio1;
    CriterioCosto criterio2;

    public CriterioCostoSuma(CriterioCosto criterio1, CriterioCosto criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    /**
     * devuelve la suma de dos costos para una comida en el caso que cumplan con un criterio
     * @param comida
     * @return
     */
    @Override
    public double costoAdicionalComida(Comida comida) {
        return criterio1.costoAdicionalComida(comida) + criterio2.costoAdicionalComida(comida);
    }
}
