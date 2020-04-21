/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;
import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

public class Network {
    private String name;
    private String cityName;
    private UserAccount cityAdmin;
    private List<String> zipCodes;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        zipCodes = new ArrayList<String>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public UserAccount getCityAdmin() {
        return cityAdmin;
    }

    public void setCityAdmin(UserAccount cityAdmin) {
        this.cityAdmin = cityAdmin;
    }

    public List<String> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(List<String> zipCodes) {
        this.zipCodes = zipCodes;
    }

    public void addZipCode(String zipCode){
        this.zipCodes.add(zipCode);
    }
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
