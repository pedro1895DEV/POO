package lista4.atividade3;

public class CamaroteInferior extends Vip{
    String localIngresso;

    public CamaroteInferior(int valor ,int valorAdicional ,String localIngresso) {
        super(valor, valorAdicional,localIngresso);

        this.localIngresso = localIngresso;
    }

    String imprimirCamaroteInferior(){
        return "A localização do ingresso é: " + localIngresso;
    }

}
