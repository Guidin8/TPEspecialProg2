package app;

import criterioCosto.CriterioCosto;
import app.*;
import java.util.ArrayList;

public class Cocina {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Estacion> estaciones;
    private CriterioCosto costoAdicionalComida;

    public Cocina() {
        pedidos = new ArrayList<Pedido>();
        estaciones = new ArrayList<Estacion>();
    }

    /**
     * agrega un pedido al arreglo de pedidos
     * @param pedido
     */
    public void addPedido(Pedido pedido){
         pedidos.add(pedido);
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
     * la recibe o no
     * @param comidaParaEstacion
     */
    public void asignarPedidoEstacion (Pedido comidaParaEstacion){
        for (Estacion sector: this.estaciones){
            for(Comida comida:comidaParaEstacion.getPlatosDeLaMesa()){
                if(sector.recibeComida(comida)){
                    sector.setComida(comida);
                }
            }
        }
    }

    public void setCriterio(CriterioCosto criterio){
        costoAdicionalComida = criterio;
    }

}

