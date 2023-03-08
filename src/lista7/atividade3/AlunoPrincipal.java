package lista7.atividade3;

import java.util.ArrayList;
import java.util.List;

public class AlunoPrincipal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();

        List<Integer> notas = new ArrayList<>();

        //Aluno 1
        notas.add(0, 8);
        notas.add(1, 7);

        //Aluno2
        notas.add(2, 6);
        notas.add(3, 7);

        //Aluno3
        notas.add(4, 9);
        notas.add(5, 8);

        //Aluno4
        notas.add(6, 10);
        notas.add(7, 6);

        //Aluno1-Geral
        aluno.setNome("André");
        aluno.setNota1Bimestre(notas.get(0));
        aluno.setNota2Bimestre(notas.get(1));

        //Aluno2-Geral
        aluno2.setNome("João");
        aluno2.setNota1Bimestre(notas.get(2));
        aluno2.setNota2Bimestre(notas.get(3));

        //Aluno3-Geral
        aluno3.setNome("Maria");
        aluno3.setNota1Bimestre(notas.get(4));
        aluno3.setNota2Bimestre(notas.get(5));

        //Aluno4-Geral
        aluno4.setNome("Ana");
        aluno4.setNota1Bimestre(notas.get(6));
        aluno4.setNota2Bimestre(notas.get(7));

        System.out.println("Nome do aluno: " + aluno.getNome() +"\nNota do primeiro bimestre: " +aluno.getNota1Bimestre() +"\nNota do segundo bimestre: "+ aluno.getNota2Bimestre());
        System.out.println("\nNome do aluno: " + aluno2.getNome() +"\nNota do primeiro bimestre: " +aluno2.getNota1Bimestre() +"\nNota do segundo bimestre: "+ aluno2.getNota2Bimestre());
        System.out.println("\nNome do aluno: " + aluno3.getNome() +"\nNota do primeiro bimestre: " +aluno3.getNota1Bimestre() +"\nNota do segundo bimestre: "+ aluno3.getNota2Bimestre());
        System.out.println("\nNome do aluno: " + aluno4.getNome() +"\nNota do primeiro bimestre: " +aluno4.getNota1Bimestre() +"\nNota do segundo bimestre: "+ aluno4.getNota2Bimestre());
    }
}
