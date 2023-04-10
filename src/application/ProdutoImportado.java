package application;

public class ProdutoImportado extends Produto{

    private Double valorTaxa;

    public ProdutoImportado(String nome, Double preco, Double valorTaxa) {
        super(nome, preco);
        this.valorTaxa = valorTaxa;
    }

    public Double getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(Double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    public Double precoTotal() {
        return getPreco() + valorTaxa;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + "R$"
                + String.format("%.2f", precoTotal())
                + " (A Taxa foi de: R$ "
                + String.format("%.2f", valorTaxa)
                + ")";
    }
}
