import model.*;
import view.*;

public class GPE_POO {
    public static void main(String[] args) {
        Model model = Model.getInstancia();
        LoginView initialView = new LoginView();
        
        Professor p1 = new Professor();
        p1.setNome("Armando");
        p1.setLogin("armando");
        p1.setMatricula("1234");
        p1.setSenha("4321");
        
        Professor p2 = new Professor();
        p2.setNome("Filipe");
        p2.setLogin("filipe");
        p2.setMatricula("5678");
        p2.setSenha("8765");
        
        Professor p3 = new Professor();
        p3.setNome("Guilherme");
        p3.setLogin("guilherme");
        p3.setMatricula("4321");
        p3.setSenha("1234");
        
        model.addProfessor(p1);
        model.addProfessor(p2);
        model.addProfessor(p3);
        
        initialView.init(model);
    }
}
