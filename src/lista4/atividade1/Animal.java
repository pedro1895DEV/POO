package lista4.atividade1;

public class Animal {
    String nome;
    float comprimento;
    int numPatas;
    String cor;
    String ambiente;
    float velocidadeMédia;

    Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidadeMédia ){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMédia = velocidadeMédia;
    }

    @Override
    public String toString() {
        return "Nome do animal: " + nome + ", Comprimento do animal: " + comprimento + ", Número de patas do animal: " + numPatas + ", Cor do animal: " + cor + ", Ambiente do animal:" +  ambiente + ", Velocidade média do animal: " + velocidadeMédia;
    }
}
