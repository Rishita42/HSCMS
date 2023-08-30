/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.MedicineInventory.MedicineInventory;
import Business.MedicineInventory.MedicineInventoryList;
import Business.Role.PharmacistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author family
 */
public class PharmacyOrganization extends Organization{
    
    private ArrayList<MedicineInventory> medList;
    
     public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
         medList=new ArrayList<MedicineInventory>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacistRole());
        return roles;
    }

    public ArrayList<MedicineInventory> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<MedicineInventory> medList) {
        this.medList = medList;
    }

    
     
     public void addMedicine(MedicineInventory mi)
    {
       
        medList.add(mi);
        
    }
    
}
