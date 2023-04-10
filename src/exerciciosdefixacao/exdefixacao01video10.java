package exerciciosdefixacao;

import application.ConversordeMoeda;

import java.util.Scanner;

public class exdefixacao01video10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço do Dolar? ");
        ConversordeMoeda.precodolar = sc.nextDouble();

        System.out.println("Quantos dolares foram comprados? ");
        ConversordeMoeda.dolarcomprado = sc.nextDouble();

        System.out.printf("O valor gasto em Reai foi de R$%.2f%n", ConversordeMoeda.valorreais());

    }

}
