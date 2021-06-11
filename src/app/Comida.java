package app;

public abstract class Comida {

    private String nombre;
    private String tipo;
    private String modoPreparacion;

    /**
     * constructor de la clase abstracta comida
     * @param nombre
     * @param tipo
     * @param modoPreparacion
     */
    public Comida(String nombre, String tipo, String modoPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
    }

    /**
     * devuelve el nombre de la comida
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * modifica el nombre de una Comida
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve el tipo de la comida
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * modifica el tipo de la comida
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * devuelve el modo de preparacion
     * @return
     */
    public String getModoPreparacion() {
        return modoPreparacion;
    }

    /**
     * modifica el modo de preparacion
     * @param modoPreparacion
     */
    public void setModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }

    /**
     * metodos abstractos para obtener el tiempo de preparacion, las calorias y el precio de cada comida
     * @return
     */
    public abstract int getTiempo();
    public abstract int getCalorias();
    public abstract double getPrecio();

    /**
     * se redefine el metodo equals para saber si una comida es uigual a otra,
     * se compara solamente con el nombre de la misma
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        Comida comida = (Comida) o;
        return this.nombre.equals(comida.getNombre());
    }

    /**
     * se redefine el metodo toString para que muestre de cada comida solamente el nombre
     * @return
     */
    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                '}'+'\n';
    }
}
