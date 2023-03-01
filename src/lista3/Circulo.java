package lista3;

public class Circulo {
    double raio;

    Circulo(double raio) {

        if(raio < 0){
            System.err.println("O raio não pode ser negativo!");
        }

    }

    double calcularArea(){
        return Math.PI * Math.pow(this.raio , 2);
    }
    double calcularComprimento(){
        return 2 * Math.PI * this.raio;
    }

    public static void main(String[] args) {
        Circulo circ = new Circulo(1.0);

        System.out.println("Área = "+circ.calcularArea());
        System.out.println("Comprimento = "+circ.calcularComprimento());

    }

}
