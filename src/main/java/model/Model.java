package model;

import java.util.ArrayList;
import java.util.HashMap;
import utils.LoginInvalidoException;
import utils.Observer;

/**
 *
 * @author arman
 */
public class Model {

    /*
   * Conjunto de dados
     */
    private HashMap<String, Professor> professores = new HashMap<String, Professor>();
    private Professor professorAutenticado;
    private HashMap<String, Disciplina> disciplinas = new HashMap<String, Disciplina>();
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
    private ArrayList<Plano> planos = new ArrayList<Plano>();
    private ArrayList<Plano> planosAntigos = new ArrayList<Plano>();
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    private static Model instancia;

    private Model() {
        super();
    }

    public static Model getInstancia() {
        if (instancia == null) {
            instancia = new Model();
        }
        return instancia;
    }

    // Registra um observador
    public void attachObserver(Observer o) {
        if (o != null) {
            observers.add(o);
        }
    }

    // Exclui um observador
    public void detachObserver(Observer o) {
        if (o != null) {
            observers.remove(o);
        }
    }

    // Notifica todos os observadores
    public void notifica() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public Professor getProfessor(String matricula) {
        return professores.get(matricula);
    }

    public Disciplina getDisciplina(String codigo) {
        return disciplinas.get(codigo);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public ArrayList<Plano> getPlanos() {
        return planos;
    }

    public ArrayList<Plano> getPlanosAntigos() {
        return planosAntigos;
    }

    public void setProfessor(String nome, String login, String senha, String matricula) {
        if (nome != null && login != null && senha != null && matricula != null) {
            professores.put(matricula, new Professor(nome, login, senha, matricula));
            notifica();
        }
    }

    public void setDisciplina(String nome, String codigo, String ementa) {
        if (nome != null && codigo != null && ementa != null) {
            //disciplinas.put(codigo, new Disciplina(nome, codigo, ementa));
            notifica();
        }
    }

    public void autenticarUsuario(String matricula, String senha) throws LoginInvalidoException {
        // Possivel try catch
        if (professores.containsKey(matricula)) {
            if (professores.get(matricula).getSenha().equals(senha)) {
                this.professorAutenticado = professores.get(matricula);
                notifica();
            } else {
                throw new LoginInvalidoException();
            }
        } else {
            throw new LoginInvalidoException();
        }
    }
    
    // metodo para deslogar o usuario (professorAutenticado = null)
    
    public String getUsuarioAutenticado() {
        if (professorAutenticado != null)
            return professorAutenticado.getNome();
        return "";
    }
}
