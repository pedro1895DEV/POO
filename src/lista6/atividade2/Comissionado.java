package lista6.atividade2;

public class Comissionado extends Empregado{
    private double TotalVenda;
    private double taxaComissao;

    @Override
    public double vencimento() {
        return super.vencimento();
    }

    public double getTotalVenda() {
        return TotalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.TotalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
}