package lista7.atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int n = 1;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o número " + n++);
            numeros.add(teclado.nextInt());
        }

        for (Integer num: numeros) {
            if(num < 40){
                System.out.println(num);
            }
        }
    }
}

