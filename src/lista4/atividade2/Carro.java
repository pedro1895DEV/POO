package lista4.atividade2;

public class Carro extends Automóvel{
    int numeroAirbags;
    int volumePortaMalas;
    boolean multimídias;

    Carro(String nome, String marca, int ano, int KmRodados, String cor, int numeroAirbags, int volumePortaMalas, boolean multimídias) {
        super(nome, marca, ano, KmRodados, cor);

            this.numeroAirbags = numeroAirbags;
            this.volumePortaMalas = volumePortaMalas;
            this.multimídias = multimídias;

    }

    @Override
    public String toString() {
        return "Carro{" +
                " Nome: " + nome  +
                ", Marca: " + marca +
                ", Ano de fabricação: " + ano +
                ", Quilometragem : " + kmRodados +
                ", Cor: " + cor +
                ", Número de AirBags: " + numeroAirbags +
                ", Volume do Porta Malas: " + volumePortaMalas +
                ", Possui multimídias: " + multimídias +
                "}";
    }
}
