package criterioComida;

import app.Comida;

public class TiempoPreparacionMayor implements CriterioComida{
    private int tiempoPreparacion;

    public TiempoPreparacionMayor(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    /**
     * devuelve true en el caso de que el tiempo de preparacion de una comida sea mayor al buscado
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getTiempo() > tiempoPreparacion;
    }
}
