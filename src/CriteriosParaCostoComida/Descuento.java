package CriteriosParaCostoComida;

import app.Comida;

public class Descuento extends CriterioParaCostoComida {
    private double descontar;

    public Descuento(String nombreCriterio, double descontar) {
        super(nombreCriterio);
        if((descontar<=100)&&(descontar>=0)){
            this.descontar = descontar;
        }else{
            this.descontar=0;
        }
    }

    @Override
    public double agregarAlMonto() {
        return descontar;
    }
}
