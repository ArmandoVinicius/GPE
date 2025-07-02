package view;

import model.Model;
//import model.Professor; // Possivel usuario > professor, aluno
import utils.*;

/**
 *
 * @author arman
 */
public class LoginController implements Observer {

    private Model model;
    private LoginView view;
    
    public LoginController() {
    }

    public void init(Model model, LoginView view) {
        if (model != null && view != null) {
            this.model = model;
            this.view = view;
            model.attachObserver(this);
        }
    }

    public void handleEvent(java.awt.event.MouseEvent evt) {
        switch(evt.getComponent().getName()) {
            case "login":
                try {
                    model.autenticarUsuario(view.getMatricula(), view.getSenha());
                    model.detachObserver(this);
                    view.hide();
                } catch (LoginInvalidoException e) {
                    view.mostraException("Erro");
                }
                break;
            case "clear":
                view.clear();
                break;
        }
    }

    @Override
    public void update() {
    }
}
