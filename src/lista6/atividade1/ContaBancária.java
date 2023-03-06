package lista6.atividade1;

public abstract class ContaBancária {
    int numConta;
    int saldo = 300;

    public abstract double sacar(double valor);

    public abstract double depositar(double valor);

}
