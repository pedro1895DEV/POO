package lista5.atividade1;

public class CalculadoraPrincipal {
    public static void main(String[] args) {
        CalculadoraUtil calc = new CalculadoraUtil(2,4,6);

        System.out.println("Soma de dois números: " + calc.soma2());
        System.out.println("Soma de três números: " + calc.soma3());
        System.out.println("Subtração de dois números: " + calc.subtrai2());
        System.out.println("Subtração de três números: " + calc.subtrai3());
        System.out.println("Multiplicação de dois números: " + calc.multiplica2());
        System.out.println("Multiplicação de três números: " + calc.multiplica3());
        System.out.println("Divisão de dois números: " + calc.divide2());
        System.out.println("Divisão de três números: " + calc.divide3());
    }
}
