package lista4.atividade2;

public class PrincipalAutomóvel {
    public static void main(String[] args) {
        Automóvel auto = new Automóvel("Camaro", "Chevrolet", 2022, 0, "Amarelo");
        Carro carro = new Carro("Camaro", "Chevrolet", 2022, 0, "Amarelo", 5, 50,true);
        Moto moto = new Moto("Turana", "Honda", 2022, 0, "Preta", "Sporting", 160, false);
        System.out.println(carro.toString());
        System.out.println(moto.toString());

        auto.ligar();
        auto.acelerar();
    }
}