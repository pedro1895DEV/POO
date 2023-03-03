package lista5.atividade3;

public class Funcionário {
    String nome;
    String sobrenome;
    int salário;
    String funcao;

    Funcionário(String nome, String sobrenome, int salário, String funcao){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salário = salário;
        this.funcao = funcao;

        if(salário < 0){
            this.salário = 0;
        }

    }

    String concat(){
        return "O nome do funcionário é: " + nome + ", O sobrenome é: " + sobrenome + ", o Salário desse funcionário é: R$" + salário + ", A funcão desse funcionário é: " + funcao;
    }

}
