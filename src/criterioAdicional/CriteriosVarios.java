package criterioAdicional;
import java.util.ArrayList;

public class CriteriosVarios extends CriterioAdicional{
    private ArrayList<CriterioAdicional> criterios;

    public CriteriosVarios(String denominacion) {
        super(denominacion);
        criterios = new ArrayList<>();
    }

    public void addCriterio(CriterioAdicional criterio){
        if (!criterios.contains(criterio)) criterios.add(criterio);
    }

    @Override
    public double getPorcentaje() {
        double porcentaje = 0;
        for (CriterioAdicional c: criterios) {
            porcentaje += c.getPorcentaje();
        }
        return porcentaje;
    }
}
