package model;

class DataAula {
  private int dia;
  private int mes;
  private int ano;
  private String cargaHoraria;
  private String descricao; // Ex: "Laboratório 01: Atividades Práticas"

  public DataAula() {
    super();
  }

  public int getDia() {
    return dia;
  }
  public void setDia(int dia) {
    this.dia = dia;
  }
  public int getMes() {
    return mes;
  }
  public void setMes(int mes) {
    this.mes = mes;
  }
  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  public String getCargaHoraria() {
    return cargaHoraria;
  }
  public void setCargaHoraria(String cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "{" +
            "\n dia=" + dia +
            ",\n mes=" + mes +
            ",\n ano=" + ano +
            ",\n cargaHoraria='" + cargaHoraria + '\'' +
            ",\n descricao='" + descricao + '\'' +
            "\n}";
  }
}
