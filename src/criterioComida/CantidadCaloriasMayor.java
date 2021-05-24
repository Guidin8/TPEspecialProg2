package criterioComida;

import App.Comida;

public class CantidadCaloriasMayor implements CriterioComida{
    private int calorias;

    public CantidadCaloriasMayor(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getCalorias() > calorias;
    }
}
