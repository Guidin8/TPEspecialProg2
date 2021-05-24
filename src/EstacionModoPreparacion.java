public class EstacionModoPreparacion extends Estacion{

    public EstacionModoPreparacion(String nombre, String especialidad) {
        super(nombre, especialidad);
    }

    @Override
    public boolean aceptoComida(Comida comida) {
        return getEspecialidad().equals(comida.getModoPreparacion());
    }
}
