package lista6.atividade1;

public class ContaCorrente extends ContaBancária{

    int taxaOperação = 10;

    @Override
    public double depositar(double valor) {
        return saldo + ( valor - taxaOperação);
    }

    @Override
    public double sacar(double valor) {
        return saldo - valor - taxaOperação;
    }
}
