/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {
    
    RoleType roleType;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }
    
    
    public enum RoleType{
        HospitalAdmin("Hospital Admin"),
        Doctor("Doctor"),
        HospitalStaff("Hospital Staff"),
        FoodBankAdmin("Food Bank Admin"),
        FoodPackager("Food Packager"),
        DeliveryMan("Delivery Man"),
        PoliceAdmin("Police Admin"),
        PoliceOfficer("Police Officer"),
        NGOAdmin("NGO Admin"),
        Volunteer("Volunteer"),
        CityAdmin("City Admin"),
        VictimRole("Victim"),
        SystemAdmin("System Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    
}