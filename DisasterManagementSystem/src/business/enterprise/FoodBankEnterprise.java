/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.FoodBankAdminRole;
import business.role.Role;
import java.util.ArrayList;


public class FoodBankEnterprise extends Enterprise{
    
    private int foodPackets;
    
    public FoodBankEnterprise(String name) {
        super(name, EnterpriseType.FoodBank);
        this.foodPackets = 0;
    }
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public Role getAdminRole() {
        return new FoodBankAdminRole();
    }

    public int getFoodPackets() {
        return foodPackets;
    }

    public void setFoodPackets(int foodPackets) {
        this.foodPackets = foodPackets;
    }
    
    
    
}
