package lista4.atividade1;

public class Peixe extends Animal{
    String característica;

    Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidadeMédia) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMédia);
    }

    @Override
    public String toString() {
        return "Nome do peixe: " + this.nome + ", Comprimento do peixe: " + this.comprimento + ", Número de patas do peixe: " + this.numPatas +
                ", Cor do peixe: " + this.cor + ", Ambiente do peixe:" +  this.ambiente + ", Velocidade média do peixe: " + this.velocidadeMédia;
    }
}
