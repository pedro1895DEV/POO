package lista1;

import java.util.Scanner;

public class atividade5 {
    static int calcula(int valor){
        return valor * 73/100;
    };

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, impostos;
        System.out.println("Digite o custo de fábrica do carro:");
        valor = teclado.nextInt();

        impostos = calcula(valor);
        int total = impostos + valor;
        System.out.println("O valor final do carro é = R$" + total);
    }
}
