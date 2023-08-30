/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
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
        
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization=new PharmacyOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization=new SupplierOragnization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.MedicalEquipment.getValue())){
            organization=new EquipmentHandlingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Transport.getValue())){
            organization=new TransportOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}