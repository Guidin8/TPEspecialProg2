package criterioComida;

import app.Comida;

public class TiempoPreparacionMenor implements CriterioComida{
    private int tiempoPreparacion;

    public TiempoPreparacionMenor(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    /**
     * devuelve true en el caso de que el tiempo de preparacion de una comida sea menor al buscado
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getTiempo() < tiempoPreparacion;
    }
}
