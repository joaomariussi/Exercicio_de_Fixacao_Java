package exerciciosdefixacao;

import application.Funcionario02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import application.FuncionarioTerceirizado;

public class exedefixacao08video08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Funcionario02> list = new ArrayList<>();

        System.out.println("Digite o número de Funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário #" + i + "data: ");
            System.out.println("Funcionário Terceirizado: S/N? ");
            char ch = sc.next().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Horas Trabalhadas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por Horas Trabalahadas: ");
            double valor_Por_Hora = sc.nextDouble();
            if (ch == 'S') {
                System.out.println("Dispeza Adicional: ");
                double dispezaAdicional = sc.nextDouble();
                list.add(new FuncionarioTerceirizado(nome, horas, valor_Por_Hora, dispezaAdicional));
            }
            else {
                list.add(new Funcionario02(nome, horas, valor_Por_Hora));
            }

        }

        System.out.println();
        System.out.println("Pagamento: ");
        for (Funcionario02 emp : list) {
            System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
        }




    }











}
