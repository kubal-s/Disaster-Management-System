package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee1 = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee1, new SystemAdminRole());
        
        Employee employee2 = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("abc", "abc", employee2, new SystemAdminRole());
        
        return system;
    }
    
}
