package ifnmg.cfada.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

  private final Calculadora calculadora = new Calculadora();

  @Test
  @DisplayName("Deve retornar o resultado da soma corretamente")
  void testSoma() {
    var result = calculadora.somar(1.0, 2.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da subtração corretamente quando o primeiro numero for maior que o segundo")
  void testSubtracaoNum1MaiorQueNum2() {
    var result = calculadora.subtrair(2.0, 1.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(1.0, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da subtração corretamente quando o segundo argumento for maior que o primeiro")
  void testSubtracaoNum2MaiorQueNum1() {
    var result = calculadora.subtrair(2.0, 5.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(-3.0, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da subtração corretamente com dois argumentos negativos")
  void testSubtracaoNegativos() {
    var result = calculadora.subtrair(-2.0, -5.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da subtração corretamente com um argumento negativo e um positivo")
  void testSubtracaoNegativoEPositivo() {
    var result = calculadora.subtrair(-2.0, 5.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(-7.0, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da multiplicação corretamente de dois argumentos positivos")
  void testMultiplicacaoPositivos() {
    var result = calculadora.multiplicar(3.0, 2.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(6.0, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da multiplicação corretamente de dois argumentos negativos")
  void testMultiplicacaoNegativos() {
    var result = calculadora.multiplicar(-3.0, -2.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(6, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da multiplicação corretamente com um argumento negativo e um positivo")
  void testMultiplicacaoNegativoEPositivo() {
    var result = calculadora.multiplicar(-3.0, 2.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(-6.0, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da divisão corretamente quando o primeiro argumento for maior que o segundo")
  void testDivisaoNum1MaiorQueNum2() {
    var result = calculadora.dividir(6.0, 2.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Deve retornar o resultado da divisão corretamente quando o segundo argumento for maior que o primeiro")
  void testDivisaoNum2MaiorQueNum1() {
    var result = calculadora.dividir(2.0, 4.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(0.5, result);
  }

  @Test
  @DisplayName("Deve retornar erro de divisão por 0")
  void testErroDivisaoPor0() {
    assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(2.0, 0.0));
  }

  @Test
  @DisplayName("Deve retornar 0(Zero) quando o primeiro argumento for 0")
  void testDivisaoNum1IgualA0() {
    var result = calculadora.dividir(0.0, 4.0);
    assertNotNull(result);
    assertEquals(Double.class, result.getClass());
    assertEquals(0.0, result);
  }


}