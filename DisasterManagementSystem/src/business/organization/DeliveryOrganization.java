/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.DeliveryManRole;
import business.role.Role;
import java.util.ArrayList;

public class DeliveryOrganization extends Organization{

    public DeliveryOrganization() {
        super(Organization.Type.Delivery.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles =  new ArrayList<Role>();
        roles.add(new DeliveryManRole());
        return roles;
    }
    
}
