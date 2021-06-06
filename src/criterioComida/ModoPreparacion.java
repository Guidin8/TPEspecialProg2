package criterioComida;

import app.Comida;

public class ModoPreparacion implements CriterioComida{
    private String modoPreparacion;

    public ModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }

    /**
     * devuelve true en el caso de que una comida tenga el mismo modo de preparacion del buscado
     * @param comida
     * @return
     */
    @Override
    public boolean cumple(Comida comida) {
        return comida.getModoPreparacion().toLowerCase().equals(modoPreparacion.toLowerCase());
    }
}
