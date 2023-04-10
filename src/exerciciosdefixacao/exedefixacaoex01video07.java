package exerciciosdefixacao;

import application.Retangulo;

import java.util.Scanner;

public class exedefixacaoex01video07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Insira a largura de um Retângulo: ");
        retangulo.largura = sc.nextDouble();

        System.out.println("Insira a altura de um Retângulo: ");
        retangulo.altura = sc.nextDouble();

        System.out.println();

        System.out.println("A Área do Retângulo é de: " + retangulo.calcularArea());

        System.out.println();

        System.out.println("O Perímetro do Retângulo é de: " + retangulo.calcularPerimetro());

        System.out.println();

        System.out.printf("A Diagonal do Retângulo é de: %.2f%n", retangulo.calcularDiagonal());

    }

}
