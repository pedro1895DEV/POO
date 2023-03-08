package lista7.atividade5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maiorAleatório {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        int max = 10000;
        int min = 1;
        int range = max - min + 1;
        for (int i = 1; i < 100; i ++){
            numeros.add((int) (Math.random() * range ) +min);
        }
        Collections.sort(numeros);
        System.out.println(numeros);

        int maior = 0;
        for (Integer n: numeros) {
            if(n > maior)
                maior = n;
        }
        System.out.println("O maior valor é: " + maior);
    }
}
