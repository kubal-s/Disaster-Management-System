/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.cityadminrole.CityAdminRoleWorkAreaJPanel;

/**
 *
 * @author akhil
 */
public class CityAdminRole extends Role{

    
    public CityAdminRole() {
        super(RoleType.CityAdmin);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new CityAdminRoleWorkAreaJPanel(userProcessContainer, system ,account); //To change body of generated methods, choose Tools | Templates.
    }  
}
