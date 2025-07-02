package model;

/**
 *
 * @author arman
 */
class Curso {
  private Professor coordenador;
  private String nome;
  private String estruturaCurricular;

  public Curso() {
    super();
  }

  public Professor getCoordenador() {
    return coordenador;
  }
  public void setCoordenador(Professor coordenador) {
    this.coordenador = coordenador;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEstruturaCurricular() {
    return estruturaCurricular;
  }
  public void setEstruturaCurricular(String estruturaCurricular) {
    this.estruturaCurricular = estruturaCurricular;
  }

  @Override
  public String toString() {
    return "Curso{" +
            "\n coordenador=" + coordenador.getNome() +
            ",\n nome='" + nome + '\'' +
            ",\n estruturaCurricular='" + estruturaCurricular + '\'' +
            "\n}";
  }
}

