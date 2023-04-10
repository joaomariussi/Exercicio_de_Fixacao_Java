package application;

public class ConversordeMoeda {

    private static final double IOF = 6.00;

    public static double precodolar;
    public static double dolarcomprado;

    public static double valorreais() {
        return (precodolar * dolarcomprado) * (1 + IOF / 100);
    }
}
