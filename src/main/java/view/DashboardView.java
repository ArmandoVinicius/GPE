package view;

import model.Model;
import utils.*;

public class DashboardView extends javax.swing.JFrame implements Observer {
    private Model model;
    private DashboardController controller;
    
    public DashboardView() {
        initComponents();
    }

    public void init(Model model) {
        if (model != null) {
            this.model = model;
            controller = new DashboardController();
            controller.init(model, this);
            model.attachObserver(this);
            this.display();
        }
    }
    
    public void display() {
        jLabelUserName.setText(model.getUsuarioAutenticado());
        this.setVisible(true);
    };
    
    @Override
    public void update() {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUserName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabelText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelText.setText("Seja bem vindo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabelText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUserName)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelText)
                    .addComponent(jLabelUserName))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelText;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
