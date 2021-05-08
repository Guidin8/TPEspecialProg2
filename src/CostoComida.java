import java.util.ArrayList;

public class CostoComida extends Comida{
    //private double costoInicial; lo saco porque el costo esta en Comidas
    private static final double PROPINA=0.10;
    private static final double DIAAGITADO=0.32;
    private static final double PLATOFRANCES=0.55;
    private boolean diaAgitado;
    private boolean diaDelPlatoFrances;
    private boolean propina;

    public CostoComida(String nombre, String tipo, String modoPreparacion, double calorias, double precio, int cantiMinutosParaPreparacion) {
        super(nombre, tipo, modoPreparacion, calorias, precio, cantiMinutosParaPreparacion);
        this.diaAgitado = false;
        this.diaDelPlatoFrances = false;
        this.propina = false;
    }

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
    }


}
