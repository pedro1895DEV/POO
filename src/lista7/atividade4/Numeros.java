package lista7.atividade4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int n = 1;
        for(int i = 0; i < 15; i++){
            System.out.println("Digite o número " + n++);
            numeros.add(teclado.nextInt());
        }
        int soma = 0;
        int cont = 0;
        for (Integer numero : numeros) {
            soma += numero;
            cont++;
        }
        System.out.println("Soma dos números informados = " + soma);

        int médiaAritmética = soma/cont;

        System.out.println("Média aritmética dos números informados = " + médiaAritmética);
    }
}
