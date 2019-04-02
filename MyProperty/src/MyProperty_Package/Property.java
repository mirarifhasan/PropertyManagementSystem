/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProperty_Package;

/**
 *
 * @author ASUS
 */


public class Property {

    //Here all variables are Properties attribute
    private int PropertyID, AddressID, OwnerID, BuyerID=-1, RentalPrice, AdvancePrice, SellingPrice, Area, Bedroom, Bathroom, Balcony, Lift;
    private String Title, Purpose, Status, MainView, Parking, ElectricityBackup, CCTVSecurity, Intercom, Description, RentTo;    
    private byte[] img;

    
    public Property() {
        this.PropertyID = -1;
        this.AddressID = -1;
        this.OwnerID = -1;
        this.BuyerID = -1;
        this.RentalPrice = -1;
        this.AdvancePrice = 0;
        this.Area = -1;
        this.Bedroom = -1;
        this.Bathroom = -1;
        this.Balcony = -1;
        this.Lift = -1;
        this.Title = null;
        this.Purpose = null;
        this.Status = null;
        this.MainView = null;
        this.Parking = null;
        this.ElectricityBackup = null;
        this.CCTVSecurity = null;
        this.Intercom = null;
        this.Description = null;
        this.img = null;
    }

    public Property(int PropertyID, int AddressID, int OwnerID, int BuyerID, int RentalPrice, int AdvancePrice, int Area, int Bedroom, int Bathroom, int Balcony, int Lift, String Title, String Purpose, String Status, String MainView, String Parking, String ElectricityBackup, String CCTVSecurity, String Intercom, String Description, byte[] img, String RentTo) {
        this.PropertyID = PropertyID;
        this.AddressID = AddressID;
        this.OwnerID = OwnerID;
        this.BuyerID = BuyerID;
        this.RentalPrice = RentalPrice;
        this.AdvancePrice = AdvancePrice;
        this.Area = Area;
        this.Bedroom = Bedroom;
        this.Bathroom = Bathroom;
        this.Balcony = Balcony;
        this.Lift = Lift;
        this.Title = Title;
        this.Purpose = Purpose;
        this.Status = Status;
        this.MainView = MainView;
        this.Parking = Parking;
        this.ElectricityBackup = ElectricityBackup;
        this.CCTVSecurity = CCTVSecurity;
        this.Intercom = Intercom;
        this.Description = Description;
        this.img = img;
        this.RentTo = RentTo;
    }

    //Call from Prifile
    public Property(int PropertyID, int OwnerID, int BuyerID, String Title, String Purpose, String Status, int RentalPrice, String RentTo) {
        this.PropertyID = PropertyID;
        this.OwnerID = OwnerID;
        this.RentalPrice = RentalPrice;
        this.Title = Title;
        this.Purpose = Purpose;
        this.Status = Status;
        this.RentTo = RentTo;
        this.BuyerID = BuyerID;
    }
    
    //Call from Search Result
    public Property(int PropertyID, int AddressID, String Purpose, int Area, int RentalPrice, String RentTo){
        this.PropertyID = PropertyID;
        this.AddressID = AddressID;
        this.Purpose = Purpose;
        this.Area = Area;
        this.RentalPrice = RentalPrice;
        this.RentTo = RentTo;
    }
    
    
    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int PropertyID) {
        this.PropertyID = PropertyID;
    }

    public int getAddressID() {
        return AddressID;
    }

    public void setAddressID(int AddressID) {
        this.AddressID = AddressID;
    }

    public int getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    public int getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(int BuyerID) {
        this.BuyerID = BuyerID;
    }

    public int getRentalPrice() {
        return RentalPrice;
    }

    public void setRentalPrice(int RentalPrice) {
        this.RentalPrice = RentalPrice;
    }

    public int getAdvancePrice() {
        return AdvancePrice;
    }

    public void setAdvancePrice(int AdvancePrice) {
        this.AdvancePrice = AdvancePrice;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public int getBedroom() {
        return Bedroom;
    }

    public void setBedroom(int Bedroom) {
        this.Bedroom = Bedroom;
    }

    public int getBathroom() {
        return Bathroom;
    }

    public void setBathroom(int Bathroom) {
        this.Bathroom = Bathroom;
    }

    public int getBalcony() {
        return Balcony;
    }

    public void setBalcony(int Balcony) {
        this.Balcony = Balcony;
    }

    public int getLift() {
        return Lift;
    }

    public void setLift(int Lift) {
        this.Lift = Lift;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPurpose() {
        return Purpose;
    }

    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMainView() {
        return MainView;
    }

    public void setMainView(String MainView) {
        this.MainView = MainView;
    }

    public String getParking() {
        return Parking;
    }

    public void setParking(String Parking) {
        this.Parking = Parking;
    }

    public String getElectricityBackup() {
        return ElectricityBackup;
    }

    public void setElectricityBackup(String ElectricityBackup) {
        this.ElectricityBackup = ElectricityBackup;
    }

    public String getCCTVSecurity() {
        return CCTVSecurity;
    }

    public void setCCTVSecurity(String CCTVSecurity) {
        this.CCTVSecurity = CCTVSecurity;
    }

    public String getIntercom() {
        return Intercom;
    }

    public void setIntercom(String Intercom) {
        this.Intercom = Intercom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getRentTo() {
        return RentTo;
    }

    public void setRentTo(String RentTo) {
        this.RentTo = RentTo;
    }

    public int getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(int SellingPrice) {
        this.SellingPrice = SellingPrice;
    }
}
