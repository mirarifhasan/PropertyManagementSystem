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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
    }
    
    Users user, buyer, person;
    Property property;
    
    Profile(Users user) {
        initComponents();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.user = user;
        NameLabel.setText("Hi, " + user.getFirstName() + " (User ID: " + user.getUsersID() + ")");
        jPanel1.setFocusable(true);
        
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        jTable1.getColumn("Property ID").setCellRenderer( leftRenderer );
        jTable1.getColumn("Rental Price").setCellRenderer( leftRenderer );
        
        show_property();
    }
    
    public ArrayList<Property> propertyList(){
        ArrayList<Property> propertyList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConnectMSSQL obj = new ConnectMSSQL();
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

            Statement statement = obj.connection.createStatement();
            
            String sql = "SELECT * FROM Property WHERE OwnerID='"+user.getUsersID()+"' or BuyerID='"+user.getUsersID()+"';";
            ResultSet rs = statement.executeQuery(sql);
            
            Property property;
            while(rs.next()){
                property = new Property(rs.getInt("PropertyID"), rs.getInt("OwnerID"), rs.getInt("BuyerID"), rs.getString("Title"), rs.getString("Purpose"), rs.getString("Status"), rs.getInt("RentalPrice"), rs.getString("RentTo"));
                propertyList.add(property);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return propertyList;
    }
    
    public void show_property(){
        ArrayList<Property> list = propertyList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[7];
        
        for(int i=0; i<list.size(); i++){
            row[0] = list.get(i).getPropertyID();
            row[1] = list.get(i).getTitle();
            row[2] = list.get(i).getPurpose();
            row[3] = list.get(i).getStatus();
            row[4] = list.get(i).getRentalPrice();
            row[5] = list.get(i).getRentTo();
            
            if(list.get(i).getBuyerID()== user.getUsersID())
                row[6] = "I Buyed";     
            else if(list.get(i).getOwnerID()==user.getUsersID() && list.get(i).getBuyerID()>=3000) 
                row[6] = "Buyed by someone";
            else
                row[6] = "I Offered";
            model.addRow(row);
        }
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
        LogoutButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        TableHeading = new javax.swing.JLabel();
        AddPropertyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UpdateTextField = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        guideLabel = new javax.swing.JLabel();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        LogoutButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LogoutButton.setText("Log Out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutButton);
        LogoutButton.setBounds(810, 50, 140, 40);

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Hi, ");
        jPanel1.add(NameLabel);
        NameLabel.setBounds(50, 80, 510, 30);

        TableHeading.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TableHeading.setForeground(new java.awt.Color(255, 255, 255));
        TableHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TableHeading.setText("My Properties");
        TableHeading.setToolTipText("");
        TableHeading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TableHeading);
        TableHeading.setBounds(410, 110, 180, 30);

        AddPropertyButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddPropertyButton.setText("Add New");
        AddPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPropertyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddPropertyButton);
        AddPropertyButton.setBounds(790, 470, 110, 35);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Property ID", "Title", "Purpose", "Status", "Rental Price", "Rent For", "Relation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 150, 900, 290);

        UpdateTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateTextField.setText("Enter Porperty ID for update");
        UpdateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UpdateTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UpdateTextFieldFocusLost(evt);
            }
        });
        UpdateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateTextField);
        UpdateTextField.setBounds(90, 470, 190, 35);

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton);
        UpdateButton.setBounds(290, 470, 73, 35);

        HomeButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HomeButton.setText("Back to Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(HomeButton);
        HomeButton.setBounds(90, 530, 140, 40);

        guideLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        guideLabel.setForeground(new java.awt.Color(255, 255, 255));
        guideLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guideLabel.setText("* Click for Owner/Buyer/Pending(for owner) details");
        jPanel1.add(guideLabel);
        guideLabel.setBounds(50, 440, 420, 14);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProperty_Package/Image/ProfileBG.jpg"))); // NOI18N
        jPanel1.add(BGLabel);
        BGLabel.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        new Home(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void UpdateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateTextFieldActionPerformed

    private void UpdateTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UpdateTextFieldFocusGained
        // TODO add your handling code here:
            UpdateTextField.setText("");
    }//GEN-LAST:event_UpdateTextFieldFocusGained

    private void UpdateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UpdateTextFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_UpdateTextFieldFocusLost

    private void AddPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPropertyButtonActionPerformed
        
        new PropertyForm(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddPropertyButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        int id=0;
        String sql;
        
        try{ id = Integer.parseInt(UpdateTextField.getText().trim());}
        catch(Exception e){ JOptionPane.showMessageDialog(this, "Wrong input");}
        
        try {
            ConnectMSSQL obj = new ConnectMSSQL();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");
            Statement statement = obj.connection.createStatement();

            sql = "SELECT * FROM Property WHERE PropertyID='"+id+"' AND OwnerID='"+user.getUsersID()+"';";
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs.next()){
                property = new Property(rs.getInt("PropertyID"), rs.getInt("AddressID"), rs.getInt("OwnerID"), rs.getInt("BuyerID"), rs.getInt("RentalPrice"), rs.getInt("AdvancePrice"), rs.getInt("Area"), rs.getInt("Bedroom"), rs.getInt("Bathroom"), rs.getInt("Balcony"), rs.getInt("Lift"), rs.getString("Title"), rs.getString("Purpose"), rs.getString("Status"), rs.getString("MainView"), rs.getString("Parking"), rs.getString("ElectricityBackup"), rs.getString("CCTVSecurity"), rs.getString("Intercom"), rs.getString("Description"), rs.getBytes("Img"), rs.getString("RentTo"));         
            }
            else if(id!=0 && !rs.next())
                JOptionPane.showMessageDialog(this, "You don't have permission");
            
            new PropertyForm(property, user).setVisible(true);
            this.setVisible(false);
        }catch(Exception e){}
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        String relation = (String) model.getValueAt(selectedRowIndex, 6);
        int property = (int) model.getValueAt(selectedRowIndex, 0);
        
        try {
            ConnectMSSQL obj = new ConnectMSSQL();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");
            Statement statement = obj.connection.createStatement();

            String sql = "Select * from Property where PropertyID='"+property+"'";
            ResultSet rs = statement.executeQuery(sql);
            rs.next();
        
            if(!relation.equals("I Offered")){
                String who = null;
                
                if(relation.equals("I Buyed")){
                    sql = "Select * from Users where UsersID='"+rs.getInt("OwnerID")+"'";
                    who = "Owner ";
                }
                else if(relation.equals("Buyed by someone")){
                    sql = "Select * from Users where UsersID='"+rs.getInt("BuyerID")+"'";
                    who = "Buyer ";
                }
                
                ResultSet rs2 = statement.executeQuery(sql);
                rs2.next();

                person = new Users(rs2.getInt("UsersID"), rs2.getString("FirstName"), rs2.getString("LastName"), rs2.getString("Phone"), rs2.getString("Email"));

                new OwnerBuyerInfo(user, person, property, who).setVisible(true);
                this.setVisible(false);
            }
            else{
                new OwnerBuyerInfo(user, property).setVisible(true);
                this.setVisible(false);
            }
        }catch(Exception c){}
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPropertyButton;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel TableHeading;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField UpdateTextField;
    private javax.swing.JLabel guideLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
