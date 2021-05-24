package criterioComida;

import App.Comida;

public class ModoPreparacion implements CriterioComida{
    private String modoPreparacion;

    public ModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getModoPreparacion().toLowerCase().equals(modoPreparacion.toLowerCase());
    }
}
