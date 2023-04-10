package exerciciosdefixacao;

import application.Aluno;

import java.util.Scanner;

public class exedefixacaoex03video07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno  aluno = new Aluno();

        System.out.println("Digite seu nome: ");
        aluno.nome = sc.nextLine();

        System.out.println("Insira a primeira nota: ");
        aluno.nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0) {
            System.out.println("Você foi REPROVADO!! ");
            System.out.printf("Faltam %.2f pontos%n", aluno.faltaPontos());
        }
        else {
            System.out.println("Você está APROVADO!! ");
        }
    }
}
