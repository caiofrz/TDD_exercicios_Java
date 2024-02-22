package ifnmg.cfada.calculadora;

public class Calculadora {

  public Double somar(Double num1, Double num2) {
    return num1 + num2;
  }

  public Double subtrair(Double num1, Double num2) {
    return num1 - num2;
  }

  public Double multiplicar(Double num1, Double num2) {
    return num1 * num2;
  }

  public Double dividir(Double num1, Double num2) {
    if (num2 == 0) throw new IllegalArgumentException();
    return num1 / num2;
  }
}
