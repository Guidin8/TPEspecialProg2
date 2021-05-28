package criterioAdicional;

public class PorcentajeDescuento extends CriterioAdicional{
    private double porcentaje;

    public PorcentajeDescuento(String denominacion, double porcentaje) {
        super(denominacion);
        this.porcentaje = porcentaje;
    }

    @Override
    public double getPorcentaje() {
        return -porcentaje;
    }
}
