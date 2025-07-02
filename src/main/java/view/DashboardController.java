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
    
    @Override
    public void update() {
        
    }
}
