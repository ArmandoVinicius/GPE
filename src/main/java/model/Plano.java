package model;

import java.util.ArrayList;

/**
 *
 * @author arman
 */

class Plano {
	private int ano;
  private int semestre; // 1 ou 2
  private String unidade;
  private ArrayList<Curso> cursos = new ArrayList<Curso>();
  private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
  private ArrayList<DataAula> datas = new ArrayList<DataAula>();
  private String dataAssinaturaProfessor;
  private boolean assinaturaProfessor;
  private String dataAssinaturaCoordenador;
  private boolean assinaturaCoordenador;
  private String dataAssinaturaCoordAcademica;
  private boolean assinaturaCoordAcademica;

  public Plano() {
    super();
  }

  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  public int getSemestre() {
    return semestre;
  }
  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }
  public String getUnidade() {
    return unidade;
  }
  public void setUnidade(String unidade) {
    this.unidade = unidade;
  }
  public ArrayList<Curso> getCursos() {
    return cursos;
  }
  public void setCursos(ArrayList<Curso> cursos) {
    this.cursos = cursos;
  }
  public ArrayList<Disciplina> getDisciplinas() {
    return disciplinas;
  }
  public void setDisciplina(ArrayList<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
  }
  public ArrayList<DataAula> getDatas() {
    return datas;
  }
  public void setDatas(ArrayList<DataAula> datas) {
    this.datas = datas;
  }
  public String getDataAssinaturaProfessor() {
    return dataAssinaturaProfessor;
  }
  public void setDataAssinaturaProfessor(String dataAssinaturaProfessor) {
    this.dataAssinaturaProfessor = dataAssinaturaProfessor;
  }
  public boolean isAssinaturaProfessor() {
    return assinaturaProfessor;
  }
  public void setAssinaturaProfessor(boolean assinaturaProfessor) {
    this.assinaturaProfessor = assinaturaProfessor;
  }
  public String getDataAssinaturaCoordenador() {
    return dataAssinaturaCoordenador;
  }
  public void setDataAssinaturaCoordenador(String dataAssinaturaCoordenador) {
    this.dataAssinaturaCoordenador = dataAssinaturaCoordenador;
  }
  public boolean isAssinaturaCoordenador() {
    return assinaturaCoordenador;
  }
  public void setAssinaturaCoordenador(boolean assinaturaCoordenador) {
    this.assinaturaCoordenador = assinaturaCoordenador;
  }
  public String getDataAssinaturaCoordAcademica() {
    return dataAssinaturaCoordAcademica;
  }
  public void setDataAssinaturaCoordAcademica(String dataAssinaturaCoordAcademica) {
    this.dataAssinaturaCoordAcademica = dataAssinaturaCoordAcademica;
  }
  public boolean isAssinaturaCoordAcademica() {
    return assinaturaCoordAcademica;
  }
  public void setAssinaturaCoordAcademica(boolean assinaturaCoordAcademica) {
    this.assinaturaCoordAcademica = assinaturaCoordAcademica;
  }

  @Override
  public String toString() {
    StringBuilder cursosNomes = new StringBuilder();
    for (Curso c : cursos) {
      cursosNomes.append(c.getNome()).append(", ");
    }
    if (cursosNomes.length() > 0) {
      cursosNomes.setLength(cursosNomes.length() - 2);
    };

    StringBuilder disciplinasNomes = new StringBuilder();
    for (Disciplina d : disciplinas) {
      disciplinasNomes.append(d.getNome()).append(", ");
    }
    if (disciplinasNomes.length() > 0) {
      disciplinasNomes.setLength(disciplinasNomes.length() - 2);
    };

    return "Plano{" +
            "\n Ano/Semestre=" + ano + '.' + semestre +
            ",\n unidade='" + unidade + '\'' +
            ",\n cursos=" + cursosNomes +
            ",\n disciplina=" + disciplinasNomes +
            ",\n datas=" + datas +
            ",\n data assinatura professor='" + dataAssinaturaProfessor + '\'' +
            ",\n assinatura professor=" + assinaturaProfessor +
            ",\n data assinatura coordenador='" + dataAssinaturaCoordenador + '\'' +
            ",\n assinatura coordenador=" + assinaturaCoordenador +
            ",\n data assinatura coordenação academica='" + dataAssinaturaCoordAcademica + '\'' +
            ",\n assinatura coordenação academica=" + assinaturaCoordAcademica +
            ",\n}";
  }
}
