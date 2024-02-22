package ifnmg.cfada.ParImpar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ParOuImparTest {

  private final ParOuImpar parOuImpar = new ParOuImpar();

  @Test
  @DisplayName("Deve retornar verdadeiro para numero PAR maior que 0(zero)")
  void testParMaiorQueZero() {
    var result = parOuImpar.ehPar(2.0);
    assertNotNull(result);
    assertEquals(true, result);
  }

  @Test
  @DisplayName("Deve retornar verdadeiro para numero PAR menor que 0(zero)")
  void testParMenorQueZero() {
    var result = parOuImpar.ehPar(-2.0);
    assertNotNull(result);
    assertEquals(true, result);
  }

  @Test
  @DisplayName("Deve retornar verdadeiro para 0(zero)")
  void testParZero() {
    var result = parOuImpar.ehPar(0.0);
    assertNotNull(result);
    assertEquals(true, result);
  }

  @Test
  @DisplayName("Deve retornar falso para numero IMPAR maior que 0(zero)")
  void testImparMaiorQueZero() {
    var result = parOuImpar.ehPar(3.0);
    assertNotNull(result);
    assertEquals(false, result);
  }

  @Test
  @DisplayName("Deve retornar falso para numero IMPAR menor que 0(zero)")
  void testImparMenorQueZero() {
    var result = parOuImpar.ehPar(-3.0);
    assertNotNull(result);
    assertEquals(false, result);
  }

  @Test
  @DisplayName("Deve retornar falso para numero decimal maior que 0(zero)")
  void testNumeroDecimalMaiorQueZero() {
    var result = parOuImpar.ehPar(2.5);
    assertNotNull(result);
    assertEquals(false, result);
  }

  @Test
  @DisplayName("Deve retornar falso para numero decimal menor que 0(zero)")
  void testNumeroDecimalMenorQueZero() {
    var result = parOuImpar.ehPar(-2.5);
    assertNotNull(result);
    assertEquals(false, result);
  }

}