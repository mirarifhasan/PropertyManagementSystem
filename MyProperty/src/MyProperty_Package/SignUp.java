/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProperty_Package;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
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
        SignUpLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        HouseLabel = new javax.swing.JLabel();
        RoadLabel = new javax.swing.JLabel();
        BlockLabel = new javax.swing.JLabel();
        SectorLabel = new javax.swing.JLabel();
        AreaLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        PhoneTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JPasswordField();
        HouseTextField = new javax.swing.JTextField();
        RoadTextField = new javax.swing.JTextField();
        BlockTextField = new javax.swing.JTextField();
        SectorTextField = new javax.swing.JTextField();
        AreaTextField = new javax.swing.JTextField();
        CityTextField = new javax.swing.JTextField();
        SugnUpButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        SignUpLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUpLabel.setText("Sign Up");
        jPanel1.add(SignUpLabel);
        SignUpLabel.setBounds(450, 50, 100, 40);

        FirstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLabel.setText("Frist Name:");
        jPanel1.add(FirstNameLabel);
        FirstNameLabel.setBounds(340, 140, 61, 30);

        LastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LastNameLabel.setText("Last Name:");
        jPanel1.add(LastNameLabel);
        LastNameLabel.setBounds(340, 180, 61, 30);

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel.setText("Phone:");
        jPanel1.add(PhoneLabel);
        PhoneLabel.setBounds(340, 220, 39, 30);

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email:");
        jPanel1.add(EmailLabel);
        EmailLabel.setBounds(340, 260, 31, 30);

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password:");
        jPanel1.add(PasswordLabel);
        PasswordLabel.setBounds(340, 300, 55, 30);

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressLabel.setText("Address Information");
        jPanel1.add(AddressLabel);
        AddressLabel.setBounds(80, 350, 110, 30);

        HouseLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HouseLabel.setForeground(new java.awt.Color(255, 255, 255));
        HouseLabel.setText("House:");
        jPanel1.add(HouseLabel);
        HouseLabel.setBounds(80, 390, 38, 30);

        RoadLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RoadLabel.setForeground(new java.awt.Color(255, 255, 255));
        RoadLabel.setText("Road:");
        jPanel1.add(RoadLabel);
        RoadLabel.setBounds(220, 390, 31, 30);

        BlockLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BlockLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlockLabel.setText("Block:");
        jPanel1.add(BlockLabel);
        BlockLabel.setBounds(360, 390, 32, 30);

        SectorLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SectorLabel.setForeground(new java.awt.Color(255, 255, 255));
        SectorLabel.setText("Sector:");
        jPanel1.add(SectorLabel);
        SectorLabel.setBounds(510, 390, 40, 30);

        AreaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AreaLabel.setForeground(new java.awt.Color(255, 255, 255));
        AreaLabel.setText("Area:");
        jPanel1.add(AreaLabel);
        AreaLabel.setBounds(660, 390, 29, 30);

        CityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(255, 255, 255));
        CityLabel.setText("City:");
        jPanel1.add(CityLabel);
        CityLabel.setBounds(820, 390, 24, 30);
        jPanel1.add(FirstNameTextField);
        FirstNameTextField.setBounds(420, 140, 200, 30);
        jPanel1.add(LastNameTextField);
        LastNameTextField.setBounds(420, 180, 200, 30);
        jPanel1.add(PhoneTextField);
        PhoneTextField.setBounds(420, 220, 200, 30);
        jPanel1.add(EmailTextField);
        EmailTextField.setBounds(420, 260, 200, 30);
        jPanel1.add(PasswordTextField);
        PasswordTextField.setBounds(420, 300, 200, 30);
        jPanel1.add(HouseTextField);
        HouseTextField.setBounds(130, 390, 75, 30);
        jPanel1.add(RoadTextField);
        RoadTextField.setBounds(260, 390, 75, 30);
        jPanel1.add(BlockTextField);
        BlockTextField.setBounds(400, 390, 75, 30);
        jPanel1.add(SectorTextField);
        SectorTextField.setBounds(560, 390, 75, 30);

        AreaTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(AreaTextField);
        AreaTextField.setBounds(710, 390, 75, 30);
        jPanel1.add(CityTextField);
        CityTextField.setBounds(850, 390, 75, 30);

        SugnUpButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SugnUpButton.setText("Sign Up");
        SugnUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SugnUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SugnUpButton);
        SugnUpButton.setBounds(450, 480, 100, 35);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(120, 520, 80, 35);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProperty_Package/Image/SignUpBG.jpg"))); // NOI18N
        BGLabel.setText("As");
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 1936, 600);

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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SugnUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SugnUpButtonActionPerformed
        
        Users user = new Users();
        Address address = new Address();
        
        String tableName = "Users";
        String sql = null;

        //Getting all values from signup form
        user.setFirstName(FirstNameTextField.getText().toString().trim());
        user.setLastName(LastNameTextField.getText().toString().trim());
        user.setPhone(PhoneTextField.getText().toString().trim());
        user.setEmail(EmailTextField.getText().toString().trim());
        user.setPassword(PasswordTextField.getText().toString().trim());
        
        address.setCity(CityTextField.getText().toString().trim());
        address.setArea(AreaTextField.getText().toString().trim());
        address.setSector(SectorTextField.getText().toString().trim());
        address.setBlock(BlockTextField.getText().toString().trim());
        address.setRoad(RoadTextField.getText().toString().trim());
        address.setHouse(HouseTextField.getText().toString().trim());
        
        

        
        if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getPhone().isEmpty() && !user.getPassword().isEmpty()){

            if(!address.getCity().isEmpty() && !address.getArea().isEmpty() && !address.getHouse().isEmpty()){

                ConnectMSSQL obj = new ConnectMSSQL();
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

                    Statement statement = obj.connection.createStatement();

                    //Check duplicate user
                    sql = "SELECT * FROM " + tableName + " WHERE Email='" + user.getEmail() + "' OR Phone='" + user.getPhone() + "';" ;
                    ResultSet resultSet = statement.executeQuery(sql);

                    if(!resultSet.next()){
                        //Getting Rows of Address table
                        sql = "SELECT * FROM Address WHERE City='" + address.getCity() + "' AND Area='" + address.getArea() + "' AND Road='" + address.getRoad() + "' AND Block='" + address.getBlock() + "' AND Sector='" + address.getSector() + "' AND House='" + address.getHouse() +"';";
                        resultSet = statement.executeQuery(sql);

                        //Checking if the address already exists
                        if(resultSet.next()){   //if exists
                            address.setAddressID(resultSet.getInt("AddressID"));
                            user.setAddressID(resultSet.getInt("AddressID"));

                            //Insert only data in Users table
                            sql = "INSERT INTO " + tableName + " VALUES('" + user.getAddressID() + "', '" + user.getFirstName() + "', '" + user.getLastName() + "', '" + user.getPhone() + "', '" + user.getEmail() + "', '" + user.getPassword() + "');";
                            statement.execute(sql);

                            //Geeting the usersID
                            sql = "SELECT * FROM " + tableName + " WHERE Email='" + user.getEmail() + "' AND Phone='" + user.getPhone() + "';";
                            resultSet = statement.executeQuery(sql);

                            resultSet.next();
                            user.setUsersID(resultSet.getInt("UsersID"));

                            new Profile(user).setVisible(true);
                            this.setVisible(false);
                        }
                        else{
                            //Address doesn't exist, then creat a row in address table
                            sql = "INSERT INTO Address VALUES ('" + address.getCity() + "', '" + address.getArea() + "', '" + address.getRoad() + "', '"+ address.getBlock() + "', '" + address.getSector() + "', '"+ address.getHouse() + "');";
                            statement.execute(sql);

                            //Retrive the AddressID
                            sql = "SELECT * FROM Address WHERE City='" + address.getCity() + "' AND Area='" + address.getArea() + "' AND Road='" + address.getRoad() + "' AND Block='" + address.getBlock() + "' AND Sector='" + address.getSector() + "' AND House='" + address.getHouse() +"';";                                                 
                            resultSet = statement.executeQuery(sql);
                            resultSet.next();
                            user.setAddressID(resultSet.getInt("AddressID"));

                            //Add row in Owner/Client table
                            sql = "INSERT INTO " + tableName + " VALUES('" + user.getAddressID() + "', '" + user.getFirstName() + "', '" + user.getLastName() + "', '" + user.getPhone() + "', '" + user.getEmail() + "', '" + user.getPassword() + "');";
                            statement.execute(sql);

                            //Retrive UserID (OwnerID/ClientID)
                            sql = "SELECT * FROM " + tableName + " WHERE Email='" + user.getEmail() + "' AND Phone='" + user.getPhone() + "';";
                            resultSet = statement.executeQuery(sql);

                            resultSet.next();
                            user.setUsersID(resultSet.getInt("UsersID"));

                            new Profile(user).setVisible(true);
                            this.setVisible(false);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "User already exists on same Email or Phone number");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }else
                JOptionPane.showMessageDialog(this, "Must fill City, Area, House fields");
        }else
            JOptionPane.showMessageDialog(this, "Must fill First Name, Last Name, Phone, Password fields");
        
    }//GEN-LAST:event_SugnUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JTextField AreaTextField;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BlockLabel;
    private javax.swing.JTextField BlockTextField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel HouseLabel;
    private javax.swing.JTextField HouseTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JLabel RoadLabel;
    private javax.swing.JTextField RoadTextField;
    private javax.swing.JLabel SectorLabel;
    private javax.swing.JTextField SectorTextField;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JButton SugnUpButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
