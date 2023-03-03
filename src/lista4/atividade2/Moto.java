package lista4.atividade2;

public class Moto extends Automóvel{
    String categoria;
    int cilindrada;
    boolean temBaú;

    Moto(String nome, String marca, int ano, int KmRodados, String cor, String categoria, int cilindrada, boolean temBaú) {
        super(nome, marca, ano, KmRodados, cor);

        this.categoria = categoria;
        this.cilindrada = cilindrada;
        this.temBaú = temBaú;

    }

    @Override
    public String toString() {
        return "Moto{" +
                " Nome: " + nome  +
                ", Marca: " + marca +
                ", Ano de fabricação: " + ano +
                ", Quilometragem: " + kmRodados +
                ", Cor: " + cor +
                ", Categoria: " + categoria  +
                ", Cilindrada: " + cilindrada +
                ", Tem Baú: " + temBaú +
                '}';
    }
}
