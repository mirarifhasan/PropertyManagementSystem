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
public class Users {
    
    //Here all attributes represents Users who logedin (Owner/Client)
    private int usersID;
    private String firstName;
    private String lastName;
    private int addressID;
    private String phone;
    private String email;
    private String password;

    
    public Users() {
        this.usersID = -1;
        this.firstName = null;
        this.lastName = null;
        this.addressID = -1;
        this.phone = null;
        this.email = null;
        this.password = null;
    }

    Users(int usersID, String fName, String lName, String phone, String email) {
        
        this.usersID = usersID;
        this.firstName = fName;
        this.lastName = lName;
        this.phone = phone;
        this.email = email;
    }

    public int getUsersID() {
        return usersID;
    }

    public void setUsersID(int usersID) {
        this.usersID = usersID;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
