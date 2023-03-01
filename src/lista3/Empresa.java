package lista3;

import java.lang.constant.Constable;

public class Empresa {
    String nome;
    String sobrenome;
    int salário;
    String funcao;

    Empresa(String nome, String sobrenome, int salário, String funcao){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salário = salário;
        this.funcao = funcao;

        if(salário < 0){
            this.salário = 0;
        }

    }

    String concat(){
        return "O nome do funcionário é: " + nome + " O sobrenome é: " + sobrenome + " o Salário desse funcionário é: R$" + salário + " A funcão desse funcionário é: " + funcao;
    }

    public static void main(String[] args) {
        Empresa empre = new Empresa("José", "Sousa", 200, "Desenvolvedor Full Stack");
        System.out.println(empre.concat());
    }

}
