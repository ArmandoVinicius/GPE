package view;

import model.Model;
import utils.Observer;
/**
 *
 * @author arman
 */
public class LoginView extends javax.swing.JFrame implements Observer {
    private Model model;
    private LoginController controller;
    
    public LoginView() {
        initComponents();
        this.setTitle("GPE");
    }

    public void init(Model model) {
        if (model != null) {
            this.model = model;
            controller = new LoginController();
            controller.init(model, this);
            model.attachObserver(this);
            this.display();
        }
    }
    
    public void clear() {
        jTextFieldMatricula.setText("");
        jPasswordField.setText("");
    };
    
    public void display() {
        this.setVisible(true);
    };
    
    @Override
    public void update() {
    }
    
    public String getMatricula() {
        return jTextFieldMatricula.getText();
    }
    
    public String getSenha() {
        String password = "";
        for(char c : jPasswordField.getPassword()) {
            password += c;
        }
        return password;
    }
    
    public void showMessage(String message) {
        System.out.println(message);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelUser = new javax.swing.JLabel();
        jLabelUser1 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jBtnLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBtnLimpar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Login");

        jLabelUser.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(30, 30, 30));
        jLabelUser.setLabelFor(jTextFieldMatricula);
        jLabelUser.setText("Matricula:");
        jLabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUserMouseClicked(evt);
            }
        });

        jLabelUser1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelUser1.setForeground(new java.awt.Color(30, 30, 30));
        jLabelUser1.setLabelFor(jPasswordField);
        jLabelUser1.setText("Senha:");
        jLabelUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUser1MouseClicked(evt);
            }
        });

        jBtnLogin.setForeground(new java.awt.Color(30, 30, 30));
        jBtnLogin.setName("login"); // NOI18N
        jBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnLoginMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jBtnLoginLayout = new javax.swing.GroupLayout(jBtnLogin);
        jBtnLogin.setLayout(jBtnLoginLayout);
        jBtnLoginLayout.setHorizontalGroup(
            jBtnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jBtnLoginLayout.setVerticalGroup(
            jBtnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jBtnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnLimpar.setName("clear"); // NOI18N
        jBtnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnLimparMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Limpar");
        jLabel4.setName(""); // NOI18N

        javax.swing.GroupLayout jBtnLimparLayout = new javax.swing.GroupLayout(jBtnLimpar);
        jBtnLimpar.setLayout(jBtnLimparLayout);
        jBtnLimparLayout.setHorizontalGroup(
            jBtnLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jBtnLimparLayout.setVerticalGroup(
            jBtnLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jBtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelUser)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelUser1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldMatricula))))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser1)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jBtnLogin.getAccessibleContext().setAccessibleName("LoginButton");

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

    private void jBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLoginMouseClicked
        controller.handleEvent(evt);
    }//GEN-LAST:event_jBtnLoginMouseClicked

    private void jBtnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLimparMouseClicked
        controller.handleEvent(evt);
    }//GEN-LAST:event_jBtnLimparMouseClicked

    private void jLabelUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserMouseClicked
        jTextFieldMatricula.requestFocus();
    }//GEN-LAST:event_jLabelUserMouseClicked

    private void jLabelUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUser1MouseClicked
        jPasswordField.requestFocus();
    }//GEN-LAST:event_jLabelUser1MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBtnLimpar;
    private javax.swing.JPanel jBtnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables
}
