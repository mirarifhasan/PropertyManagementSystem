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
public class BookRequest {
    
    int OwnetID, BuyerID, PropertyID;

    
    public BookRequest(int OwnetID, int BuyerID, int PropertyID) {
        this.OwnetID = OwnetID;
        this.BuyerID = BuyerID;
        this.PropertyID = PropertyID;
    }

    public int getOwnetID() {
        return OwnetID;
    }

    public void setOwnetID(int OwnetID) {
        this.OwnetID = OwnetID;
    }

    public int getBuyerID() {
        return BuyerID;
    }

    public void setBuyerID(int BuyerID) {
        this.BuyerID = BuyerID;
    }

    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int PropertyID) {
        this.PropertyID = PropertyID;
    }
    
    
    
}
