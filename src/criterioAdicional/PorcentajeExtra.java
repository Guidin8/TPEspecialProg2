package criterioAdicional;

public class PorcentajeExtra extends CriterioAdicional{
    private double porcentaje;

    public PorcentajeExtra(String denominacion, double porcentaje) {
        super(denominacion);
        this.porcentaje=porcentaje;
    }



    @Override
    public double getPorcentaje() {
        return porcentaje;
    }
}
