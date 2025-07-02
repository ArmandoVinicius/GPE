package model;

import java.util.ArrayList;
/**
 *
 * @author arman
 */

class Disciplina {
  private String nome;
  private String codigo;
  private Carater carater;
  private Regime regime;
  private int cargaHorariaTotal;
  private int cargaHorariaTeorica;
  private int cargaHorariaPratica;
  private int cargaHorariaEad;
  private int cargaHorariaExtensao;
  private ArrayList<Disciplina> prerequisitos = new ArrayList<Disciplina>();
  private ArrayList<Disciplina> corequisitos = new ArrayList<Disciplina>();
  private ArrayList<Disciplina> equivalencias = new ArrayList<Disciplina>();
  private ArrayList<Professor> professores = new ArrayList<Professor>();
  private String justificativa;
  private String ementa;
  private String objetivos;
  private String metodologia;
  private String atividadesDiscentes;
  private String sistemaAvaliacao;
  private String bibliografia;
  private String parecer;

  public Disciplina() {
    super();
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public Carater getCarater() {
    return carater;
  }
  public void setCarater(Carater carater) {
    this.carater = carater;
  }
  public Regime getRegime() {
    return regime;
  }
  public void setRegime(Regime regime) {
    this.regime = regime;
  }
  public int getCargaHorariaTotal() {
    return cargaHorariaTotal;
  }
  public void setCargaHorariaTotal(int cargaHorariaTotal) {
    this.cargaHorariaTotal = cargaHorariaTotal;
  }
  public int getCargaHorariaTeorica() {
    return cargaHorariaTeorica;
  }
  public void setCargaHorariaTeorica(int cargaHorariaTeorica) {
    this.cargaHorariaTeorica = cargaHorariaTeorica;
  }
  public int getCargaHorariaPratica() {
    return cargaHorariaPratica;
  }
  public void setCargaHorariaPratica(int cargaHorariaPratica) {
    this.cargaHorariaPratica = cargaHorariaPratica;
  }
  public int getCargaHorariaEad() {
    return cargaHorariaEad;
  }
  public void setCargaHorariaEad(int cargaHorariaEad) {
    this.cargaHorariaEad = cargaHorariaEad;
  }
  public int getCargaHorariaExtensao() {
    return cargaHorariaExtensao;
  }
  public void setCargaHorariaExtensao(int cargaHorariaExtensao) {
    this.cargaHorariaExtensao = cargaHorariaExtensao;
  }
  public ArrayList<Disciplina> getPrerequisitos() {
    return prerequisitos;
  }
  public void setPrerequisitos(ArrayList<Disciplina> prerequisitos) {
    this.prerequisitos = prerequisitos;
  }
  public ArrayList<Disciplina> getCorequisitos() {
    return corequisitos;
  }
  public void setCorequisitos(ArrayList<Disciplina> corequisitos) {
    this.corequisitos = corequisitos;
  }
  public ArrayList<Disciplina> getEquivalencias() {
    return equivalencias;
  }
  public void setEquivalencias(ArrayList<Disciplina> equivalencias) {
    this.equivalencias = equivalencias;
  }
  public ArrayList<Professor> getProfessores() {
    return professores;
  }
  public void setProfessores(ArrayList<Professor> professores) {
    this.professores = professores;
  }
  public String getJustificativa() {
    return justificativa;
  }
  public void setJustificativa(String justificativa) {
    this.justificativa = justificativa;
  }
  public String getEmenta() {
    return ementa;
  }
  public void setEmenta(String ementa) {
    this.ementa = ementa;
  }
  public String getObjetivos() {
    return objetivos;
  }
  public void setObjetivos(String objetivos) {
    this.objetivos = objetivos;
  }
  public String getMetodologia() {
    return metodologia;
  }
  public void setMetodologia(String metodologia) {
    this.metodologia = metodologia;
  }
  public String getAtividadesDiscentes() {
    return atividadesDiscentes;
  }
  public void setAtividadesDiscentes(String atividadesDiscentes) {
    this.atividadesDiscentes = atividadesDiscentes;
  }
  public String getSistemaAvaliacao() {
    return sistemaAvaliacao;
  }
  public void setSistemaAvaliacao(String sistemaAvaliacao) {
    this.sistemaAvaliacao = sistemaAvaliacao;
  }
  public String getBibliografia() {
    return bibliografia;
  }
  public void setBibliografia(String bibliografia) {
    this.bibliografia = bibliografia;
  }
  public String getParecer() {
    return parecer;
  }
  public void setParecer(String parecer) {
    this.parecer = parecer;
  }

  @Override
  public String toString() {
    StringBuilder professoresNomes = new StringBuilder();
    for (Professor p : professores) {
      professoresNomes.append(p.getNome()).append(", ");
    }
    StringBuilder prerequisitosNomes = new StringBuilder();
    for (Disciplina pre : prerequisitos) {
      prerequisitosNomes.append(pre.getNome()).append(", ");
    }
    StringBuilder corequisitosNomes = new StringBuilder();
    for (Disciplina co : corequisitos) {
      corequisitosNomes.append(co.getNome()).append(", ");
    }
    StringBuilder equivalenciasNomes = new StringBuilder();
    for (Disciplina eq : equivalencias) {
      equivalenciasNomes.append(eq.getNome()).append(", ");
    }
    // Remove trailing commas and spaces
    if (professoresNomes.length() > 0) {
      professoresNomes.setLength(professoresNomes.length() - 2);
    };

    if (prerequisitosNomes.length() > 0) {
      prerequisitosNomes.setLength(prerequisitosNomes.length() - 2);
    } else {
      prerequisitosNomes.append("---");
    };

    if (corequisitosNomes.length() > 0) {
      corequisitosNomes.setLength(corequisitosNomes.length() - 2);
    } else {
      corequisitosNomes.append("---");
    };

    if (equivalenciasNomes.length() > 0) {
      equivalenciasNomes.setLength(equivalenciasNomes.length() - 2);
    } else {
      equivalenciasNomes.append("---");
    };

    return "Disciplina{" +
            "\n nome='" + nome + '\'' +
            ",\n codigo='" + codigo + '\'' +
            ",\n carater=" + carater +
            ",\n regime=" + regime +
            ",\n cargaHorariaTotal=" + cargaHorariaTotal +
            ", cargaHorariaTeorica=" + cargaHorariaTeorica +
            ", cargaHorariaPratica=" + cargaHorariaPratica +
            ", cargaHorariaEad=" + cargaHorariaEad +
            ", cargaHorariaExtensao=" + cargaHorariaExtensao +
            ",\n prerequisitos=" + prerequisitosNomes +
            ",\n corequisitos=" + corequisitosNomes +
            ",\n equivalencias=" + equivalenciasNomes +
            ",\n professores=" + professoresNomes +
            ",\n justificativa='" + justificativa + '\'' +
            ",\n ementa='" + ementa + '\'' +
            ",\n objetivos='" + objetivos + '\'' +
            ",\n metodologia='" + metodologia + '\'' +
            ",\n atividadesDiscentes='" + atividadesDiscentes + '\'' +
            ",\n sistemaAvaliacao='" + sistemaAvaliacao + '\'' +
            ",\n bibliografia='" + bibliografia + '\'' +
            ",\n parecer='" + parecer + '\'' +
            "\n}";
  }
}
