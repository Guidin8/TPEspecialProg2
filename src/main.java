import criterioComida.*;
import app.*;
import criterioCosto.ImporteCondicional;


public class main {
    public static void main (String args[]){
        Cocina palacio =new Cocina();

        ComidaCompuesta macarons = new ComidaCompuesta("macarons","postre","horno");
        ComidaSimple ganache =new ComidaSimple("ganache","postre","se compra",110,1200,30);
        ComidaSimple tapaMacarons =new ComidaSimple("tapamacarons","postre","horno",130,1780,45);
        macarons.addComidaSimple(ganache);
        macarons.addComidaSimple(tapaMacarons);
        Pedido mesa1=new Pedido(8,"Pepe");
        mesa1.agregarAlPedido(macarons);

        ModoPreparacion horno=new ModoPreparacion("horno");
        ImporteCondicional diaPlatoFrances=new ImporteCondicional(horno,100,10);
        Estacion estacion1=new Estacion("estacion1",horno);
        palacio.addEstacion(estacion1);
        palacio.asignarPedidoEstacion(mesa1);
        System.out.println(mesa1.costoTotalDeMesa(diaPlatoFrances));
        System.out.println(mesa1.costoTotalDeMesa());






    }
}
