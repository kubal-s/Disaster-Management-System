/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.user.UserDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;


public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private UserDirectory userDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        HospitalAdmin("Hospital Admin Organization"),
        HospitalStaff("Hospital Staff Organization"),
        Doctor("Doctor Organization"), 
        PoliceAdmin("Police Admin Organization"),
        PoliceOfficer("Police Officer Organization"),
        NGOAdmin("NGO Admin Organization"),
        Volunteer("Volunteer Organization"),
        FoodBankAdmin("Food Bank Organization"),
        FoodPackaging("Food Packaging Organization"),
        Delivery("Delivery Organization");
       
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        userDirectory = new UserDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
