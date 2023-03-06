package lista6.atividade3;

public class Prova extends Avaliação{
    private double tempoDuracao;
    private int quantidadeDeQuestoes;
    private boolean consultaAutorizada;

    public double getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public int getQuantidadeDeQuestoes() {
        return quantidadeDeQuestoes;
    }

    public void setQuantidadeDeQuestoes(int quantidadeDeQuestoes) {
        this.quantidadeDeQuestoes = quantidadeDeQuestoes;
    }

    public boolean isConsultaAutorizada() {
        return consultaAutorizada;
    }

    public void setConsultaAutorizada(boolean consultaAutorizada) {
        this.consultaAutorizada = consultaAutorizada;
    }
}
