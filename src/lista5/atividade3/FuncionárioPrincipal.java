package lista5.atividade3;

import lista3.Empresa;

public class FuncionárioPrincipal {
    public static void main(String[] args) {

        Gerente gere = new Gerente("Fernando", "Santos", 1000, "Gerente");


        System.out.println(gere.concat());
        System.out.println(gere.alterarSalário());
    }
}