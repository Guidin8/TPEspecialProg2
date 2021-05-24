package criterioComida;

import App.Comida;

public class CantidadCaloriasMenor implements CriterioComida{
    private int calorias;

    public CantidadCaloriasMenor(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getCalorias() < calorias;
    }
}
