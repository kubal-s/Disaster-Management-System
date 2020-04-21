/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.PoliceAdminRole;
import business.role.Role;
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
