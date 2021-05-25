package app;

public class ComidaSimple extends Comida {
    private double precio;
    private int calorias;
    private int tiempo;

    public ComidaSimple(String nombre, String tipo, String modoPreparacion, double precio, int calorias, int tiempo) {
        super(nombre, tipo, modoPreparacion);
        this.precio = precio;
        this.calorias = calorias;
        this.tiempo = tiempo;
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }
    @Override
    public double getPrecio(){
        return this.precio;
    }
}
