/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProperty_Package;

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
public class SearchResult extends javax.swing.JFrame {

    /**
     * Creates new form SearchResult
     */
    public SearchResult() {
        initComponents();
    }

    Users user = new Users();
    String sql;
    
    SearchResult(Users user, String sql) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        
        this.user = user;
        this.sql = sql;
        
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);
        jTable1.getColumn("Property ID").setCellRenderer( leftRenderer );
        jTable1.getColumn("Rental Price").setCellRenderer( leftRenderer );
        jTable1.getColumn("Serial").setCellRenderer( leftRenderer );
        jTable1.getColumn("Area(Sq. Ft.)").setCellRenderer( leftRenderer );
        
        hideShowPropertyDetails(false);
        
        show_property();
    }
    
    public void hideShowPropertyDetails(boolean b){
        TitleLabel.setVisible(b);
        AreaLabel.setVisible(b);
        BalconyLabel.setVisible(b);
        BedroomLabel.setVisible(b);
        BathroomLabel.setVisible(b);
        PriceLabel.setVisible(b);
        PurposeLabel.setVisible(b);
        RentForLabel.setVisible(b);
        MainViewLabel.setVisible(b);
        LocationLabel.setVisible(b);
        CCTVLabel.setVisible(b);
        LiftLabel.setVisible(b);
        ParkingLabel.setVisible(b);
        ElectricityBackupLabel.setVisible(b);
        IntercomLabel.setVisible(b);
        DescriptionLabel.setVisible(b);
        DescriptionTextArea.setVisible(b);
        jScrollPane2.setVisible(b);
        ImageLabel.setVisible(b);
        BookButton.setVisible(b);
        guideLabel.setVisible(!b);
    }

    public ArrayList<Property> propertyList(){
        ArrayList<Property> propertyList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConnectMSSQL obj = new ConnectMSSQL();
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

            Statement statement = obj.connection.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                
                Property property = new Property(rs.getInt("PropertyID"), rs.getInt("AddressID"), rs.getString("Purpose"), rs.getInt("Area"),  rs.getInt("RentalPrice"),rs.getString("RentTo"));
                propertyList.add(property);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return propertyList;
    }
    
    public String addressTableAdd(int addressID, String s){
        String loc = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConnectMSSQL obj = new ConnectMSSQL();
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

            Statement statement = obj.connection.createStatement();
            
            ResultSet rs = statement.executeQuery("Select * from Address where AddressID='"+addressID+"'");
            rs.next();
            
            if(!s.equals("table")){
                loc = "House: "+rs.getString("House")+", Road: "+rs.getString("Road")+", ";

                if(!rs.getString("Block").isEmpty()) loc = loc +"Block: "+ rs.getString("Block")+", ";
                if(!rs.getString("Sector").isEmpty()) loc = loc + "Sector: " + rs.getString("Sector")+", ";
                
                loc = loc + "Area: "+rs.getString("Area")+", City: "+rs.getString("City");
            }
            else
                loc = "Area: "+rs.getString("Area")+", City: "+rs.getString("City");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return loc;
    }
    
    public void show_property(){
        ArrayList<Property> list = propertyList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[7];        
        
        int sl_no = 1;
        for(int i=0; i<list.size(); i++){
            row[0] = sl_no++;
            row[1] = list.get(i).getPropertyID();
            row[2] = list.get(i).getPurpose();
            row[3] = list.get(i).getArea();
            row[4] = list.get(i).getRentalPrice();
            row[5] = list.get(i).getRentTo();
            row[6] = addressTableAdd(list.get(i).getAddressID(), "table");;
            
            model.addRow(row);
        }
        if(list.size()<1)
            JOptionPane.showMessageDialog(this, "No property found");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TableHeading = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        BookButton = new javax.swing.JButton();
        BedroomLabel = new javax.swing.JLabel();
        BathroomLabel = new javax.swing.JLabel();
        AreaLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        PurposeLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        RentForLabel = new javax.swing.JLabel();
        MainViewLabel = new javax.swing.JLabel();
        BalconyLabel = new javax.swing.JLabel();
        LiftLabel = new javax.swing.JLabel();
        CCTVLabel = new javax.swing.JLabel();
        ParkingLabel = new javax.swing.JLabel();
        ElectricityBackupLabel = new javax.swing.JLabel();
        IntercomLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionTextArea = new javax.swing.JTextArea();
        ImageLabel = new javax.swing.JLabel();
        guideLabel = new javax.swing.JLabel();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Property ID", "Purpose", "Area(Sq. Ft.)", "Rental Price", "Rent For", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setBounds(50, 100, 900, 190);

        TableHeading.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TableHeading.setForeground(new java.awt.Color(255, 255, 255));
        TableHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TableHeading.setText("Search Result");
        jPanel1.add(TableHeading);
        TableHeading.setBounds(430, 55, 120, 30);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(50, 540, 90, 35);

        BookButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BookButton.setText("Book Now");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BookButton);
        BookButton.setBounds(830, 540, 120, 35);

        BedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        BedroomLabel.setText("Bedroom(s): ");
        jPanel1.add(BedroomLabel);
        BedroomLabel.setBounds(240, 330, 120, 25);

        BathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        BathroomLabel.setText("Bath(s): ");
        jPanel1.add(BathroomLabel);
        BathroomLabel.setBounds(410, 330, 120, 25);

        AreaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AreaLabel.setForeground(new java.awt.Color(255, 255, 255));
        AreaLabel.setText("Area (Sq. Ft.):");
        jPanel1.add(AreaLabel);
        AreaLabel.setBounds(70, 330, 160, 25);

        PriceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PriceLabel.setText("Price:");
        jPanel1.add(PriceLabel);
        PriceLabel.setBounds(780, 330, 140, 25);

        PurposeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PurposeLabel.setForeground(new java.awt.Color(255, 255, 255));
        PurposeLabel.setText("Purpose: ");
        jPanel1.add(PurposeLabel);
        PurposeLabel.setBounds(70, 360, 130, 25);

        LocationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LocationLabel.setForeground(new java.awt.Color(255, 255, 255));
        LocationLabel.setText("Location: ");
        jPanel1.add(LocationLabel);
        LocationLabel.setBounds(580, 360, 360, 25);

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Title: ");
        jPanel1.add(TitleLabel);
        TitleLabel.setBounds(70, 300, 860, 25);

        RentForLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RentForLabel.setForeground(new java.awt.Color(255, 255, 255));
        RentForLabel.setText("Rent For:  ");
        jPanel1.add(RentForLabel);
        RentForLabel.setBounds(240, 360, 140, 25);

        MainViewLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MainViewLabel.setForeground(new java.awt.Color(255, 255, 255));
        MainViewLabel.setText("Main View: ");
        jPanel1.add(MainViewLabel);
        MainViewLabel.setBounds(410, 360, 120, 25);

        BalconyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BalconyLabel.setForeground(new java.awt.Color(255, 255, 255));
        BalconyLabel.setText("Balcony: ");
        jPanel1.add(BalconyLabel);
        BalconyLabel.setBounds(580, 330, 100, 25);

        LiftLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LiftLabel.setForeground(new java.awt.Color(255, 255, 255));
        LiftLabel.setText("Lift: ");
        jPanel1.add(LiftLabel);
        LiftLabel.setBounds(240, 390, 80, 25);

        CCTVLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CCTVLabel.setForeground(new java.awt.Color(255, 255, 255));
        CCTVLabel.setText("CCTV Security: ");
        jPanel1.add(CCTVLabel);
        CCTVLabel.setBounds(70, 390, 140, 25);

        ParkingLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ParkingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ParkingLabel.setText("Parking: ");
        jPanel1.add(ParkingLabel);
        ParkingLabel.setBounds(410, 390, 100, 25);

        ElectricityBackupLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ElectricityBackupLabel.setForeground(new java.awt.Color(255, 255, 255));
        ElectricityBackupLabel.setText("Electricity Backup: ");
        jPanel1.add(ElectricityBackupLabel);
        ElectricityBackupLabel.setBounds(580, 390, 160, 25);

        IntercomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IntercomLabel.setForeground(new java.awt.Color(255, 255, 255));
        IntercomLabel.setText("Intercom: ");
        jPanel1.add(IntercomLabel);
        IntercomLabel.setBounds(780, 390, 100, 25);

        DescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        DescriptionLabel.setText("Description: ");
        jPanel1.add(DescriptionLabel);
        DescriptionLabel.setBounds(70, 420, 100, 25);

        DescriptionTextArea.setColumns(20);
        DescriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(DescriptionTextArea);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(180, 420, 360, 100);
        jPanel1.add(ImageLabel);
        ImageLabel.setBounds(580, 420, 120, 120);

        guideLabel.setForeground(new java.awt.Color(255, 255, 255));
        guideLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guideLabel.setText("(Click row for more details)");
        jPanel1.add(guideLabel);
        guideLabel.setBounds(370, 310, 230, 20);

        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProperty_Package/Image/searchResultBG.jpg"))); // NOI18N
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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new Home(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed

    
    private void initFieldtext() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TitleLabel.setText("Title: ");
        AreaLabel.setText("Area(Sq. Ft.): ");
        BalconyLabel.setText("Balcony: ");
        BedroomLabel.setText("Bedroom: ");
        BathroomLabel.setText("Bathroom: ");
        PriceLabel.setText("Price: ");
        PurposeLabel.setText("Purpose: ");
        RentForLabel.setText("Rent For: ");
        MainViewLabel.setText("Main View: ");
        LocationLabel.setText("Location: ");
        CCTVLabel.setText("CCTV Security: ");
        LiftLabel.setText("Lift: ");
        ParkingLabel.setText("Parking: ");
        ElectricityBackupLabel.setText("Electricity Backup: ");
        IntercomLabel.setText("Intercom: ");
        DescriptionTextArea.setText("");
    }
    
    int id;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        id =  (int) model.getValueAt(selectedRowIndex, 1);
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConnectMSSQL obj = new ConnectMSSQL();
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

            Statement statement = obj.connection.createStatement();
            
            ResultSet rs = statement.executeQuery("Select * from Property where PropertyID='"+id+"'");
            rs.next();
            initFieldtext();
            
            TitleLabel.setText(TitleLabel.getText() + rs.getString("Title"));
            AreaLabel.setText(AreaLabel.getText() + rs.getInt("Area"));
            BalconyLabel.setText(BalconyLabel.getText()+rs.getInt("Balcony"));
            BedroomLabel.setText(BedroomLabel.getText()+rs.getInt("Bedroom"));
            BathroomLabel.setText(BathroomLabel.getText()+rs.getInt("Bathroom"));
            
            int tk=-1;
            if(rs.getInt("RentalPrice")>0)tk = rs.getInt("RentalPrice");
            else if(rs.getInt("AdvancePrice")>0) tk = rs.getInt("AdvancePrice");
            else tk = rs.getInt("SellingPrice");
            PriceLabel.setText(PriceLabel.getText() + tk);
            
            PurposeLabel.setText(PurposeLabel.getText()+rs.getString("Purpose"));
            RentForLabel.setText(RentForLabel.getText()+rs.getString("RentTo"));
            MainViewLabel.setText(MainViewLabel.getText()+rs.getString("MainView"));
            LocationLabel.setText(LocationLabel.getText()+addressTableAdd(rs.getInt("AddressID"), "details"));
            CCTVLabel.setText(CCTVLabel.getText()+rs.getString("CCTVSecurity"));
            LiftLabel.setText(LiftLabel.getText()+rs.getString("Lift"));
            ParkingLabel.setText(ParkingLabel.getText()+rs.getString("Parking"));
            ElectricityBackupLabel.setText(ElectricityBackupLabel.getText()+rs.getString("ElectricityBackup"));
            IntercomLabel.setText(IntercomLabel.getText()+rs.getString("Intercom"));
            DescriptionTextArea.setText(rs.getString("Description"));
            //ImageLabel.setVisible(b);
            hideShowPropertyDetails(true);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        if(user.getUsersID() == -1){
            JOptionPane.showMessageDialog(this, "You have to login first");
        }
        else{
            int OwnerID, buyerID, PropertyID;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                ConnectMSSQL obj = new ConnectMSSQL();
                obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

                Statement statement = obj.connection.createStatement();

                ResultSet rs = statement.executeQuery("Select * from Property where PropertyID='"+id+"'");
                rs.next();
                
                if(user.getUsersID()==rs.getInt("OwnerID"))
                    JOptionPane.showMessageDialog(this, "You are requesting your property [Not Allowed]");
                else{
                    String sql = "Insert into BookRequest values ('"+rs.getInt("OwnerID")+"', '"+user.getUsersID()+"', '"+rs.getInt("PropertyID")+"')";
                    statement.execute(sql);
                }
            }
            catch(Exception e){
                
            }
            new Profile(user).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BalconyLabel;
    private javax.swing.JLabel BathroomLabel;
    private javax.swing.JLabel BedroomLabel;
    private javax.swing.JButton BookButton;
    private javax.swing.JLabel CCTVLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextArea DescriptionTextArea;
    private javax.swing.JLabel ElectricityBackupLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel IntercomLabel;
    private javax.swing.JLabel LiftLabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JLabel MainViewLabel;
    private javax.swing.JLabel ParkingLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel PurposeLabel;
    private javax.swing.JLabel RentForLabel;
    private javax.swing.JLabel TableHeading;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel guideLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
