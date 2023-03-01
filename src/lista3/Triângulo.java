package lista3;

public class Triângulo {
    int lado1;
    int lado2;
    int lado3;

    Triângulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

        if(lado1 <=0 || lado2<=0||lado3 <=0){
            System.err.println("Um lado não pode ser zero ou negativo ou maior que a soma dos outros dois lados.");
        }

    }
    int calcularPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }

    public static void main(String[] args) {
        Triângulo tri = new Triângulo(2, 3, 1);

        System.out.println("Perímetro = " + tri.calcularPerimetro());
    }

}
