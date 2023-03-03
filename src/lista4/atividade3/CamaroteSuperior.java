package lista4.atividade3;

public class CamaroteSuperior extends Vip{


    public CamaroteSuperior(int valor, int valorAdicional, String localIngresso) {
        super(valor, valorAdicional, localIngresso);

        this.valor = valor;
    }
    String imprimirCamaroteSuperior(){
        return "O valor do camarote superior é: " + valor * 1.30;
    }
}
