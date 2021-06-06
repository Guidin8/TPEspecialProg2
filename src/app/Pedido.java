package app;

import criterioCosto.CriterioCosto;
import java.util.ArrayList;

public  class Pedido {
    protected ArrayList<Comida> platosDeLaMesa;
    private int nroMesa;
    private String mozo;

    /**
     * constructor del pedido
     * @param nroMesa
     * @param mozo
     */
    public Pedido(int nroMesa, String mozo) {
        this.nroMesa = nroMesa;
        this.mozo = mozo;
        this.platosDeLaMesa =new ArrayList<Comida>();
    }

    /**
     * devuelve el numero de la mesa
     * @return
     */
    int getNroMesa() {
        return nroMesa;
    }

    /**
     * modifica el numero de la mesa
     * @param nroMesa
     */
    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    /**
     * devuelve el nombre del mozo
     * @return
     */
    public String getMozo() {
        return mozo;
    }

    /**
     * modifica el nombre del mozo
     * @param mozo
     */
    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    /**
     * devuelve una copia de las comidas pedidas por una mesa
     * @return
     */
    public ArrayList<Comida> getPlatosDeLaMesa() {
        ArrayList<Comida> copia = new ArrayList<Comida>();
        copia.addAll(this.platosDeLaMesa);
        return copia;
    }

    /**
     * agrega a cada mesa un nuevo pedido
     * @param platoParaAgregar
     */
    public void agregarAlPedido(Comida platoParaAgregar ){

        this.platosDeLaMesa.add(platoParaAgregar);
    }

    /**
     * esta funcion devuelve el costo total del pedido de la mesa
     * @param criterio  es el criterio
     * @return
     */
    public double costoTotalDeMesa(CriterioCosto criterio) {
        double subtotal = 0;
        for(Comida plato:this.platosDeLaMesa){
            subtotal += plato.getPrecio() + criterio.costoAdicionalComida(plato);
        }
        return subtotal;
    }

    /**
     * obtiene el costo total del pedido de la mesa
     * @return
     */
    public double costoTotalDeMesa() {
        double subtotal = 0;
        for(Comida plato:this.platosDeLaMesa){
           subtotal+=plato.getPrecio();
        }
        return subtotal;
    }
}
