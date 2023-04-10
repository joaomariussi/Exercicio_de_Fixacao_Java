package exerciciosdefixacao;

import application.Produto;
import application.ProdutoImportado;
import application.ProdutoUsado;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exdefixacao09video09 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Nome do Produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preco do Produto: ");
            double preco = sc.nextDouble();
            if (type == 'c') {
                list.add(new Produto(nome, preco));
            }
            else if (type == 'u') {
                System.out.print("Data de fabricação do Produto: (DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new ProdutoUsado(nome, preco, data));
            }
            else {
                System.out.print("Taxa de importação do Produto: ");
                double valorTaxa = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, valorTaxa));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Produto prod : list) {
            System.out.println(prod.etiquetaPreco());
        }

        sc.close();
    }
}
