package app;
import java.util.ArrayList;

public class ComidaCompuesta extends Comida{
    ArrayList<Comida> comidasQueLaComponen;

    public ComidaCompuesta(String nombre, String tipo, String modoPreparacion) {
        super(nombre, tipo, modoPreparacion);
        this.comidasQueLaComponen =new ArrayList<Comida>();
    }

    public void addComidaSimple(ComidaSimple comidaNueva){
        if (!comidasQueLaComponen.contains(comidaNueva)){
            comidasQueLaComponen.add(comidaNueva);
        }
    }

    @Override
    public int getTiempo() {
        int tiempoAuxiliar=0;
        for (Comida comi: comidasQueLaComponen){
            tiempoAuxiliar+= comi.getTiempo();
        }
        return tiempoAuxiliar;
    }

    @Override
    public int getCalorias() {
        int caloriasAuxiliar=0;
        for (Comida comi: comidasQueLaComponen){
            caloriasAuxiliar+= comi.getCalorias();
        }
        return caloriasAuxiliar;

    }

    @Override
    public double getPrecio() {
        int precioAuxiliar=0;
        for (Comida comi: comidasQueLaComponen){
            precioAuxiliar+= comi.getPrecio();
        }
        return precioAuxiliar;
    }


}
