package Business;

import business.user.User;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some users 
        //create user account
        
        
        User user1 = system.getUserDirectory().createUser("RRH");
        
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", user1, new SystemAdminRole());
        
        User user2 = system.getUserDirectory().createUser("RRH");
        
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("abc", "abc", user2, new SystemAdminRole());
        
        return system;
    }
    
}
