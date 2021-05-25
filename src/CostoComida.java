import app.*;
import criterioAdicional.CriterioAdicional;

public class CostoComida extends CriterioAdicional {
    private double porcentaje;
    public CostoComida(String denominacion,double porcentaje) {
        super(denominacion);
        this.porcentaje=porcentaje;
    }

    @Override
    public double getPorcentaje() {
        return this.porcentaje;
    }




   /*
    public boolean getDiaAgitado() {
        return diaAgitado;
    }

    public void setDiaAgitado(boolean diaAgitado) {
        this.diaAgitado = diaAgitado;
        super.setPrecio(super.getPrecio()+super.getPrecio()*DIAAGITADO);

    }

    public boolean getDiaDelPlatoFrances() {
        return diaDelPlatoFrances;
    }

    public void setDiaDelPlatoFrances(boolean diaDelPlatoFrances) {
        this.diaDelPlatoFrances = diaDelPlatoFrances;
        super.setPrecio(super.getPrecio()+super.getPrecio()*PLATOFRANCES);

    }

    public boolean getPropina() {
        return propina;
    }

    public void setPropina(boolean propina) {

        this.propina = propina;
        super.setPrecio(super.getPrecio()+super.getPrecio()*PROPINA);
    }*/


}
