package criterioComida;

import App.Comida;

public class TiempoPreparacionMenor implements CriterioComida{
    private int tiempoPreparacion;

    public TiempoPreparacionMenor(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getTiempo() < tiempoPreparacion;
    }
}
