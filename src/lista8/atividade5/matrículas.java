package lista8.atividade5;

import java.util.HashMap;
import java.util.Map;

public class matrículas {
    public static void main(String[] args) {
        Map<String, Integer> alunos = new HashMap<>();

        alunos.put("Carlos", 369445863);
        alunos.put("Amanda", 369445863);
        alunos.put("Lúcio", 364578724);

        System.out.println(alunos);

    }
}
