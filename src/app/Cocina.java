package app;

import CriteriosParaCostoComida.AdicionalPorPorcentaje;
import CriteriosParaCostoComida.CriterioParaCostoComida;
import CriteriosParaCostoComida.Descuento;
import CriteriosParaCostoComida.SumarAdicionalExtra;
import criterioAdicional.CriterioAdicional;
import criterioComida.CriterioComida;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Estacion> estaciones;
    private CriterioComida adicionalComida;
    private CriterioAdicional adicionalEspecial;
    private double importeAdicional;


    //TODO ver con FEDE
    private CriterioParaCostoComida criterioParaCosto;

    public Cocina() {
        pedidos = new ArrayList<Pedido>();
        estaciones = new ArrayList<Estacion>();
        adicionalComida = null;
        adicionalEspecial = null;
    }

    public void addPedido(Pedido pedido){
         pedidos.add(pedido);
    }

    public void addEstacion(Estacion estacion){
        if(!estaciones.contains(estacion)) estaciones.add(estacion);
    }

    public double getCostoPedido(Pedido pedido){
        if(adicionalComida!=null){
            return pedido.costoTotalDeMesa(adicionalComida,importeAdicional) * (1+porcentajeAdicional()/100);
        }
        return pedido.costoTotalDeMesa() * (1+porcentajeAdicional()/100);
    }

    public double porcentajeAdicional(){
        if (adicionalEspecial==null){
            return 0;
        }
        return adicionalEspecial.getPorcentaje();
    }

    public void agregarCriterioAdicionalComida(CriterioComida criterio ,double importe){
        this.adicionalComida=criterio;
        this.importeAdicional=importe;
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
  //TODO VER CON FEDE

     public void addCriterioCobroAdicional(CriterioParaCostoComida criterio){
        this.criterioParaCosto=criterio;
     }


     //el porcentaje es parametro al igual que el nombre y pedido
     public double adicionarPorcentaje(Pedido pedido,String nombre, double porcentaje){
         CriterioParaCostoComida porcent=new AdicionalPorPorcentaje(nombre,porcentaje);
         // pedido debe adicionar esto
         return pedido.costoTotalDeMesa()*(1+porcent.agregarAlMonto()/100);
     }
     public double adicionarMonto(Pedido pedido,String nombre, double porcentaje){
        CriterioParaCostoComida porcent=new SumarAdicionalExtra(nombre,porcentaje);
        return pedido.costoTotalDeMesa()+porcent.agregarAlMonto();
    }

    public double descontarPorcentaje(Pedido pedido,String nombre, double porcentaje){
        CriterioParaCostoComida porcent=new Descuento(nombre,porcentaje);
        return pedido.costoTotalDeMesa()-(1+porcent.agregarAlMonto()/100);
    }

    public double cerrarMesa(Pedido pedido){
        double total=0;
        total+=pedido.costoTotalDeMesa();
        return total;


    }




}

