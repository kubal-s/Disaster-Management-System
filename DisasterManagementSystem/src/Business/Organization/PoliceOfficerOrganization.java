/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.PoliceOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

public class PoliceOfficerOrganization extends Organization{

    public PoliceOfficerOrganization() {
        super(Organization.Type.PoliceOfficer.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PoliceOfficerRole());
        return roles;
    }
    
}
