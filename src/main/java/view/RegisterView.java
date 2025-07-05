package view;

import model.Model;
import utils.*;

public class RegisterView extends javax.swing.JFrame implements Observer {
    private Model model;
    private RegisterController controller;
    
    public RegisterView() {
        initComponents();
    }

    public void init(Model model) {
        if (model != null) {
            this.model = model;
            controller = new RegisterController();
            controller.init(model, this);
            model.attachObserver(this);
            
            this.setVisible(true);
        }
    }
    
    @Override
    public void update() {}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
