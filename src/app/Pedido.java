package app;
import CriteriosParaCostoComida.CriterioParaCostoComida;
import criterioAdicional.CriterioAdicional;
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

    int getNroMesa() {
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

    /**
     * agrega a cada mesa un nuevo pedido
     * @param platoParaAgregar
     */
    public void agregarAlPedido(Comida platoParaAgregar ){
        platosDeLaMesa.add(platoParaAgregar);

    }

    /**
     * esta funcion devuelve el costo total del pedido de la mesa
     * @param criterio  es el criterio
     * @param porcentaje
     * @return
     */
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
