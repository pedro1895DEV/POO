package lista7.atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NegativosSoma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int n = 1;
        for(int i = 0; i < 8; i++){
            System.out.println("Digite o número " + n++);
            numeros.add(teclado.nextInt());
        }
        for (Integer num : numeros) {
            if(num < 0){
                System.out.println(num);
            }
        }
        int soma = 0;
        for (Integer numero : numeros) {
            if(numero > 0) {
                soma += numero;
            }
        }
        System.out.println("Soma dos positivos = " + soma);

    }
}
