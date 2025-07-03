package model;

/**
 *
 * @author arman
 */
public class Professor extends Usuario{
  private String matricula;

  public Professor() {
    super();
  }

  public Professor(String nome, String login, String senha, String matricula) {
    super();
    setNome(nome);
    setLogin(login);
    setSenha(senha);
    setMatricula(matricula);
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    if (matricula != null) {
      this.matricula = matricula;
    }
  }
}

