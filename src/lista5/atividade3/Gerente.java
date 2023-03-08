package lista5.atividade3;

public class Gerente extends Funcionário{
    int salMinGer = 5000;

    double alterarSalário(){
        if(salário < 5000){
            System.out.println("Salário do gerente não pode ser menor que: R$" + salMinGer);
        }
        return salMinGer;
    }

    Gerente(String nome, String sobrenome, int salário, String funcao) {
        super(nome, sobrenome, salário, funcao);
    }
}
