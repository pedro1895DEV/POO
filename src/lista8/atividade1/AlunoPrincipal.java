package lista8.atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoPrincipal {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número da matrícula do aluno: ");
        Aluno aluno1 = new Aluno (12345, "André", "Agronomia");
        Aluno aluno2 = new Aluno (32165, "Carlos", "Psicologia");
        Aluno aluno3 = new Aluno (89945, "Maria", "Medicina");

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        long mat = teclado.nextLong();
        int i;
        for (i = 0; i < 1; i ++) {
            if(mat == aluno1.getMatricula()){
                System.out.println(aluno1);
            }
            if(mat == aluno2.getMatricula()){
                System.out.println(aluno2);
            }
            if(mat == aluno3.getMatricula()){
                System.out.println(aluno3);
            }
        }

    }
}
