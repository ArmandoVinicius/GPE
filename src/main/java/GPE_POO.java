import model.*;
import view.*;

public class GPE_POO {
    public static void main(String[] args) {
        Model model = Model.getInstancia();
        LoginView initialView = new LoginView();
        model.addProfessor("Filipe", "armando", "1234", "4321");
        initialView.init(model);
    }
}
