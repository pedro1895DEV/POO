package lista6.atividade2;

public class Assalariado extends Empregado{
    private double Salário;

    @Override
    public double vencimento() {
        return super.vencimento();
    }

    public double getSalário() {
        return Salário;
    }

    public void setSalário(double salário) {
        Salário = salário;
    }
}