package app;

public class ComidaSimple extends Comida {
    private double precio;
    private int calorias;
    private int tiempo;

    /**
     * constructor de la comida simple
     * @param nombre
     * @param tipo
     * @param modoPreparacion
     * @param precio
     * @param calorias
     * @param tiempo
     */
    public ComidaSimple(String nombre, String tipo, String modoPreparacion, double precio, int calorias, int tiempo) {
        super(nombre, tipo, modoPreparacion);
        this.precio = precio;
        this.calorias = calorias;
        this.tiempo = tiempo;
    }

    /**
     * modifica el precio de esta comida
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * modifica la cantidad de calorias de la comida
     * @param calorias
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    /**
     * modifica el tiempo de preparacion de esta comida
     * @param tiempo
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * devuelve el tiempo de preparacion de la comida
     * @return
     */
    @Override
    public int getTiempo() {
        return this.tiempo;
    }

    /**
     * devuelve la cantidad de calorias de esta comida
     * @return
     */
    @Override
    public int getCalorias() {
        return this.calorias;
    }

    /**
     * devuelve el precio de esta comida
     * @return
     */
    @Override
    public double getPrecio(){
        return this.precio;
    }
}
