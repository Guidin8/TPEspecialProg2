public class EstacionSaleConFritas extends Estacion{

    public EstacionSaleConFritas(String nombre, String especialidad) {
        super(nombre, especialidad);
    }

    @Override
    public boolean aceptoComida(Comida comida) {
        return true;
    }
}
