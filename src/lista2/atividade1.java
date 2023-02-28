package lista2;

import java.util.Scanner;

public class atividade1 {

    String modelo;
    String preco;
    String tempoDeDuracao;
    String tipo;
    boolean ligada;

    void acender(){
        if(ligada){
            System.out.println("Lâmpada já está ligada");
        }
        else{
            System.out.println("Lâmpada foi acesa");
        }
    }

    void apagar(){
        if(ligada){
            System.out.println("Lâmpada já está desligada");
        }
        else{
            System.out.println("Lâmpada foi apagada");
        }
    }

    void descrever(){
        System.out.println("A lâmpada é do modelo: " + modelo);
        System.out.println("A lâmpada custa: R$ " + preco);
        System.out.println("A lâmpada dura: " + tempoDeDuracao);
        System.out.println("A lâmpada é do tipo: " + tipo);
        if(ligada){
            System.out.println("Lâmpada está acesa!");
        }
        else {
            System.out.println("A lâmpada está apagada!");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        atividade1 Lampada = new atividade1();

        System.out.println("Digite o modelo da lâmpada:");
        Lampada.modelo = teclado.nextLine();
        System.out.println("Digite o preço da lâmpada:");
        Lampada.preco = teclado.nextLine();
        System.out.println("Digite a duração da lâmpada:");
        Lampada.tempoDeDuracao = teclado.nextLine();
        System.out.println("Digite o tipo da lâmpada:");
        Lampada.tipo = teclado.nextLine();

        Lampada.descrever();
    }

}
