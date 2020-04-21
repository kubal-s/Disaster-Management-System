/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.ArrayList;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalStaff.getValue())){
            organization = new HospitalStaffOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FoodBankAdmin.getValue())){
            organization = new FoodBankAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FoodPackaging.getValue())){
            organization = new FoodPackagingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PoliceAdmin.getValue())){
            organization = new PoliceAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PoliceOfficer.getValue())){
            organization = new PoliceOfficerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NGOAdmin.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}