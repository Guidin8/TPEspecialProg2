import java.util.ArrayList;

public class main {
    public static void main (String args[]){
        /* PARA PRUEBA*/
        ArrayList<Comida> menu=new ArrayList<Comida>();
        Pedido mesa1=new Pedido(1,"Pepe");
        Comida papasFritas=new Comida("papas fritas","rapida","freir",180,90,10);
        Comida milanesa=new Comida("milanesa","rapida","freir",280,250,15);
        Comida pollo=new Comida("pollo","media","al espiedo",180,90,25);
        CostoComida prueba=new CostoComida("flan","postre","hornear",260,100,15);
        menu.add(papasFritas);
        menu.add(milanesa);
        menu.add(pollo);
        menu.add(prueba);
        prueba.setDiaDelPlatoFrances(true);
        System.out.println("Total de la Mesa "+mesa1.getNroMesa()+" = "+mesa1.costoTotalDeMesa());
        System.out.println(menu.get(3).getNombre()+" "+menu.get(3).getPrecio());











    }
}
