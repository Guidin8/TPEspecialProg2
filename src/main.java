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

        Pedido mesa1= new Pedido(1,"pepe");
        TipoComida esPostre= new TipoComida("postre");
        palacio.agregarCriterioAdicionalComida(esPostre,10);
        mesa1.agregarAlPedido(macarons);
        mesa1.agregarAlPedido(macarons);
        mesa1.agregarAlPedido(macarons);

        System.out.println((palacio.getCostoPedido(mesa1)));

        System.out.println(mesa1.getPlatosDeLaMesa());




    }
}
