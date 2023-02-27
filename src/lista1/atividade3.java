package lista1;
import java.util.Scanner;

public class atividade3 {
    static double real (double numero){
        return numero * 4.05;
    };
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero, resultado;
        System.out.println("Digite um valor em real:");
        numero = teclado.nextInt();

        resultado = real(numero);
        System.out.println("Valor em dólar = " + resultado);

    }
}
