package ifnmg.cfada.JogoForca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JogoDaForcaTest {

  @Test
  public void testPalavraNaoPodeSerVazia() {
    assertThrows(IllegalArgumentException.class, () -> new JogoDaForca(""));
  }

  @Test
  public void testPalavraNaoPodeSerNula() {
    assertThrows(IllegalArgumentException.class, () -> new JogoDaForca(null));
  }

  @Test
  public void testPalavraDeveConterApenasLetras() {
    assertThrows(IllegalArgumentException.class, () -> new JogoDaForca("123"));
  }

  @Test
  public void testPalavraDeveTerNoMinimo3Caracteres() {
    assertThrows(IllegalArgumentException.class, () -> new JogoDaForca("ab"));
  }

  @Test
  public void testLetraDeveSerValida() {
    JogoDaForca jogo = new JogoDaForca("banana");
    assertThrows(IllegalArgumentException.class, () -> jogo.adivinhar('1'));
  }

  @Test
  public void testValidarPalavraOculta() {
    JogoDaForca jogo = new JogoDaForca("casa");
    assertEquals("****", jogo.getPalavraOculta());
  }

  @Test
  public void testRevelarLetraCorreta() {
    JogoDaForca jogo = new JogoDaForca("casa");
    jogo.adivinhar('a');
    assertEquals("*a*a", jogo.getPalavraOculta());
  }

  @Test
  public void testJogoTerminaQuandoTodasAsLetrasSaoAdivinhadas() {
    JogoDaForca jogo = new JogoDaForca("casa");
    jogo.adivinhar('c');
    jogo.adivinhar('a');
    jogo.adivinhar('s');
    assertEquals("casa", jogo.getPalavraOculta());
    assertEquals(JogoDaForca.StatusJogo.GANHO, jogo.getStatus());
  }

  @Test
  public void testJogoTerminaQuandoNumeroDeTentativasEsgotadas() {
    JogoDaForca jogo = new JogoDaForca("casa");
    jogo.adivinhar('x');
    jogo.adivinhar('y');
    jogo.adivinhar('z');
    assertEquals("****", jogo.getPalavraOculta());
    assertEquals(JogoDaForca.StatusJogo.PERDIDO, jogo.getStatus());
  }


}