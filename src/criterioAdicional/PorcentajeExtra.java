package criterioAdicional;

public class PorcentajeExtra extends CriterioAdicional{
    private double porcentaje;

    public PorcentajeExtra(String denominacion) {
        super(denominacion);
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double getPorcentaje() {
        return porcentaje;
    }
}
