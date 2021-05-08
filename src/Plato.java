public class Plato {
    private Comida comidaPedida;
    private int cantidad;

    public Plato(Comida platoPedido, int cantidad) {
        this.comidaPedida = platoPedido;
        this.cantidad = cantidad;
    }

    public Comida getComidaPedida() {
        return comidaPedida;
    }

    public void setComidaPedida(Comida comidaPedida) {
        this.comidaPedida = comidaPedida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public double getPrecioPlato() {
        return this.comidaPedida.getPrecio() * this.getCantidad();
    }

    @Override
    public boolean equals(Object o) {
        Plato plato = (Plato) o;
        return comidaPedida.equals(plato.getComidaPedida())  ;
    }


}
