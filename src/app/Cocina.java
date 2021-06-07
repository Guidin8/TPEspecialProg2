package app;

import criterioCosto.CriterioCosto;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Estacion> estaciones;
    private CriterioCosto costoAdicionalComida;

    public Cocina() {
        pedidos = new ArrayList<Pedido>();
        estaciones = new ArrayList<Estacion>();
    }

    public void addPedido(Pedido pedido){
         pedidos.add(pedido);
    }

    public void addEstacion(Estacion estacion){
        if(!estaciones.contains(estacion)) estaciones.add(estacion);
    }

    public double getCostoPedido(Pedido pedido){
        if(costoAdicionalComida!=null){
            return pedido.costoTotalDeMesa(costoAdicionalComida);
        }
        return pedido.costoTotalDeMesa();
    }

    public void asignarPedidoEstacion (Pedido pedido){
        for (Estacion sector: this.estaciones){
            for (Comida comidaParaEstacion: pedido.getComidas()) {
                if(sector.recibeComida(comidaParaEstacion)){
                    sector.setComida(comidaParaEstacion);
                }
            }
        }
    }

    public void setCriterio(CriterioCosto criterio){
        costoAdicionalComida = criterio;
    }

}

