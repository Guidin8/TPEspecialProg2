package app;

import criterioComida.*;
import java.util.ArrayList;
import criterioCosto.*;

public class ComidaCompuesta extends Comida{

    ArrayList<Comida> comidasQueLaComponen;

    /**
     * constructor de la comida compuesta
     * @param nombre
     * @param tipo
     * @param modoPreparacion
     */
    public ComidaCompuesta(String nombre, String tipo, String modoPreparacion) {
        super(nombre, tipo, modoPreparacion);
        this.comidasQueLaComponen =new ArrayList<Comida>();
    }

    /**
     * al arreglo de comida compuesta se agregan solamente las que no se encuentran en dicho arreglo
     * @param comidaNueva
     */
    public void addComidaSimple(ComidaSimple comidaNueva){
        if (!comidasQueLaComponen.contains(comidaNueva)){
            comidasQueLaComponen.add(comidaNueva);
        }
    }

    /**
     * se obtiene el tiempo de preparacion de cada comida compuesta con la sumatoria del tiempo de preparacion
     * de cada comida simple
     * @return
     */
    @Override
    public int getTiempo() {
        int tiempoAuxiliar=0;
        for (Comida comi: comidasQueLaComponen){
            tiempoAuxiliar+= comi.getTiempo();
        }
        return tiempoAuxiliar;
    }

    /**
     * Se obtiene la cantidad de calorias de cada comida compuesta con la sumatioria del tiempo de
     * preparacion de cada comida simple
     * @return
     */
    @Override
    public int getCalorias() {
        int caloriasAuxiliar=0;
        for (Comida comi: comidasQueLaComponen){
            caloriasAuxiliar+= comi.getCalorias();
        }
        return caloriasAuxiliar;

    }

    /**
     * Se obtiene la cantidad de calorias de cada comida compuesta con la sumatioria del precio de
     * cada comida simple
     * @return
     */
    @Override
    public double getPrecio() {
        int precioAuxiliar=0;
        for (Comida comi: comidasQueLaComponen){
            precioAuxiliar+= comi.getPrecio();
        }
        return precioAuxiliar;
    }


}
