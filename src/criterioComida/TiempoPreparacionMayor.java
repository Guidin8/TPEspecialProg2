package criterioComida;

import app.Comida;

public class TiempoPreparacionMayor implements CriterioComida{
    private int tiempoPreparacion;

    public TiempoPreparacionMayor(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getTiempo() > tiempoPreparacion;
    }
}
