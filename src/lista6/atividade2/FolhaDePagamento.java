package lista6.atividade2;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Assalariado assalariado = new Assalariado();
        Comissionado comissionado = new Comissionado();
        Horista horista = new Horista();

//Assalariado
        assalariado.setNome("Lionel");
        assalariado.setSobrenome("Scaloni");
        assalariado.setCpf("123.456.789-00");
        assalariado.setSalário(30000);

//Comissionado
        comissionado.setNome("Josep");
        comissionado.setSobrenome("Guardiola");
        comissionado.setCpf("123.456.789-00");
        comissionado.setTotalVenda(20000);
        comissionado.setTaxaComissao(5);
//Horista
        horista.setNome("Jorge");
        horista.setSobrenome("Jesus");
        horista.setCpf("123.456.789-00");
        horista.setPrecoHora(20);
        horista.setHorasTrabalhadas(8);

        System.out.println("Nome do assalariado: " + assalariado.getNome() + "\nSobrenome do assalariado: "+ assalariado.getSobrenome()+ "\nCPF do assalariado: " + assalariado.getCpf() + "\nSalário de um assalariado: R$"+assalariado.getSalário());
        System.out.println("\nNome do comissionado: " + comissionado.getNome() + "\nSobrenome do comissionado: "+ comissionado.getSobrenome()+ "\nCPF do comissionado: " + comissionado.getCpf() +"\nTotal de vendas do comissionado: " + comissionado.getTotalVenda() + "\nTaxa de comissão do comissionado: " + comissionado.getTaxaComissao() + "%");
        System.out.println("\nNome do horista: " + horista.getNome() + "\nSobrenome do horista" + horista.getSobrenome() + "\nCPF do horista: " + horista.getCpf() + "\nPreço da hora do horista: R$" + horista.getPrecoHora() + "\nHoras trabalhadas pelo horista: " + horista.getHorasTrabalhadas() + " horas");
    }
}