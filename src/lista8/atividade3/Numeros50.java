package lista8.atividade3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numeros50 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i < 51; i++) {
            numeros.add(i);
        }
        for(int j = 0; j < 50; j++){
            System.out.println(numeros.get(j));
        }
        Collections.shuffle(numeros);
    }
}
