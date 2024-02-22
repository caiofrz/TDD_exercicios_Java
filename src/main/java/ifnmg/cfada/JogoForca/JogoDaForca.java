package ifnmg.cfada.JogoForca;

public class JogoDaForca {

  private String palavra;
  private StringBuilder palavraOculta;
  private int tentativasRestantes;
  private StatusJogo status;

  public JogoDaForca(String palavra) {
    if (palavra == null || palavra.isEmpty())
      throw new IllegalArgumentException("Palavra não pode ser vazia ou nula");

    if (!palavra.matches("[a-zA-Z]+"))
      throw new IllegalArgumentException("Palavra deve conter apenas letras");

    if (palavra.length() < 3)
      throw new IllegalArgumentException("Palavra deve ter no mínimo 3 caracteres");

    this.palavra = palavra;
    this.palavraOculta = new StringBuilder("*".repeat(palavra.length()));
    this.tentativasRestantes = 3;
    this.status = StatusJogo.JOGANDO;
  }

  public enum StatusJogo {
    JOGANDO,
    GANHO,
    PERDIDO
  }

  public void adivinhar(char letra) {
    if (tentativasRestantes <= 0 || status != StatusJogo.JOGANDO) {
      return;
    }
    if (!Character.toString(letra).matches("^[a-zA-Z]+$"))
      throw new IllegalArgumentException("Deve ser uma letra valida de a-z");

    boolean letraRevelada = false;
    for (int i = 0; i < palavra.length(); i++) {
      if (palavra.charAt(i) == letra) {
        palavraOculta.setCharAt(i, letra);
        letraRevelada = true;
      }
    }

    if (!letraRevelada) {
      tentativasRestantes--;
      if (tentativasRestantes == 0) {
        status = StatusJogo.PERDIDO;
      }
    }

    if (palavraOculta.toString().equals(palavra)) {
      status = StatusJogo.GANHO;
    }
  }

  public String getPalavraOculta() {
    return palavraOculta.toString();
  }

  public StatusJogo getStatus() {
    return status;
  }
}