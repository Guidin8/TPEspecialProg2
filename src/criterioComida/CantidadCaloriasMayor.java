package criterioComida;

import app.Comida;


public class CantidadCaloriasMayor implements CriterioComida{
    private int calorias;

    public CantidadCaloriasMayor(int calorias) {
        this.calorias = calorias;
    }

    /**
     * devuelve true en caso de que las calorias de una comida sean mayores a las que se piden
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getCalorias() > calorias;
    }
}
