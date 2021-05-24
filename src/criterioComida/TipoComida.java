package criterioComida;

import App.Comida;

public class TipoComida implements CriterioComida{
    private String tipoComida;

    public TipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public boolean cumple(Comida comida) {
        return comida.getTipo().toLowerCase().equals(tipoComida.toLowerCase());
    }
}
