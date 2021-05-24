package App;

import App.Estacion;
import criterioComida.CriterioComida;

import java.util.ArrayList;

public class Cocina {
    //private ArrayList<App.Pedido> pedidos;
    private ArrayList<Estacion> estaciones;
    private CriterioComida adicionalComida;

    public Cocina() {
        //pedidos = new ArrayList<App.Pedido>();
        estaciones = new ArrayList<Estacion>();
    }

    /*public void addPedido(App.Pedido pedido){
        //TODO falta implementar equals en pedido
        if (!pedidos.contains(pedido)) pedidos.add(pedido);
    }*/

    public void addEstacion(Estacion estacion){
        if(!estaciones.contains(estacion)) estaciones.add(estacion);
    }

    public double getCostoPedido(Pedido pedido){
        return pedido.getCosto(adicionalComida);
    }
}
