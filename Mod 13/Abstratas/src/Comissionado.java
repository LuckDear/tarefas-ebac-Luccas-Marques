public class Comissionado extends Empregado {
    private double totalVenda;
    private double totalComissao;

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }

    @Override
    public double vencimento() {
        return totalVenda*totalComissao;
    }
}
