package model;

class Usuario {
  private String nome;
  private String login;
  private String senha;

  public Usuario() {
    super();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome != null) {
      this.nome = nome;
    }
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    if (login != null) {
      this.login = login;
    }
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    if (senha != null) {
      this.senha = senha;
    }
  }
}
