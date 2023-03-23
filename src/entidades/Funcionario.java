package entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLimpo() {
        return salarioBruto - imposto;

        /**
         * @return | irá retornar o salário limpo do funcionário
         */
    }

    public void novoSalario(float porcentagem) {
        float porcentagemValor = porcentagem  / 100;
        this.salarioBruto = (this.salarioBruto * porcentagemValor) + this.salarioBruto;
    }

    /**
     *
     * @return | irá aumentar o salário bruto do funcionário, com a porcentagem escolhida pelo usuário
     */

    public String toString() {
        return nome
                + ", o Salário Líquido do Funcionário é de: R$"
                + String.format("%.2f", salarioLimpo());
    }

}
