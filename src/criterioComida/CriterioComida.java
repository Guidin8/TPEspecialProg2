package criterioComida;

import app.Comida;

/**
 * interfaz por medio de la cual se van a establecer los criterios de las comidas
 */
public interface CriterioComida {
    boolean cumple(Comida comida);
}
