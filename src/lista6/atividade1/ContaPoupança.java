package lista6.atividade1;

public class ContaPoupança extends ContaBancária{

    @Override
    public double sacar(double valor) {
        return saldo - valor;
    }

    @Override
    public double depositar(double valor) {
        return saldo + valor;
    }

    public int rendimento(){
        return saldo += saldo * 0.02;
    }

}
