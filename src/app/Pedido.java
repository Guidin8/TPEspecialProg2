package app;
import criterioAdicional.PorcentajeExtra;
import criterioComida.CriterioComida;

import java.util.ArrayList;

public  class Pedido {
    protected ArrayList<Comida> platosDeLaMesa;
    private int nroMesa;
    private String mozo;

    public Pedido(int nroMesa, String mozo) {
        this.nroMesa = nroMesa;
        this.mozo = mozo;
        this.platosDeLaMesa =new ArrayList<Comida>();
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }


    public ArrayList<Comida> getPlatosDeLaMesa() {
        return platosDeLaMesa;
    }

    public void agregarAlPedido(Comida platoParaAgregar ){
        platosDeLaMesa.add(platoParaAgregar);

    }


    public  double costoTotalDeMesa(CriterioComida criterio, double porcentaje) {
        double subtotal = 0;
        for(Comida plato:this.platosDeLaMesa){
            if(criterio.cumple(plato)){
               subtotal+= plato.getPrecio() * (1+porcentaje/100);
            }else{
                subtotal+=plato.getPrecio();
            }
        }
        return subtotal;
    }

    public  double costoTotalDeMesa() {
        double subtotal = 0;
        for(Comida plato:this.platosDeLaMesa){
           subtotal+=plato.getPrecio();

        }
        return subtotal;
    }



}
