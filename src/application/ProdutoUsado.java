package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {

    private LocalDate dataFabricacao;

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricaçao(LocalDate dataFabricaçao) {
        this.dataFabricacao = dataFabricaçao;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + "(Usado) R$ "
                + String.format("%.2f", getPreco())
                + " ( Data de Fabricação: "
                + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }

}
