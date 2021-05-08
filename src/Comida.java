import java.util.Objects;

public class Comida {
    private String nombre;
    private String tipo;
    private String modoPreparacion;
    private double calorias;
    private double precio;
    private int cantiMinutosParaPreparacion;

    public Comida(String nombre, String tipo, String modoPreparacion, double calorias, double precio, int cantiMinutosParaPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
        this.calorias = calorias;
        this.precio = precio;
        this.cantiMinutosParaPreparacion = cantiMinutosParaPreparacion;
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

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantiMinutosParaPreparacion() {
        return cantiMinutosParaPreparacion;
    }

    public void setCantiMinutosParaPreparacion(int cantiMinutosParaPreparacion) {
        this.cantiMinutosParaPreparacion = cantiMinutosParaPreparacion;
    }

    @Override
    public boolean equals(Object o) {
        Comida comida = (Comida) o;
        return this.nombre.equals(comida.getNombre());
    }


}
