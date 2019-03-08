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
    
    private int PropertyID, AddressID, OwnerID, ClientID, RentalPrice, AdvancePrice, Area, Bedroom, Bathroom, Balcony, Lift;
    
    private String Title, Type, Status, MainView, Parking, ElectricityBackup, CCTVSecurity, Intercom;
    
    private byte[] img;

    
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

    public int getClientID() {
        return ClientID;
    }

    public void setClientID(int ClientID) {
        this.ClientID = ClientID;
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

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
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

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    
}
