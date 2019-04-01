/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProperty_Package;

import java.awt.Image;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
    Property property = new Property();
    Address address = new Address();

    
    public PropertyForm(Users user) {
        initComponents();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.user = user;
        RentalPriceLabel.setVisible(false);
        AdvancePriceLabel.setVisible(false);
        SellingPriceLabel.setVisible(false);
        RentalPriceTextField.setVisible(false);
        AdvancePriceTextField.setVisible(false);
        SellingPriceTextField.setVisible(false);
    }

    PropertyForm(Property property, Users user) {
        initComponents();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        this.user = user;
        this.property = property;
        
        AddPropertyButton.setText("Update");
        this.property = property;
        getAllFields();
    }

    private void getAllFields() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TitleTextField.setText(property.getTitle());
        PurposeComboBox.setSelectedItem(property.getPurpose());
        StatusComboBox.setSelectedItem(property.getStatus());
        RentalPriceTextField.setText(String.valueOf(property.getRentalPrice()));
        AdvancePriceTextField.setText(String.valueOf(property.getAdvancePrice()));
        
        RentForComboBox.setSelectedItem(property.getRentTo());
        SellingPriceTextField.setText(String.valueOf(property.getSellingPrice()));
        
        AreaSqftTextField.setText(String.valueOf(property.getArea()));
        BedroomComboBox.setSelectedItem(String.valueOf(property.getBedroom()));
        BathroomComboBox.setSelectedItem(String.valueOf(property.getBathroom()));
        BalconyComboBox.setSelectedItem(String.valueOf(property.getBalcony()));
        ViewComboBox.setSelectedItem(String.valueOf(property.getMainView()));
        
        LiftComboBox.setSelectedItem(String.valueOf(property.getLift()));
        ParkingComboBox.setSelectedItem(String.valueOf(property.getParking()));
        ElectricityComboBox.setSelectedItem(String.valueOf(property.getElectricityBackup()));
        IntercomComboBox.setSelectedItem(String.valueOf(property.getIntercom()));
        CCTVComboBox.setSelectedItem(String.valueOf(property.getCCTVSecurity()));
        
        DescriptionTextPane.setText(property.getDescription());
        
        try {
            ConnectMSSQL obj = new ConnectMSSQL();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");
            Statement statement = obj.connection.createStatement();

            //Getting Rows of Address table
            String sql = "SELECT * FROM Address WHERE AddressID='"+property.getAddressID()+ "';";
            ResultSet rs = statement.executeQuery(sql);
            rs.next();
            
            address.setAddressID(rs.getInt("AddressID"));
            address.setCity(rs.getString("City"));
            address.setArea(rs.getString("Area"));
            address.setRoad(rs.getString("Road"));
            address.setBlock(rs.getString("Block"));
            address.setSector(rs.getString("Sector"));
            address.setHouse(rs.getString("House"));
            
            CityTextField.setText(address.getCity());
            AreaTextField.setText(address.getArea());
            RoadTextField.setText(address.getRoad());
            BlockTextField.setText(address.getBlock());
            SectorTextField.setText(address.getSector());
            HouseTextField.setText(address.getHouse());
            
            //Image set code
            String query = "SELECT Img FROM Property WHERE PropertyID='"+property.getPropertyID()+"';";
            statement = (PreparedStatement) obj.connection.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            
            BufferedImage im = ImageIO.read(result.getBinaryStream(1));
            ImageIcon image1 = new ImageIcon(im);
            imageLabel.setIcon(image1);
            getContentPane().add(imageLabel);
            setVisible(true);
            
        }catch(Exception e){}
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
        PurposeLabel = new javax.swing.JLabel();
        PurposeComboBox = new javax.swing.JComboBox<>();
        Status = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        RentalPriceLabel = new javax.swing.JLabel();
        RentalPriceTextField = new javax.swing.JTextField();
        AdvancePriceLabel = new javax.swing.JLabel();
        AdvancePriceTextField = new javax.swing.JTextField();
        AreaSqftLabel = new javax.swing.JLabel();
        AreaSqftTextField = new javax.swing.JTextField();
        BedroomLabel = new javax.swing.JLabel();
        BedroomComboBox = new javax.swing.JComboBox<>();
        BathroomLabel = new javax.swing.JLabel();
        BathroomComboBox = new javax.swing.JComboBox<>();
        BalconyLabel = new javax.swing.JLabel();
        BalconyComboBox = new javax.swing.JComboBox<>();
        ViewLabel = new javax.swing.JLabel();
        ViewComboBox = new javax.swing.JComboBox<>();
        LiftLabel = new javax.swing.JLabel();
        LiftComboBox = new javax.swing.JComboBox<>();
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
        AreaLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        RoadTextField = new javax.swing.JTextField();
        SectorTextField = new javax.swing.JTextField();
        HouseTextField = new javax.swing.JTextField();
        AreaTextField = new javax.swing.JTextField();
        BlockTextField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        imageButton = new javax.swing.JButton();
        SellingPriceLabel = new javax.swing.JLabel();
        SellingPriceTextField = new javax.swing.JTextField();
        RentForLabel = new javax.swing.JLabel();
        RentForComboBox = new javax.swing.JComboBox<>();
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

        PurposeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PurposeLabel.setForeground(new java.awt.Color(255, 255, 255));
        PurposeLabel.setText("Purpose:");
        jPanel1.add(PurposeLabel);
        PurposeLabel.setBounds(80, 110, 85, 30);

        PurposeComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PurposeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Rent", "Sell", "Both" }));
        PurposeComboBox.setToolTipText("");
        PurposeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PurposeComboBoxItemStateChanged(evt);
            }
        });
        jPanel1.add(PurposeComboBox);
        PurposeComboBox.setBounds(170, 110, 110, 30);

        Status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("Status: ");
        jPanel1.add(Status);
        Status.setBounds(80, 150, 85, 30);

        StatusComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Avalable" }));
        jPanel1.add(StatusComboBox);
        StatusComboBox.setBounds(170, 150, 110, 30);

        RentalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RentalPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        RentalPriceLabel.setText("Rental Price:");
        jPanel1.add(RentalPriceLabel);
        RentalPriceLabel.setBounds(80, 190, 85, 30);

        RentalPriceTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(RentalPriceTextField);
        RentalPriceTextField.setBounds(170, 190, 110, 30);

        AdvancePriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AdvancePriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdvancePriceLabel.setText("Advance Price:");
        jPanel1.add(AdvancePriceLabel);
        AdvancePriceLabel.setBounds(310, 190, 85, 30);
        jPanel1.add(AdvancePriceTextField);
        AdvancePriceTextField.setBounds(400, 190, 110, 30);

        AreaSqftLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AreaSqftLabel.setForeground(new java.awt.Color(255, 255, 255));
        AreaSqftLabel.setText("Area (sqft):");
        jPanel1.add(AreaSqftLabel);
        AreaSqftLabel.setBounds(80, 360, 70, 30);

        AreaSqftTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(AreaSqftTextField);
        AreaSqftTextField.setBounds(150, 360, 70, 30);

        BedroomLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BedroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        BedroomLabel.setText("Bedroom:");
        jPanel1.add(BedroomLabel);
        BedroomLabel.setBounds(260, 360, 53, 30);

        BedroomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));
        jPanel1.add(BedroomComboBox);
        BedroomComboBox.setBounds(320, 360, 70, 30);

        BathroomLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BathroomLabel.setForeground(new java.awt.Color(255, 255, 255));
        BathroomLabel.setText("Bathroom:");
        jPanel1.add(BathroomLabel);
        BathroomLabel.setBounds(450, 360, 57, 30);

        BathroomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jPanel1.add(BathroomComboBox);
        BathroomComboBox.setBounds(515, 360, 70, 30);

        BalconyLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BalconyLabel.setForeground(new java.awt.Color(255, 255, 255));
        BalconyLabel.setText("Balcony:");
        jPanel1.add(BalconyLabel);
        BalconyLabel.setBounds(620, 360, 45, 30);

        BalconyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        jPanel1.add(BalconyComboBox);
        BalconyComboBox.setBounds(670, 360, 70, 30);

        ViewLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ViewLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewLabel.setText("View:");
        jPanel1.add(ViewLabel);
        ViewLabel.setBounds(810, 360, 31, 30);

        ViewComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "East", "West", "North", "South" }));
        jPanel1.add(ViewComboBox);
        ViewComboBox.setBounds(850, 360, 80, 30);

        LiftLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LiftLabel.setForeground(new java.awt.Color(255, 255, 255));
        LiftLabel.setText("Lift:");
        jPanel1.add(LiftLabel);
        LiftLabel.setBounds(120, 410, 21, 30);

        LiftComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jPanel1.add(LiftComboBox);
        LiftComboBox.setBounds(150, 410, 70, 30);

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
        CCTVLabel.setBounds(760, 410, 82, 30);

        CCTVComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CCTVComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        jPanel1.add(CCTVComboBox);
        CCTVComboBox.setBounds(850, 410, 80, 30);

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
        AddPropertyButton.setBounds(800, 540, 120, 30);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(80, 540, 80, 30);

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

        AreaLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AreaLabel.setForeground(new java.awt.Color(255, 255, 255));
        AreaLabel.setText("Area:");
        jPanel1.add(AreaLabel);
        AreaLabel.setBounds(660, 300, 29, 30);

        CityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(255, 255, 255));
        CityLabel.setText("City:");
        jPanel1.add(CityLabel);
        CityLabel.setBounds(820, 300, 24, 30);
        jPanel1.add(CityTextField);
        CityTextField.setBounds(850, 300, 80, 30);
        jPanel1.add(RoadTextField);
        RoadTextField.setBounds(260, 300, 75, 30);
        jPanel1.add(SectorTextField);
        SectorTextField.setBounds(560, 300, 75, 30);
        jPanel1.add(HouseTextField);
        HouseTextField.setBounds(130, 300, 75, 30);

        AreaTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(AreaTextField);
        AreaTextField.setBounds(710, 300, 75, 30);
        jPanel1.add(BlockTextField);
        BlockTextField.setBounds(400, 300, 75, 30);

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyProperty_Package/Image/photoPlus.png"))); // NOI18N
        jPanel1.add(imageLabel);
        imageLabel.setBounds(640, 120, 140, 150);

        imageButton.setText("Upload Image");
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(imageButton);
        imageButton.setBounds(800, 180, 120, 30);

        SellingPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SellingPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        SellingPriceLabel.setText("Selling Price:");
        jPanel1.add(SellingPriceLabel);
        SellingPriceLabel.setBounds(80, 230, 68, 30);
        jPanel1.add(SellingPriceTextField);
        SellingPriceTextField.setBounds(170, 230, 110, 30);

        RentForLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RentForLabel.setForeground(new java.awt.Color(255, 255, 255));
        RentForLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RentForLabel.setText("Rent For:");
        jPanel1.add(RentForLabel);
        RentForLabel.setBounds(305, 110, 85, 30);

        RentForComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RentForComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any", "Family", "Bachelor" }));
        jPanel1.add(RentForComboBox);
        RentForComboBox.setBounds(400, 110, 110, 30);

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
    
    private void AddPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPropertyButtonActionPerformed
        
        ArrayList<String> emptyFields = new ArrayList<String>();

        if(TitleTextField.getText().trim().isEmpty()) emptyFields.add("Title");
        else property.setTitle(TitleTextField.getText().trim());

        if(PurposeComboBox.getSelectedItem().toString() == "Select") emptyFields.add("Purpose");
        else property.setPurpose(PurposeComboBox.getSelectedItem().toString());

        if(property.getPurpose().equals("Both")){
            if(SellingPriceTextField.getText().trim().isEmpty()) emptyFields.add("Selling Price");
            else property.setSellingPrice(Integer.parseInt(SellingPriceTextField.getText().trim()));
            if(RentalPriceTextField.getText().trim().isEmpty()) emptyFields.add("Rental Price");
            else property.setRentalPrice(Integer.parseInt(RentalPriceTextField.getText().trim()));
        }
        else if(property.getPurpose().equals("Rent")){
            if(RentalPriceTextField.getText().isEmpty()) emptyFields.add("Rental Price");
            else property.setRentalPrice(Integer.parseInt(RentalPriceTextField.getText().trim()));
            
            if(!SellingPriceTextField.getText().isEmpty())
                property.setSellingPrice(Integer.parseInt(SellingPriceTextField.getText().trim()));
        }
        else{
            if(SellingPriceTextField.getText().isEmpty()) emptyFields.add("Selling Price");
            else property.setSellingPrice(Integer.parseInt(SellingPriceTextField.getText().trim()));
            
            if(!RentalPriceTextField.getText().isEmpty())
                property.setRentalPrice(Integer.parseInt(RentalPriceTextField.getText().trim()));
        }
        
        
        property.setStatus(StatusComboBox.getSelectedItem().toString());

        if(!AdvancePriceTextField.getText().trim().isEmpty())
            property.setAdvancePrice(Integer.parseInt(AdvancePriceTextField.getText().trim()));
        
        if(AreaSqftTextField.getText().trim().isEmpty()) emptyFields.add("Area(Sqft)");   
        else property.setArea(Integer.parseInt(AreaSqftTextField.getText().trim()));

        property.setBedroom(Integer.parseInt(BedroomComboBox.getSelectedItem().toString()));
        
        property.setBathroom(Integer.parseInt(BathroomComboBox.getSelectedItem().toString()));
        
        property.setBalcony(Integer.parseInt(BalconyComboBox.getSelectedItem().toString()));
        
        property.setMainView(ViewComboBox.getSelectedItem().toString());

        property.setLift(Integer.parseInt(LiftComboBox.getSelectedItem().toString()));
        
        property.setRentTo(RentForComboBox.getSelectedItem().toString());
        
        if(ParkingComboBox.getSelectedItem().toString() == "Select") emptyFields.add("Parking");
        else property.setParking(ParkingComboBox.getSelectedItem().toString());
        
        if(ElectricityComboBox.getSelectedItem().toString() == "Select") emptyFields.add("Electricity backup");
        else property.setElectricityBackup(ElectricityComboBox.getSelectedItem().toString());
                
        if(IntercomComboBox.getSelectedItem().toString() == "Select") emptyFields.add("Intercom");
        else property.setIntercom(IntercomComboBox.getSelectedItem().toString());
                        
        if(CCTVComboBox.getSelectedItem().toString() == "Select") emptyFields.add("CCTV");
        else property.setCCTVSecurity(CCTVComboBox.getSelectedItem().toString());
        
        if(!DescriptionTextPane.getText().isEmpty()) property.setDescription(DescriptionTextPane.getText().trim());
        
        if(CityTextField.getText().trim().isEmpty()) emptyFields.add("City");
            address.setCity(CityTextField.getText().trim());
        if(AreaTextField.getText().trim().isEmpty()) emptyFields.add("Area");
            address.setArea(AreaTextField.getText().trim());
        address.setSector(SectorTextField.getText().trim());
        address.setBlock(BlockTextField.getText().trim());
        if(RoadTextField.getText().trim().isEmpty()) emptyFields.add("Road");
            address.setRoad(RoadTextField.getText().trim());
        if(HouseTextField.getText().trim().isEmpty()) emptyFields.add("House");
            address.setHouse(HouseTextField.getText().trim());

        
        if(emptyFields.isEmpty()){
            ConnectMSSQL obj = new ConnectMSSQL();
            String sql = null;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                obj.connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PropertyManagementSystemDB;selectMethod=cursor", "sa", "123456");

                Statement statement = obj.connection.createStatement();
                
                //Getting Rows of Address table
                sql = "SELECT * FROM Address WHERE City='" + address.getCity() + "' AND Area='" + address.getArea() + "' AND Road='" + address.getRoad() + "' AND Block='" + address.getBlock() + "' AND Sector='" + address.getSector() + "' AND House='" + address.getHouse() +"';";
                ResultSet resultSet = statement.executeQuery(sql);
                
                //Checking if the address already exists
                if(resultSet.next())   //if exists
                    address.setAddressID(resultSet.getInt("AddressID"));
                else {
                    //Address doesn't exist, then creat a row in address table
                    sql = "INSERT INTO Address VALUES ('" + address.getCity() + "', '" + address.getArea() + "', '" + address.getRoad() + "', '"+ address.getBlock() + "', '" + address.getSector() + "', '"+ address.getHouse() + "');";
                    statement.execute(sql);
                    
                    sql = "SELECT * FROM Address WHERE City='" + address.getCity() + "' AND Area='" + address.getArea() + "' AND Road='" + address.getRoad() + "' AND Block='" + address.getBlock() + "' AND Sector='" + address.getSector() + "' AND House='" + address.getHouse() +"';";
                    resultSet = statement.executeQuery(sql);
                    
                    resultSet.next();
                    address.setAddressID(resultSet.getInt("AddressID"));
                }
                if(AddPropertyButton.getText()=="Update"){
                    sql = "UPDATE Property set Title='"+property.getTitle()+"', Purpose='"+property.getPurpose()+
                            "', Status='"+property.getStatus()+"', RentTo='"+property.getRentTo()+"' ,RentalPrice='"+property.getRentalPrice()+"', SellingPrice='"+property.getSellingPrice()+"', AdvancePrice='"+property.getAdvancePrice()+
                            "', Area='"+property.getArea()+"', Bedroom='"+property.getBedroom()+"', Bathroom='"+property.getBathroom()+"', Balcony='"+property.getBalcony()+"', MainView='"+property.getMainView()+"', Lift='"+property.getLift()+"', Parking='"+property.getParking()+
                            "', ElectricityBackup='"+property.getElectricityBackup()+"', CCTVSecurity='"+property.getCCTVSecurity()+"', Intercom='"+property.getIntercom()+"', Description='"+property.getDescription()+"' WHERE PropertyID='"+property.getPropertyID()+"';";
                    statement.execute(sql);
                }
                    
                else{
                    sql = "INSERT INTO Property(AddressID, OwnerID, Title, Purpose, Status, RentTo, RentalPrice, AdvancePrice, SellingPrice, Img, Area, Bedroom, Bathroom, Balcony, MainView, Lift, Parking, ElectricityBackup, CCTVSecurity, Intercom, Description) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = obj.connection.prepareStatement(sql);
                    pst.setInt(1, address.getAddressID());
                    pst.setInt(2, user.getUsersID());
                    pst.setString(3, property.getTitle());
                    pst.setString(4, property.getPurpose());
                    pst.setString(5, property.getStatus());
                    pst.setString(6, RentForComboBox.getSelectedItem().toString());
                    pst.setInt(7, property.getRentalPrice());
                    pst.setInt(8, property.getAdvancePrice());
                    pst.setInt(9, property.getSellingPrice());
                    pst.setBytes(10, property.getImg());
                    pst.setInt(11, property.getArea());
                    pst.setInt(12, property.getBedroom());
                    pst.setInt(13, property.getBathroom());
                    pst.setInt(14, property.getBalcony());
                    pst.setString(15, property.getMainView());
                    pst.setInt(16, property.getLift());
                    pst.setString(17, property.getParking());
                    pst.setString(18, property.getElectricityBackup());
                    pst.setString(19, property.getCCTVSecurity());
                    pst.setString(20, property.getIntercom());
                    pst.setString(21, property.getDescription());
                    pst.executeUpdate();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            new Profile(user).setVisible(true);
            this.setVisible(false);
        }
        else JOptionPane.showMessageDialog(this, "Fill this fields: " + emptyFields);
            
    }//GEN-LAST:event_AddPropertyButtonActionPerformed

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH));
        imageLabel.setIcon(imageIcon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf, 0, readNum);
            }
            byte[] pimg = null;
            pimg = bos.toByteArray();
            property.setImg(pimg);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_imageButtonActionPerformed

    private void PurposeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PurposeComboBoxItemStateChanged
        // TODO add your handling code here:
        if(PurposeComboBox.getSelectedItem().toString().equals("Both")){
            RentalPriceLabel.setVisible(true);
            AdvancePriceLabel.setVisible(true);
            SellingPriceLabel.setVisible(true);
            RentalPriceTextField.setVisible(true);
            AdvancePriceTextField.setVisible(true);
            SellingPriceTextField.setVisible(true);
        }
        else if(PurposeComboBox.getSelectedItem().toString().equals("Sell")){
            RentalPriceLabel.setVisible(false);
            AdvancePriceLabel.setVisible(false);
            SellingPriceLabel.setVisible(true);
            RentalPriceTextField.setVisible(false);
            AdvancePriceTextField.setVisible(false);
            SellingPriceTextField.setVisible(true);
        }
        else if(PurposeComboBox.getSelectedItem().toString().equals("Rent")){
            RentalPriceLabel.setVisible(true);
            AdvancePriceLabel.setVisible(true);
            SellingPriceLabel.setVisible(false);
            RentalPriceTextField.setVisible(true);
            AdvancePriceTextField.setVisible(true);
            SellingPriceTextField.setVisible(false);
        }
        else {
            RentalPriceLabel.setVisible(false);
            AdvancePriceLabel.setVisible(false);
            SellingPriceLabel.setVisible(false);
            RentalPriceTextField.setVisible(false);
            AdvancePriceTextField.setVisible(false);
            SellingPriceTextField.setVisible(false);
        }
    }//GEN-LAST:event_PurposeComboBoxItemStateChanged

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
    private javax.swing.JLabel AreaSqftLabel;
    private javax.swing.JTextField AreaSqftTextField;
    private javax.swing.JTextField AreaTextField;
    private javax.swing.JLabel BGLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> BalconyComboBox;
    private javax.swing.JLabel BalconyLabel;
    private javax.swing.JComboBox<String> BathroomComboBox;
    private javax.swing.JLabel BathroomLabel;
    private javax.swing.JComboBox<String> BedroomComboBox;
    private javax.swing.JLabel BedroomLabel;
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
    private javax.swing.JComboBox<String> LiftComboBox;
    private javax.swing.JLabel LiftLabel;
    private javax.swing.JComboBox<String> ParkingComboBox;
    private javax.swing.JLabel ParkingLabel;
    private javax.swing.JLabel PropertyIDLabel;
    private javax.swing.JComboBox<String> PurposeComboBox;
    private javax.swing.JLabel PurposeLabel;
    private javax.swing.JComboBox<String> RentForComboBox;
    private javax.swing.JLabel RentForLabel;
    private javax.swing.JLabel RentalPriceLabel;
    private javax.swing.JTextField RentalPriceTextField;
    private javax.swing.JLabel RoadLabel;
    private javax.swing.JTextField RoadTextField;
    private javax.swing.JLabel SectorLabel;
    private javax.swing.JTextField SectorTextField;
    private javax.swing.JLabel SellingPriceLabel;
    private javax.swing.JTextField SellingPriceTextField;
    private javax.swing.JLabel Status;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JComboBox<String> ViewComboBox;
    private javax.swing.JLabel ViewLabel;
    private javax.swing.JButton imageButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
