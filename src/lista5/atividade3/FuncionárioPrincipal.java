package lista5.atividade3;

import lista3.Empresa;

public class FuncionárioPrincipal {
    public static void main(String[] args) {
        Funcionário empre = new Funcionário("José", "Sousa", 2000, "Desenvolvedor Full Stack");
        Gerente gere = new Gerente("Fernando", "Santos", 4000, "Gerente");

        System.out.println(empre.concat());
        System.out.println(gere.concat());
        gere.alterarSalário();
    }
}