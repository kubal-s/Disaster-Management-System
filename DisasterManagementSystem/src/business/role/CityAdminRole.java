/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.cityadminrole.CityAdminRoleWorkAreaJPanel;


public class CityAdminRole extends Role{

    
    public CityAdminRole() {
        super(RoleType.CityAdmin);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new CityAdminRoleWorkAreaJPanel(userProcessContainer, system ,account); //To change body of generated methods, choose Tools | Templates.
    }  
}
