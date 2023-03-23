package exerciciosdefixacao;

import entidades.Funcionario;

import java.util.Scanner;

public class exedefixacaoex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Qual é o seu nome: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Qual é o seu Salário Bruto? ");
        funcionario.salarioBruto = sc.nextFloat();

        System.out.println("Qual é o valor do imposto que é descontado do salário? ");
        funcionario.imposto = sc.nextFloat();

        System.out.println("Funcionário: " + funcionario);

        System.out.println();

        System.out.println("Insira uma porcentagem de aumento: ");
        float porcentagemValor = sc.nextFloat();
        funcionario.novoSalario(porcentagemValor);

        System.out.println("Dados atualizados: " + funcionario);


    }

}
