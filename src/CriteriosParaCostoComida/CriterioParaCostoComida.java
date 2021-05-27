package CriteriosParaCostoComida;


import app.Comida;

public abstract class CriterioParaCostoComida {
    private String nombreCriterio;


    public CriterioParaCostoComida(String nombreCriterio) {
        this.nombreCriterio = nombreCriterio;
    }

    public abstract double agregarAlMonto();

}
