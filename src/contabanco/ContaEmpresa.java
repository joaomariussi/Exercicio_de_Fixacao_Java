package contabanco;

public class ContaEmpresa extends Conta{

    public Double limiteEmprestimo;

    public ContaEmpresa() {
        super();
    }

    public ContaEmpresa(Integer numero, String titular, Double valor, Double limiteEmprestimo) {
        super(numero, titular, valor);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            deposito(valor);
        }
    }
}
