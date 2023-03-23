package entidades;

public class Retangulo {
    public double largura;
    public double altura;

    public double calcularArea() {
        return largura * altura;
    }

    /**
     * @return | retorna a área do retângulo
     */

    public double calcularPerimetro() {
        return (largura + altura) * 2;
    }

    /**
     * @return | retorna o perímetro do retângulo
     */

    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    /**
      @return | retorna o cálculo da diagonal do retângulo
     */

}
