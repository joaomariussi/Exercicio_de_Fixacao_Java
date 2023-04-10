package contabanco;

public class ContaPoupanca extends Conta {

    private Double taxadeJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxadeJuros) {
        super(numero, titular, saldo);
        this.taxadeJuros = taxadeJuros;
    }

    public Double getTaxadeJuros() {
        return taxadeJuros;
    }

    public void setTaxadeJuros(Double taxadeJuros) {
        this.taxadeJuros = taxadeJuros;
    }

    public void atualizarSaldo() {
        saldo += saldo * taxadeJuros;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

}
