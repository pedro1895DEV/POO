package lista6.atividade1;

import java.util.Scanner;

public class PrincipalConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();

        Scanner teclado = new Scanner(System.in);

        int valor, numConta, tipConta;

        System.out.println("Digite 1 para Conta Corrente e 2 para Conta Poupança: ");
        tipConta = teclado.nextInt();
        if(tipConta == 1 ){
            System.out.println("Digite o número da conta corrente: ");
            numConta = teclado.nextInt();
            System.out.println("Digite a operação que desejas realizar: \n1: Depositar em conta corrente \n2: Sacar em conta corrente");
            if(teclado.nextInt() == 1){
                System.out.println("Digite o valor a ser depositado: ");
                valor = teclado.nextInt();
                System.out.println("Depositado, valor final do saldo: " +  cc.depositar(valor) + "\nN° da conta: " + numConta + "\n");
            }
            else{
                System.out.println("Digite o valor a ser sacado: ");
                valor = teclado.nextInt();
                System.out.println("Sacado, valor final do saldo: " + cc.sacar(valor) + "\nN° da conta: " + numConta + "\n");

            }
        }

        if(tipConta == 2){
            System.out.println("Digite o número da conta poupança: ");
            numConta = teclado.nextInt();
            System.out.println("Digite a operação que desejas realizar: \n1: Depositar em conta poupança \n2: Sacar em conta poupança \n3: Verificar rendimentos");

            switch (teclado.nextInt()){
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    valor = teclado.nextInt();
                    System.out.println("Depositado, valor final do saldo: " +  cp.depositar(valor) + "\nN° da conta: " + numConta + "\n");
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = teclado.nextInt();
                    if(valor > cp.saldo){
                        System.err.println("Não pode ser saldo negativo!");
                    }
                    else{
                        System.out.println("Sacado, valor final do saldo: " + cp.sacar(valor) + "\nN° da conta: " + numConta + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Rendimentos com o saldo atual: " + cp.rendimento() + "\nN° da conta: " + numConta);
                    break;
            }

        }
    }
}
