package lista2.atividade2;

import java.util.Scanner;

public class Agenda extends Contato {
    String Nome;
    String Sobrenome;

    void mostrar (){
        System.out.println("O nome do usuário é: " + Nome);
        System.out.println("O sobrenome do usuário é: " + Sobrenome);
        System.out.println("O telefone do usuário é: " + Numero);
        System.out.println("O E-mail do usuário é: " + Email);
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda total = new Agenda();

        System.out.println("Digite o nome:");
        total.Nome = teclado.nextLine();
        System.out.println("Digite o sobrenome:");
        total.Sobrenome = teclado.nextLine();
        System.out.println("Digite o número de telefone:");
        total.Numero = teclado.nextLine();
        System.out.println("Digite o E-mail:");
        total.Email = teclado.nextLine();

        total.mostrar();
    }
}
