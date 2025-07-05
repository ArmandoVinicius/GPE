package view;

import model.Model;
import utils.*;

public class RegisterController implements Observer {
    private Model model;
    private RegisterView view;
    
    public void init(Model model, RegisterView view) {
        if (model != null && view != null) {
            this.model = model;
            this.view = view;
            model.attachObserver(this);
        }
    }
    
    public void update() {}
}
