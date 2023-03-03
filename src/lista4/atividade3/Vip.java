package lista4.atividade3;

public class Vip extends Ingresso{
    int valorAdicional;

    Vip(int valor, int valorAdicional, String localIngresso) {
        super(valorAdicional);

        this.valorAdicional = valorAdicional;
    }

    int retornaVip(){
        return valorAdicional;
    }
}
