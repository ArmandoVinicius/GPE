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
            
            jLabelUserName.setText(model.getUsuarioAutenticado());
            this.setVisible(true);
        }
    }
    
    @Override
    public void update() {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelLateral = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        jBtnLogout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));

        jPanelLateral.setBackground(new java.awt.Color(180, 180, 180));

        jLabelUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jBtnLogout.setName("logout"); // NOI18N
        jBtnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnLogoutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deslogar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jBtnLogoutLayout = new javax.swing.GroupLayout(jBtnLogout);
        jBtnLogout.setLayout(jBtnLogoutLayout);
        jBtnLogoutLayout.setHorizontalGroup(
            jBtnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jBtnLogoutLayout.setVerticalGroup(
            jBtnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelLateralLayout = new javax.swing.GroupLayout(jPanelLateral);
        jPanelLateral.setLayout(jPanelLateralLayout);
        jPanelLateralLayout.setHorizontalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLateralLayout.setVerticalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addContainerGap(510, Short.MAX_VALUE)
                .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addComponent(jPanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 449, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLogoutMouseClicked
        controller.handleEvent(evt);
    }//GEN-LAST:event_jBtnLogoutMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelLateral;
    // End of variables declaration//GEN-END:variables
}
