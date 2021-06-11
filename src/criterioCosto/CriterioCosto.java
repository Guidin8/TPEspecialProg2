package criterioCosto;

import app.Comida;

/**
 * interfaz con la que se va a establecer los criterios de los costos de las comidas
 */
public interface CriterioCosto {
    double costoAdicionalComida(Comida comida);
}
