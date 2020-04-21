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
import userinterface.foodpackagerrole.FoodPackagerWorkAreaJPanel;

public class FoodPackagerRole extends Role {

    public FoodPackagerRole() {
        super(RoleType.FoodPackager);
    }

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FoodPackagerWorkAreaJPanel(userProcessContainer, business, account);
   }
    
}
