/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.DoctorRole;
import business.role.HospitalStaffRole;
import business.role.Role;
import java.util.ArrayList;

public class HospitalStaffOrganization extends Organization{

    public HospitalStaffOrganization() {
        super(Organization.Type.HospitalStaff.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalStaffRole());
        return roles;
    }
       
}
