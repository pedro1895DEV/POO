package lista1;

import java.util.Scanner;

public class atividade6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade, valorTotal, sal, valorRec;
        System.out.println("Digite a quantidade de carros vendida pelo vendedor:");
        quantidade = teclado.nextInt();
        System.out.println("Digite o valor total das vendas feitas pelo vendedor:");
        valorTotal = teclado.nextInt();
        System.out.println("Digite o salário fixo do vendedor:");
        sal = teclado.nextInt();
        System.out.println("Digite o valor recebido por venda:");
        valorRec = teclado.nextInt();

        int total = (quantidade * valorRec) + valorTotal * 5/100 + sal;
        System.out.println("O salário final do vendedor foi de = R$" + total);
    }
}
