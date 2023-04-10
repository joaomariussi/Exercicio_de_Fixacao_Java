package application;

public class FuncionarioTerceirizado extends Funcionario02{

    private Double dipezaAdicional;

    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(String name, Integer horas, Double valor_Por_Hora, Double dipezaAdicional) {
        super(name, horas, valor_Por_Hora);
        this.dipezaAdicional = dipezaAdicional;
    }

    public Double getDipezaAdicional() {
        return dipezaAdicional;
    }

    public void setDipezaAdicional(Double dipezaAdicional) {
        this.dipezaAdicional = dipezaAdicional;
    }
     @Override
    public double pagamento() {
        return super.pagamento() + dipezaAdicional * 1.1;
     }
}
