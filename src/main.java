import CriteriosParaCostoComida.AdicionalPorPorcentaje;
import CriteriosParaCostoComida.Descuento;
import CriteriosParaCostoComida.SumarAdicionalExtra;
import app.*;
import criterioAdicional.*;
import criterioComida.*;



public class main {
    public static void main (String args[]){
        Cocina palacio =new Cocina();

        ComidaCompuesta macarons = new ComidaCompuesta("macarons","postre","mucho trabajo");
        ComidaSimple ganache =new ComidaSimple("ganache","postre","se compra",110,1200,30);
        ComidaSimple tapaMacarons =new ComidaSimple("tapamacarons","postre","lleva su tiempo",130,1780,45);
        macarons.addComidaSimple(ganache);
        macarons.addComidaSimple(tapaMacarons);

        /*Pedido mesa1= new Pedido(1,"pepe");
        TipoComida esPostre= new TipoComida("postre");
        palacio.agregarCriterioAdicionalComida(esPostre,10);
        mesa1.agregarAlPedido(macarons);
        mesa1.agregarAlPedido(macarons);
        mesa1.agregarAlPedido(macarons);

        System.out.println(("Mesa 1 "+ palacio.getCostoPedido(mesa1)));*/


        //TODO OJO ACA PRUEBO EL ENGENDRO QUE HICE VER CON FEDE

        Pedido mesa2=new Pedido(2,"pepe2");
        mesa2.agregarAlPedido(macarons);
        mesa2.agregarAlPedido(macarons);
        mesa2.agregarAlPedido(macarons);
        //AdicionalPorPorcentaje porcentaje=new AdicionalPorPorcentaje("cualquiera",100);
        //palacio.addCriterioCobroAdicional(porcentaje);
        //Descuento descuento=new Descuento("descontar",10);
        //palacio.addCriterioCobroAdicional(descuento);
        //SumarAdicionalExtra sumo=new SumarAdicionalExtra("extra",80);
        //palacio.addCriterioCobroAdicional(sumo);
        System.out.println("Mesa 2 "+palacio.cerrarMesa(mesa2));



    }
}
