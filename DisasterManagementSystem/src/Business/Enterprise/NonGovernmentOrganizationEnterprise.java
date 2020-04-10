/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.NGOAdminRole;
import Business.Role.Role;
import Business.Role.VolunteerRole;
import java.util.ArrayList;

public class NonGovernmentOrganizationEnterprise extends Enterprise{
    
    
    
    public NonGovernmentOrganizationEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.NonGovernmentOrganization);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
        @Override
    public Role getAdminRole() {
        return new NGOAdminRole();
    }
    
    public Role getVolunteerRole(){
        return new VolunteerRole();
    }
}
