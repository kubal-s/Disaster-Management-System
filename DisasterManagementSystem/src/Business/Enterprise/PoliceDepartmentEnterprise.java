/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.PoliceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

public class PoliceDepartmentEnterprise extends Enterprise{

    public PoliceDepartmentEnterprise(String name) {
        super(name, EnterpriseType.PoliceDepartment);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
        @Override
    public Role getAdminRole() {
        return new PoliceAdminRole();
    }
}
