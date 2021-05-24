import java.util.ArrayList;

public  class Pedido {
    protected ArrayList<Plato> platosDeLaMesa;
    private int nroMesa;
    private String mozo;
    private CostoComida costoTotal;

    public Pedido(int nroMesa, String mozo) {
        this.nroMesa = nroMesa;
        this.mozo = mozo;
        this.platosDeLaMesa =new ArrayList<Plato>();
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


    public ArrayList<Plato> getPlatosDeLaMesa() {
        return platosDeLaMesa;
    }

    public void agregarAlPedido(Plato platoParaAgregar, int cant ){
        if (platosDeLaMesa.contains(platoParaAgregar)){
            platoParaAgregar.setCantidad(cant);
        }else{
            platosDeLaMesa.add(platoParaAgregar);
        }
    }

    /*
    public  double costoTotalDeMesa() {
        double subtotal = 0;
        for (int posiPedido = 0; posiPedido < this.platosDeLaMesa.size(); posiPedido++) {
            subtotal+=this.platosDeLaMesa.get(posiPedido).getPrecioPlato();
        }
        return subtotal;
    }
    */



}
