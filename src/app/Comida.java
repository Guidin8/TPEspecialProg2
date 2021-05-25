package app;

public abstract class Comida {
    private String nombre;
    private String tipo;
    private String modoPreparacion;

    public Comida(String nombre, String tipo, String modoPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModoPreparacion() {
        return modoPreparacion;
    }

    public void setModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }

    public abstract int getTiempo();
    public abstract int getCalorias();
    public abstract double getPrecio();

    @Override
    public boolean equals(Object o) {
        Comida comida = (Comida) o;
        return this.nombre.equals(comida.getNombre());
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                '}'+'\n';
    }
}
