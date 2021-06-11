package criterioComida;

import app.Comida;

public class CantidadCaloriasMenor implements CriterioComida{
    private int calorias;

    public CantidadCaloriasMenor(int calorias) {
        this.calorias = calorias;
    }
    /**
     * devuelve true en caso de que las calorias de una comida sean menores a las que se piden
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getCalorias() < calorias;
    }
}
