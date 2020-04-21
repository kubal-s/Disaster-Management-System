/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.DoctorOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

public class DoctorRole extends Role{

    public DoctorRole() {
        super(RoleType.Doctor);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new userinterface.doctorrolee.DoctorWorkAreaJPanel(userProcessContainer, business, account);
    }
    
    
}
