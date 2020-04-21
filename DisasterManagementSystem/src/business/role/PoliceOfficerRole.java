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
import userinterface.policeofficerrole.PoliceOfficerWorkAreaJPanel;

public class PoliceOfficerRole extends Role {

    public PoliceOfficerRole() {
        super(RoleType.PoliceOfficer);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PoliceOfficerWorkAreaJPanel(userProcessContainer, business, account);
    }
    
}