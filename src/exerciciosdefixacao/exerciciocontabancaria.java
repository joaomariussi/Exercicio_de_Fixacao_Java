package exerciciosdefixacao;

import contabanco.Conta;
import contabanco.ContaEmpresa;
import contabanco.ContaPoupanca;

public class exerciciocontabancaria {

    public static void main(String[] args) {

        Conta x = new Conta(1020, "Alex", 1000.00);
        Conta y = new ContaPoupanca(1023, "João", 1000.00, 0.01);

        // Polimorfismo

        x.sacar(50.0);
        y.sacar(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());

        //Conta conta = new Conta(1001, "João", 1000.0);
        //conta.sacar(200.0);
        //System.out.println(conta.getSaldo());

        //Conta conta2 = new ContaPoupanca(1002, "Jorge", 1000.0, 0.01);
        //conta2.sacar(200);
        //System.out.println(conta2.getSaldo());

    }


}
