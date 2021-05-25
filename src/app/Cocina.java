package app;

import criterioAdicional.CriterioAdicional;
import criterioComida.CriterioComida;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Estacion> estaciones;
    private CriterioComida adicionalComida;
    private CriterioAdicional adicionalEspecial;
    private double porcentajeComida;
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
        if(adicionalComida!=null){
            return pedido.costoTotalDeMesa(adicionalComida,porcentajeComida) * (1+porcentajeAdicional());
        }
        return pedido.costoTotalDeMesa() * (1+porcentajeAdicional());
    }

    public double porcentajeAdicional(){
        if (adicionalEspecial==null){
            return 0;
        }
        return adicionalEspecial.getPorcentaje()/100;
    }



    public void agregarCriterioAdicionalComida(CriterioComida criterio ,double porcentaje){
        this.adicionalComida=criterio;
        this.porcentajeComida=porcentaje;
    }


    public void setAdicionalEspecial(CriterioAdicional adicionalComida) {
        this.adicionalEspecial = adicionalComida;
    }

    public void asignarPedidoEstacion ( Comida comidaParaEstacion){
        for (Estacion sector: this.estaciones){
            if(sector.recibeComida(comidaParaEstacion)){
                sector.setComida(comidaParaEstacion);
            }
        }
    }

}

