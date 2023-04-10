package application;

public class Funcionario02 {

    private String nome;
    private Integer horas;
    private Double valor_Por_Hora;

    public Funcionario02() {
    }

    public Funcionario02(String nome, Integer horas, Double valor_Por_Hora) {
        this.nome = nome;
        this.horas = horas;
        this.valor_Por_Hora = valor_Por_Hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValor_Por_Hora() {
        return valor_Por_Hora;
    }

    public void setValor_Por_Hora(Double valor_Por_Hora) {
        this.valor_Por_Hora = valor_Por_Hora;
    }

    public double pagamento() {
        return horas * valor_Por_Hora;
    }
}
