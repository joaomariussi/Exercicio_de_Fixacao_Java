package exerciciosdefixacao;

import entidades.Calcular;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Calcular calcular =  new Calcular();

        System.out.println("Insira o Raixo para ver suas informações: ");
        double raio = sc.nextDouble();

        double c = calcular.circuferencia(raio);
        double v = calcular.volume(raio);

        System.out.printf("A Circuferência do Raio é de: %.2f%n", c);

        System.out.printf("O Volume do Raio é de: %.2f%n", v);

        System.out.printf("E o valor de PI é de: %.2f%n", calcular.PI);


    }

}
