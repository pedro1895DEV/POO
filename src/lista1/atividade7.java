package lista1;

import java.util.Scanner;

public class atividade7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidade1, quantidade2;
        System.out.println("Digite a quantidade de quilos de Morangos:");
        quantidade1 = teclado.nextInt();
        System.out.println("Digite a quantidade de quilos de Maçãs:");
        quantidade2 = teclado.nextInt();

        if (quantidade1 < 5){
            System.out.println("O valor total da compra de Morangos é = R$" +  quantidade1 * 2.50);
        }
        if(quantidade1 > 5 && quantidade1 < 8) {
            System.out.println("O valor total da compra de Morangos é = R$" + quantidade1 * 2.20);
        }
        if (quantidade1 > 8){
            System.out.println("O valor da compra de Morangos é = R$" + quantidade1 * 2.20 * 0.90 );
        }
        if (quantidade2 < 5){
            System.out.println("O valor total da compra de Maçãs é = R$" +  quantidade2 * 1.89);
        }
        if(quantidade2 > 5 && quantidade1 < 8) {
            System.out.println("O valor total da compra de Maçãs é = R$" + quantidade2 * 1.50);
        }
        if (quantidade2 > 8){
            System.out.println("O valor da compra de Maçãs é = R$" + quantidade2 * 1.50 * 0.90 );
        }
    }
}
