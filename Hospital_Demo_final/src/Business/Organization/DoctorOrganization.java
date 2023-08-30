/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Doctor.Prescription;
import Business.Doctor.PrescriptionList;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author raunak
 */
public class DoctorOrganization extends Organization{
    private ArrayList<Prescription> plist;
    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
        plist=new ArrayList<Prescription>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }

    public ArrayList<Prescription> getPlist() {
        return plist;
    }

    public void setPlist(ArrayList<Prescription> plist) {
        this.plist = plist;
    }

    public void addPrescription(Prescription prescription){
        // Prescription prescription=new Prescription();
         plist.add(prescription);
         
        
    }
    
    
     
}