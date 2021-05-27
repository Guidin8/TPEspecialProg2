package CriteriosParaCostoComida;

import app.Comida;

public class AdicionalPorPorcentaje extends CriterioParaCostoComida{
    private double porPorcentaje;

    public AdicionalPorPorcentaje(String nombreCriterio, double porPorcentaje) {
        super(nombreCriterio);
        if((porPorcentaje<=100)&&(porPorcentaje>=0)){
            this.porPorcentaje = porPorcentaje;
        }else{
            this.porPorcentaje=0;
        }
    }




    @Override
    public double agregarAlMonto() {

        return porPorcentaje;
    }
}
