package lista4.atividade3;

public class PrincipalIngresso {
    public static void main(String[] args) {
        Ingresso ingre = new Ingresso(20);
        Vip vip = new Vip(30, 10, "Zona Vip");
        Normal normal = new Normal(20);
        CamaroteInferior camaInf = new CamaroteInferior(35, 10, "Piso inferior");
        CamaroteSuperior camaSup = new CamaroteSuperior(40, 15, "Piso superior");

        System.out.println(ingre.imprimeValor());
        System.out.println("Valor do ingresso Vip: " + vip.retornaVip());
        System.out.println(normal.imprimeValor());
        System.out.println(camaInf.imprimirCamaroteInferior());
        System.out.println(camaSup.imprimirCamaroteSuperior());
    }
}
