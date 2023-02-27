package lista1;
import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();

        if(idade>=18){
            System.out.println("Você tem mais de 18 anos!");
        }
        else{
            System.out.println("Você tem menos de 18 anos!");
        }
    }
}
