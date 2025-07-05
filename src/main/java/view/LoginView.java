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
            
            this.setVisible(true);
        }
    }
    
    public void clear() {
        userInput.setText("");
        passwordInput.setText("");
    };
    
    @Override
    public void update() {
    }
    
    public String getMatricula() {
        return userInput.getText();
    }
    
    public String getSenha() {
        String password = "";
        for(char c : passwordInput.getPassword()) {
            password += c;
        }
        return password;
    }
    
    public void showMessage(String message) {
        System.out.println(message);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        backgroundPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        loginButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clearButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        registerButton = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(600, 600));
        java.awt.GridBagLayout backgroundPanelLayout = new java.awt.GridBagLayout();
        backgroundPanelLayout.columnWidths = new int[] {0, 20, 0, 20, 0};
        backgroundPanelLayout.rowHeights = new int[] {0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0, 20, 0};
        backgroundPanel.setLayout(backgroundPanelLayout);

        loginLabel.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(30, 30, 30));
        loginLabel.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        backgroundPanel.add(loginLabel, gridBagConstraints);

        passwordLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(30, 30, 30));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setLabelFor(passwordInput);
        passwordLabel.setText("Senha:");
        passwordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordLabelMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        backgroundPanel.add(passwordLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        backgroundPanel.add(passwordInput, gridBagConstraints);

        userLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(30, 30, 30));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setLabelFor(userInput);
        userLabel.setText("Matricula:");
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLabelMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        backgroundPanel.add(userLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        backgroundPanel.add(userInput, gridBagConstraints);

        loginButton.setBackground(java.awt.SystemColor.menu);
        loginButton.setForeground(new java.awt.Color(30, 30, 30));
        loginButton.setName("login"); // NOI18N
        loginButton.setPreferredSize(new java.awt.Dimension(0, 0));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout loginButtonLayout = new javax.swing.GroupLayout(loginButton);
        loginButton.setLayout(loginButtonLayout);
        loginButtonLayout.setHorizontalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        loginButtonLayout.setVerticalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        backgroundPanel.add(loginButton, gridBagConstraints);
        loginButton.getAccessibleContext().setAccessibleName("LoginButton");

        clearButton.setBackground(java.awt.SystemColor.menu);
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.setName("clear"); // NOI18N
        clearButton.setPreferredSize(new java.awt.Dimension(0, 0));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Limpar");
        jLabel4.setName(""); // NOI18N

        javax.swing.GroupLayout clearButtonLayout = new javax.swing.GroupLayout(clearButton);
        clearButton.setLayout(clearButtonLayout);
        clearButtonLayout.setHorizontalGroup(
            clearButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clearButtonLayout.setVerticalGroup(
            clearButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 50;
        backgroundPanel.add(clearButton, gridBagConstraints);

        registerButton.setBackground(java.awt.SystemColor.menu);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        registerLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLabel.setText("Cadastro");
        registerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLabel.setName("register"); // NOI18N
        registerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registerButtonLayout = new javax.swing.GroupLayout(registerButton);
        registerButton.setLayout(registerButtonLayout);
        registerButtonLayout.setHorizontalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );
        registerButtonLayout.setVerticalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        backgroundPanel.add(registerButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        controller.handleEvent(evt);
    }//GEN-LAST:event_clearButtonMouseClicked

    private void userLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseClicked
        userInput.requestFocus();
    }//GEN-LAST:event_userLabelMouseClicked

    private void passwordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabelMouseClicked
        passwordInput.requestFocus();
    }//GEN-LAST:event_passwordLabelMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        controller.handleEvent(evt);
    }//GEN-LAST:event_loginButtonMouseClicked

    private void registerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelMouseClicked
        controller.handleEvent(evt);
    }//GEN-LAST:event_registerLabelMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel clearButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
