import model.*;
import view.*;
/**
 *
 * @author arman
 */
public class GPE_POO {
    public static void main(String[] args) {
        Model model = Model.getInstancia();
        LoginView initialView = new LoginView();
        model.setProfessor("Armando", "armando", "1234", "539368");
        initialView.init(model);
    }
}
