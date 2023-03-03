package lista4.atividade2;

public class Automóvel {
    String nome;
    String marca;
    int ano;
    int kmRodados;
    String cor;

    void ligar(){
        System.out.println("O veículo ligou!");
    }

    void acelerar(){
        System.out.println("O veículo acelerou!");
    }

    Automóvel(String nome, String marca, int ano, int KmRodados, String cor){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.kmRodados = kmRodados;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Automóvel{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", kmRodados=" + kmRodados +
                ", cor='" + cor + '\'' +
                '}';
    }
}
