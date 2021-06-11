package app;

import criterioCosto.CriterioCosto;
import app.*;
import java.util.ArrayList;

public class Cocina {
    private ArrayList<Estacion> estaciones;
    private CriterioCosto costoAdicionalComida;

    public Cocina() {
        estaciones = new ArrayList<Estacion>();
    }

    /**
     * agrega una estacion nueva al arreglo de estaciones
     * @param estacion
     */
    public void addEstacion(Estacion estacion){
        if(!estaciones.contains(estacion)) estaciones.add(estacion);
    }

    /**
     * obtiene el costo del pedido, si teiene algun criterio adicional al costo, lo agrega, sino
     * devuelve el costo total del pedido
     * @param pedido
     * @return
     */
    public double getCostoPedido(Pedido pedido){
        if(costoAdicionalComida!=null){
            return pedido.costoTotalDeMesa(costoAdicionalComida);
        }
        return pedido.costoTotalDeMesa();
    }

    /**
     * se agraga o modifica un criterio para un costo adicional
     * @param costoAdicionalComida
     */
    public void setCostoAdicionalComida(CriterioCosto costoAdicionalComida) {
        this.costoAdicionalComida = costoAdicionalComida;
    }

    /**
     * se asigna una comida a una estacion buscando en el pedido cada comida y preguntando a la estacion si
     * la recibe o no.
     * Se considera que si o si hay una estacion que va a recibir la comida.
     * @param comidaParaEstacion
     */
    public void asignarPedidoEstacion (Pedido comidaParaEstacion){
        for (Estacion sector: this.estaciones){
            for(Comida comida:comidaParaEstacion.getPlatosDeLaMesa()){
                if(sector.recibeComida(comida)){
                    sector.setComida(comida);
                }
            }
            break;
        }
    }

    public void setCriterio(CriterioCosto criterio){
        costoAdicionalComida = criterio;
    }

}

