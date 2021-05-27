package criterioAdicional;
import app.Comida;

public abstract class CriterioAdicional {
    private String denominacion;

    public CriterioAdicional(String denominacion) {
        this.denominacion = denominacion;
    }

    public abstract double getPorcentaje();
}
