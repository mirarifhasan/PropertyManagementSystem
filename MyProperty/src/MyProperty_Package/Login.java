/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProperty_Package;

import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        EmailPhoneField.setBackground(new Color(0,0,0,0));
        PasswordField.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SignUpButton = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        EmailPhoneField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        emailPanel = new javax.swing.JPanel();
        passwordPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        SignUpButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SignUpButton.setText("Create a new account");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpButton);
        SignUpButton.setBounds(740, 50, 210, 40);

        LoginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("Log In");
        jPanel1.add(LoginLabel);
        LoginLabel.setBounds(430, 100, 150, 60);

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email / Phone");
        jPanel1.add(EmailLabel);
        EmailLabel.setBounds(320, 210, 120, 30);

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");
        jPanel1.add(PasswordLabel);
        PasswordLabel.setBounds(320, 280, 120, 30);

        EmailPhoneField.setBackground(new java.awt.Color(102, 102, 102));
        EmailPhoneField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailPhoneField.setForeground(new java.awt.Color(255, 255, 255));
        EmailPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailPhoneFieldActionPerformed(evt);
            }
        });
        jPanel1.add(EmailPhoneField);
        EmailPhoneField.setBounds(450, 210, 230, 30);

        PasswordField.setBackground(new java.awt.Color(102, 102, 102));
        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(PasswordField);
        PasswordField.setBounds(450, 280, 230, 30);

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(emailPanel);
        emailPanel.setBounds(450, 240, 230, 2);

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(passwordPanel);
        passwordPanel.setBounds(450, 310, 230, 2);

        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginButton.setText("Log In");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton);
        LoginButton.setBounds(440, 380, 120, 40);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(70, 520, 110, 40);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProperty_Package/Image/LoginBG.jpg"))); // NOI18N
        BGLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BGLabel.setInheritsPopupMenu(false);
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailPhoneFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        String sql = null, tableName = "Users";
        
        //Getting login information
        String emailPhone = EmailPhoneField.getText();
        String password = PasswordField.getText();

        Users users = new Users();

        if(emailPhone.isEmpty())
            JOptionPane.showMessageDialog(this, "Insert your Email / Phone");
        else if(password.isEmpty())
            JOptionPane.showMessageDialog(this, "Insert Password");
        else
        {    
            ConnectMSSQL obj = new ConnectMSSQL();
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

                Statement statement = obj.connection.createStatement();

                //Getting matched user
                sql = "SELECT * FROM " + tableName + " WHERE (Email='" + emailPhone + "' OR Phone='" +emailPhone +"') AND Password='" + password+"';";
                ResultSet resultSet = statement.executeQuery(sql);

                if(resultSet.next()){
                    
                    //Getting all data from databse to Users class variables (if valid user found)
                    users.setUsersID(resultSet.getInt("UsersID"));
                    users.setFirstName(resultSet.getString("FirstName"));
                    users.setLastName(resultSet.getString("LastName"));
                    users.setAddressID(resultSet.getInt("AddressID"));
                    users.setEmail(resultSet.getString("Email"));
                    users.setPhone(resultSet.getString("Phone"));

                    new Profile(users).setVisible(true);
                    this.setVisible(false);
                }
                else{
                    //This block is for find which value is wrong in login form
                    sql = "SELECT * FROM " + tableName + " WHERE (Email='" + emailPhone + "' OR Phone='" +emailPhone +"')";
                    resultSet = statement.executeQuery(sql);
                    
                    if(resultSet.next())
                        JOptionPane.showMessageDialog(this, "Password was wrong");
                    else JOptionPane.showMessageDialog(this, "This Email / Phone not exist");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // TODO add your handling code here:
        new SignUp().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_SignUpButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailPhoneField;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel passwordPanel;
    // End of variables declaration//GEN-END:variables
}
