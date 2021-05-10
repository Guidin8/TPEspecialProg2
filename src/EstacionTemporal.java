public class EstacionTemporal extends Estacion {
    private static int tiempoMax = 30;

    public EstacionTemporal(String nombre, String especialidad) {
        super(nombre, especialidad);
    }

    @Override
    public boolean aceptoComida(Comida comida) {
        return comida.getCantiMinutosParaPreparacion() < tiempoMax;
    }
}
