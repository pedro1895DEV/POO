package lista5.atividade2;

public class StringPrincipal {
    public static void main(String[] args) {
        StringUtil frase = new StringUtil("Olá,", " João", " Fernando");

        System.out.println(frase.retorna2());
        System.out.println(frase.retorna3());
        System.out.println(frase.verifica2());
        System.out.println(frase.verifica3());
    }
}
