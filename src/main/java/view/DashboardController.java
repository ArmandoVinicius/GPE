package view;

import model.Model;
import utils.*;

public class DashboardController implements Observer {
    private Model model;
    private DashboardView view;
    
    public void init(Model model, DashboardView view) {
        if (model != null && view != null) {
            this.model = model;
            this.view = view;
            model.attachObserver(this);
        }
    }
    
    public void handleEvent(java.awt.event.MouseEvent evt) {
        switch(evt.getComponent().getName()) {
            case "logout":
                model.logoutUsuario();
                model.detachObserver(this);
                LoginView lv = new LoginView();
                lv.init(model);
                view.dispose();
                break;
        }
    }
    
    @Override
    public void update() {
    }
}
