/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user;

import business.address.Address;

public class User {
    
    private String name;
    private int id;
    private static int count = 1;
    private String phone;
    private Address address;

    public User() {
        id = count;
        count++;
    }
    public boolean validatePhoneNumber(String num){
        if(num.matches("\\d{10}"))
            return true;
        return false;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    
    public int getId() {
        return id;
    }
    
    
    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }       
}
