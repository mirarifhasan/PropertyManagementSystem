/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProperty_Package;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class PropertyForm extends javax.swing.JFrame {

    /**
     * Creates new form PropertyForm
     */
    public PropertyForm() {
        initComponents();
    }
    
    Users user;
    Property property;
    
    ArrayList<String> emptyFields = new ArrayList<String>();
    
    public PropertyForm(Users user) {
        initComponents();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.user = user;
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
        PropertyIDLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        TitleTextField = new javax.swing.JTextField();
        TypeLabel = new javax.swing.JLabel();
        TypeComboBox = new javax.swing.JComboBox<>();
        Status = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        RentalPriveLabel = new javax.swing.JLabel();
        RentalPriceTextField = new javax.swing.JTextField();
        AdvancePriceLabel = new javax.swing.JLabel();
        AdvancePriceTextField = new javax.swing.JTextField();
        AreaLabel = new javax.swing.JLabel();
        AreaTextField = new javax.swing.JTextField();
        BedroomLabel = new javax.swing.JLabel();
        BedroomTextField = new javax.swing.JTextField();
        BathroomLabel = new javax.swing.JLabel();
        BathroomTextField = new javax.swing.JTextField();
        BalconyLabel = new javax.swing.JLabel();
        BalconyTextField = new javax.swing.JTextField();
        ViewLabel = new javax.swing.JLabel();
        ViewTextField = new javax.swing.JTextField();
        LiftLabel = new javax.swing.JLabel();
        LiftTextField = new javax.swing.JTextField();
        ParkingLabel = new javax.swing.JLabel();
        ParkingComboBox = new javax.swing.JComboBox<>();
        ElectricityLabel = new javax.swing.JLabel();
        ElectricityComboBox = new javax.swing.JComboBox<>();
        IntercomLabel = new javax.swing.JLabel();
        IntercomComboBox = new javax.swing.JComboBox<>();
        CCTVLabel = new javax.swing.JLabel();
        CCTVComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionTextPane = new javax.swing.JTextPane();
        AddPropertyButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        AddressLabel = new javax.swing.JLabel();
        HouseLabel = new javax.swing.JLabel();
        RoadLabel = new javax.swing.JLabel();
        BlockLabel = new javax.swing.JLabel();
        SectorLabel = new javax.swing.JLabel();
        AreaLabel1 = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        RoadTextField = new javax.swing.JTextField();
        SectorTextField = new javax.swing.JTextField();
        HouseTextField = new javax.swing.JTextField();
        AreaTextField1 = new javax.swing.JTextField();
        BlockTextField = new javax.swing.JTextField();
        BGLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        PropertyIDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PropertyIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        PropertyIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PropertyIDLabel.setText("Property Form");
        jPanel1.add(PropertyIDLabel);
        PropertyIDLabel.setBounds(400, 20, 200, 30);

        TitleLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Title:");
        jPanel1.add(TitleLabel);
        TitleLabel.setBounds(80, 70, 85, 30);

        TitleTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(TitleTextField);
        TitleTextField.setBounds(170, 70, 750, 30);

        TypeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeLabel.setText("Type:");
        jPanel1.add(TypeLabel);
        TypeLabel.setBounds(80, 110, 85, 30);

        TypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Rent", "Sell", "Both" }));
        TypeComboBox.setToolTipText("");
        jPanel1.add(TypeComboBox);
        TypeComboBox.setBounds(170, 110, 110, 30);

        Status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("Status: ");
        jPanel1.add(Status);
        Status.setBounds(80, 150, 85, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Avalable" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 150, 110, 30);

        RentalPriveLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RentalPriveLabel.setForeground(new java.awt.Color(255, 255, 255));
        RentalPriveLabel.setText("Rental Price:");
        jPanel1.add(RentalPriveLabel);
        RentalPriveLabel.setBounds(80, 190, 85, 30);

        RentalPriceTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(RentalPriceTextField);
        RentalPriceTextField.setBounds(170, 190, 110, 30);

        AdvancePriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AdvancePriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdvancePriceLabel.setText("Advance Price:");
        jPanel1.add(AdvancePriceLabel);
        AdvancePriceLabel.setBounds(80, 230, 85, 30);
        jPanel1.add(AdvancePriceTextField);
        AdvancePriceTextField.setBounds(170, 230, 110, 30);

        AreaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AreaLabel.setForeground(new java.awt.Color(255, 255, 255));
        AreaLabel.setText("Area (sqft):");
        jPanel1.add(AreaLabel);
        AreaLabel.setBounds(80, 360, 70, 30);

        AreaTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(AreaTextField);
        AreaTextField.setBounds(150, 360, 70, 30);

        BedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        BedroomLabel.setText("Bedroom:");
        jPanel1.add(BedroomLabel);
        BedroomLabel.setBounds(260, 360, 53, 30);

        BedroomTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(BedroomTextField);
        BedroomTextField.setBounds(320, 360, 70, 30);

        BathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        BathroomLabel.setText("Bathroom:");
        jPanel1.add(BathroomLabel);
        BathroomLabel.setBounds(410, 360, 57, 30);

        BathroomTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(BathroomTextField);
        BathroomTextField.setBounds(515, 360, 70, 30);

        BalconyLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BalconyLabel.setForeground(new java.awt.Color(255, 255, 255));
        BalconyLabel.setText("Balcony:");
        jPanel1.add(BalconyLabel);
        BalconyLabel.setBounds(610, 360, 45, 30);

        BalconyTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(BalconyTextField);
        BalconyTextField.setBounds(670, 360, 70, 30);

        ViewLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ViewLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewLabel.setText("View:");
        jPanel1.add(ViewLabel);
        ViewLabel.setBounds(770, 360, 31, 30);

        ViewTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(ViewTextField);
        ViewTextField.setBounds(850, 360, 70, 30);

        LiftLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LiftLabel.setForeground(new java.awt.Color(255, 255, 255));
        LiftLabel.setText("Lift:");
        jPanel1.add(LiftLabel);
        LiftLabel.setBounds(120, 410, 21, 30);

        LiftTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(LiftTextField);
        LiftTextField.setBounds(150, 410, 70, 30);

        ParkingLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ParkingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ParkingLabel.setText("Parking:");
        jPanel1.add(ParkingLabel);
        ParkingLabel.setBounds(260, 410, 43, 30);

        ParkingComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ParkingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(ParkingComboBox);
        ParkingComboBox.setBounds(320, 410, 70, 30);

        ElectricityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ElectricityLabel.setForeground(new java.awt.Color(255, 255, 255));
        ElectricityLabel.setText("Electricity Backup:");
        jPanel1.add(ElectricityLabel);
        ElectricityLabel.setBounds(410, 410, 99, 30);

        ElectricityComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ElectricityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(ElectricityComboBox);
        ElectricityComboBox.setBounds(515, 410, 70, 30);

        IntercomLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IntercomLabel.setForeground(new java.awt.Color(255, 255, 255));
        IntercomLabel.setText("Intercom:");
        jPanel1.add(IntercomLabel);
        IntercomLabel.setBounds(610, 410, 54, 30);

        IntercomComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IntercomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(IntercomComboBox);
        IntercomComboBox.setBounds(670, 410, 70, 30);

        CCTVLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCTVLabel.setForeground(new java.awt.Color(255, 255, 255));
        CCTVLabel.setText("CCTV Security:");
        jPanel1.add(CCTVLabel);
        CCTVLabel.setBounds(770, 410, 82, 30);

        CCTVComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCTVComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(CCTVComboBox);
        CCTVComboBox.setBounds(850, 410, 70, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Description:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 450, 70, 30);

        jScrollPane2.setViewportView(DescriptionTextPane);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(160, 460, 760, 60);

        AddPropertyButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddPropertyButton.setText("Add Property");
        AddPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPropertyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddPropertyButton);
        AddPropertyButton.setBounds(750, 540, 120, 30);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(120, 540, 80, 30);

        AddressLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressLabel.setText("Address Information");
        jPanel1.add(AddressLabel);
        AddressLabel.setBounds(80, 270, 110, 30);

        HouseLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HouseLabel.setForeground(new java.awt.Color(255, 255, 255));
        HouseLabel.setText("House:");
        jPanel1.add(HouseLabel);
        HouseLabel.setBounds(80, 300, 38, 30);

        RoadLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RoadLabel.setForeground(new java.awt.Color(255, 255, 255));
        RoadLabel.setText("Road:");
        jPanel1.add(RoadLabel);
        RoadLabel.setBounds(220, 300, 31, 30);

        BlockLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BlockLabel.setForeground(new java.awt.Color(255, 255, 255));
        BlockLabel.setText("Block:");
        jPanel1.add(BlockLabel);
        BlockLabel.setBounds(360, 300, 32, 30);

        SectorLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SectorLabel.setForeground(new java.awt.Color(255, 255, 255));
        SectorLabel.setText("Sector:");
        jPanel1.add(SectorLabel);
        SectorLabel.setBounds(510, 300, 40, 30);

        AreaLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AreaLabel1.setForeground(new java.awt.Color(255, 255, 255));
        AreaLabel1.setText("Area:");
        jPanel1.add(AreaLabel1);
        AreaLabel1.setBounds(660, 300, 29, 30);

        CityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(255, 255, 255));
        CityLabel.setText("City:");
        jPanel1.add(CityLabel);
        CityLabel.setBounds(820, 300, 24, 30);
        jPanel1.add(CityTextField);
        CityTextField.setBounds(850, 300, 75, 30);
        jPanel1.add(RoadTextField);
        RoadTextField.setBounds(260, 300, 75, 30);
        jPanel1.add(SectorTextField);
        SectorTextField.setBounds(560, 300, 75, 30);
        jPanel1.add(HouseTextField);
        HouseTextField.setBounds(130, 300, 75, 30);

        AreaTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(AreaTextField1);
        AreaTextField1.setBounds(710, 300, 75, 30);
        jPanel1.add(BlockTextField);
        BlockTextField.setBounds(400, 300, 75, 30);

        BGLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BGLabel.setForeground(new java.awt.Color(255, 255, 255));
        BGLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProperty_Package/Image/PropertyFormBG.jpeg"))); // NOI18N
        BGLabel.setText("jLabel1");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new Profile(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButtonActionPerformed
    
    private void takeData() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

       // try{
            if(TitleTextField.getText().trim().isEmpty()) emptyFields.add(TitleLabel.getText().trim() + "\b");
            else property.setTitle(TitleTextField.getText().trim());

            if(TypeComboBox.getSelectedItem().toString() == "Select") emptyFields.add(TypeLabel.getText() + "\b");
            else property.setType(TypeComboBox.getSelectedItem().toString());
            
            if(RentalPriceTextField.getText().trim().isEmpty()) emptyFields.add(RentalPriveLabel.getText().trim() + "\b");   
            else property.setRentalPrice(Integer.parseInt(RentalPriceTextField.getText().trim()));
            
            if(!AdvancePriceTextField.getText().trim().isEmpty()){
                String s = AdvancePriceTextField.getText().trim();
                int a = Integer.parseInt(s);
                property.setAdvancePrice(a);
                System.out.println(property.getAdvancePrice());
            }
                
  
            int a = property.getAdvancePrice();
            System.out.println(Integer.toString(a));
            System.out.println("hi" + emptyFields);
    /*    }
        catch(Exception e){
            System.out.println("hi" + e + "hi");
        }
        */
        
    }
    
    private void AddPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPropertyButtonActionPerformed
        
        takeData();
        
        
        
    }//GEN-LAST:event_AddPropertyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PropertyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PropertyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PropertyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PropertyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropertyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPropertyButton;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel AdvancePriceLabel;
    private javax.swing.JTextField AdvancePriceTextField;
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JLabel AreaLabel1;
    private javax.swing.JTextField AreaTextField;
    private javax.swing.JTextField AreaTextField1;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BalconyLabel;
    private javax.swing.JTextField BalconyTextField;
    private javax.swing.JLabel BathroomLabel;
    private javax.swing.JTextField BathroomTextField;
    private javax.swing.JLabel BedroomLabel;
    private javax.swing.JTextField BedroomTextField;
    private javax.swing.JLabel BlockLabel;
    private javax.swing.JTextField BlockTextField;
    private javax.swing.JComboBox<String> CCTVComboBox;
    private javax.swing.JLabel CCTVLabel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JTextPane DescriptionTextPane;
    private javax.swing.JComboBox<String> ElectricityComboBox;
    private javax.swing.JLabel ElectricityLabel;
    private javax.swing.JLabel HouseLabel;
    private javax.swing.JTextField HouseTextField;
    private javax.swing.JComboBox<String> IntercomComboBox;
    private javax.swing.JLabel IntercomLabel;
    private javax.swing.JLabel LiftLabel;
    private javax.swing.JTextField LiftTextField;
    private javax.swing.JComboBox<String> ParkingComboBox;
    private javax.swing.JLabel ParkingLabel;
    private javax.swing.JLabel PropertyIDLabel;
    private javax.swing.JTextField RentalPriceTextField;
    private javax.swing.JLabel RentalPriveLabel;
    private javax.swing.JLabel RoadLabel;
    private javax.swing.JTextField RoadTextField;
    private javax.swing.JLabel SectorLabel;
    private javax.swing.JTextField SectorTextField;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel ViewLabel;
    private javax.swing.JTextField ViewTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables


}
