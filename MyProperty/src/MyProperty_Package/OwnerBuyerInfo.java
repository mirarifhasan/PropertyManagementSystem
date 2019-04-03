/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProperty_Package;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javafx.beans.binding.Bindings;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class OwnerBuyerInfo extends javax.swing.JFrame {

    /**
     * Creates new form BuyerInfo
     */
    public OwnerBuyerInfo() {
        initComponents();
    }

    Users user;
    Users person = new Users();
    int pid;
    
    OwnerBuyerInfo(Users user, int pid) {
        initComponents();
        
        this.user = user;
        this.pid = pid;
        
        NameLabel.setVisible(false);
        EmailLabel.setVisible(false);
        PhoneLabel.setVisible(false);
        InformationLabel.setVisible(false);
        
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        jTable1.getColumn("Buyer ID").setCellRenderer( leftRenderer );
        
        showClientsList();
    }
    
    public OwnerBuyerInfo(Users user, Users person, int pid, String who) {
        initComponents();
        
        this.user = user;
        this.person = person;
        this.pid = pid;
        
        jScrollPane1.setVisible(false);
        ConfirmButton.setVisible(false);
        UserIDTextField.setVisible(false);
        tableTitle.setVisible(false);
        
        NameLabel.setText(NameLabel.getText().toString() + person.getFirstName() + " " + person.getLastName());
        PhoneLabel.setText(PhoneLabel.getText().toString() + person.getPhone());
        InformationLabel.setText(who + InformationLabel.getText());
        if(!person.getEmail().isEmpty()) EmailLabel.setText(EmailLabel.getText().toString() + person.getEmail());
        else EmailLabel.setVisible(false);
    }

    public ArrayList<BookRequest> bookList(){
        ArrayList<BookRequest> bookList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConnectMSSQL obj = new ConnectMSSQL();
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

            Statement statement = obj.connection.createStatement();
            
            String sql = "SELECT * FROM BookRequest WHERE PropertyID='"+pid+"'";
            ResultSet rs = statement.executeQuery(sql);
            
            BookRequest book;
            while(rs.next()){
                book = new BookRequest(rs.getInt("OwnerID"),rs.getInt("BuyerID"),rs.getInt("PropertyID"));
                bookList.add(book);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return bookList;
    }
        
    public void showClientsList(){
        ArrayList<BookRequest> list = bookList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[4];
        
        
        for(int i=0; i<list.size(); i++){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                ConnectMSSQL obj = new ConnectMSSQL();
                obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

                Statement statement = obj.connection.createStatement();

                String sql = "SELECT * FROM Users WHERE UsersID='"+list.get(i).getBuyerID()+"'";
                ResultSet rs = statement.executeQuery(sql);
                rs.next();
                
                row[0] = list.get(i).getBuyerID();
                row[1] = rs.getString("FirstName") + " " + rs.getString("LastName");
                row[2] = rs.getString("Phone");
                row[3] = rs.getString("Email");
                
                model.addRow(row);
            }
            catch(Exception e){
                System.out.println(e);
            }
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
        InformationLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        tableTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UserIDTextField = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        InformationLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        InformationLabel.setForeground(new java.awt.Color(255, 255, 255));
        InformationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InformationLabel.setText("Information");
        jPanel1.add(InformationLabel);
        InformationLabel.setBounds(380, 130, 240, 35);

        NameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name: ");
        jPanel1.add(NameLabel);
        NameLabel.setBounds(290, 200, 420, 50);

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel.setText("Phone: ");
        jPanel1.add(PhoneLabel);
        PhoneLabel.setBounds(290, 250, 420, 50);

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email: ");
        jPanel1.add(EmailLabel);
        EmailLabel.setBounds(290, 300, 420, 50);

        tableTitle.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tableTitle.setForeground(new java.awt.Color(255, 255, 255));
        tableTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableTitle.setText("List of customer who want your property");
        jPanel1.add(tableTitle);
        tableTitle.setBounds(300, 80, 400, 35);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Buyer ID", "Name", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane1.setBounds(150, 130, 700, 200);

        UserIDTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserIDTextField.setText("Enter User ID");
        UserIDTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserIDTextFieldFocusGained(evt);
            }
        });
        jPanel1.add(UserIDTextField);
        UserIDTextField.setBounds(330, 370, 190, 35);

        ConfirmButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmButton);
        ConfirmButton.setBounds(540, 370, 100, 35);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(90, 520, 100, 35);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProperty_Package/Image/BuyerInfo BG.png"))); // NOI18N
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

    private void UserIDTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserIDTextFieldFocusGained
        // TODO add your handling code here:
        UserIDTextField.setText("");
    }//GEN-LAST:event_UserIDTextFieldFocusGained

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new Profile(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    private boolean idValidation(int id){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rowNumber = model.getRowCount();
        boolean b = false;
        
        for(int i=0; i<rowNumber; i++){
            int temp = (int) model.getValueAt(i, 0);
            if(temp == id){
                b = true;
                break;
            }
        }
        return b;
    }
    
    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rowNumber = model.getRowCount();
        
        if(rowNumber>0){
            try{ 
                int id = Integer.parseInt(UserIDTextField.getText().trim());
                if(idValidation(id)){
                    try {
                        int buyerID = Integer.parseInt(UserIDTextField.getText().trim());

                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        ConnectMSSQL obj = new ConnectMSSQL();
                        obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

                        Statement statement = obj.connection.createStatement();

                        String sql = "Update Property set BuyerID='"+buyerID+"', Status='Not Avalable' where PropertyID='"+pid+"'";
                        statement.execute(sql);

                        sql = "Delete from BookRequest where PropertyID='"+pid+"'";
                        statement.execute(sql);
                        
                        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        Date date = new Date();//2016/11/16 12:08:43
                        
                        sql = "Insert into History values('"+user.getUsersID()+"', '"+buyerID+"', '"+pid+"', '"+dateFormat.format(date)+"', null, '0')";
                        statement.execute(sql);
                        
                        new Profile(user).setVisible(true);
                        this.setVisible(false);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Invalid Input");
                }
            }
            catch(Exception e){ 
                JOptionPane.showMessageDialog(this, "Wrong input");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No buyer found in list");
        }
        
        
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        UserIDTextField.setText(model.getValueAt(selectedRowIndex, 0).toString());
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
            java.util.logging.Logger.getLogger(OwnerBuyerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerBuyerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerBuyerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerBuyerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerBuyerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel InformationLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField UserIDTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel tableTitle;
    // End of variables declaration//GEN-END:variables
}