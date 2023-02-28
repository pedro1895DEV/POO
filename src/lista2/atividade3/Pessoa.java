package lista2.atividade3;

import java.util.Scanner;

public class Pessoa {
    String Nome;
    String Idade;
    String Pai;
    String Mãe;

    void mostrar (){
        System.out.println("O nome da pessoa é: " + Nome);
        System.out.println("A pessoa tem: " + Idade + "anos");
        System.out.println("O pai dessa pessoa é:" + Pai);
        System.out.println("A mãe da pessoa é: " +  Mãe);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa geral = new Pessoa();

        System.out.println("Digite o nome da pessoa:");
        geral.Nome = teclado.nextLine();
        System.out.println("Digite a idade da pessoa:");
        geral.Idade = teclado.nextLine();
        System.out.println("Digite o nome do pai da pessoa:");
        geral.Pai = teclado.nextLine();
        System.out.println("DIgite o nome da mãe da pessoa:");
        geral.Mãe = teclado.nextLine();

        geral.mostrar();
    }

}
