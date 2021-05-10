public class EstacionPorTipo extends Estacion{
    public EstacionPorTipo(String nombre, String especialidad) {
        super(nombre, especialidad);
    }

    @Override
    public boolean aceptoComida(Comida comida) {
        return getEspecialidad().equals(comida.getTipo());
    }
}
