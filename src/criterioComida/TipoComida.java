package criterioComida;

import app.Comida;

public class TipoComida implements CriterioComida{
    private String tipoComida;

    public TipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    /**
     * devuelve true en el caso de que una comida tenga el mismo modo de preparacion del buscado
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getTipo().toLowerCase().equals(tipoComida.toLowerCase());
    }
}
