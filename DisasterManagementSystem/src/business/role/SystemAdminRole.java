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
import userinterface.systemadminrole.SystemAdminRoleWorkAreaJPanel;

public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(RoleType.SystemAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAdminRoleWorkAreaJPanel(userProcessContainer, system);
    }
    
}
