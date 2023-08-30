/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicineInventory;

import java.util.ArrayList;

/**
 *
 * @author Gayathri Maganti
 */
public class MedicineInventoryList {
    
    private ArrayList<MedicineInventory> medicineList;

    public MedicineInventoryList() {
        medicineList=new ArrayList<>();
        
    }
    
    

    public ArrayList<MedicineInventory> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<MedicineInventory> medicineList) {
        this.medicineList = medicineList;
    }
   
    public MedicineInventory addMedicine()
    {
        MedicineInventory mi = new MedicineInventory();
        medicineList.add(mi);
        return mi;
    }
    
    public void deleteMedicine(MedicineInventory mi){
     medicineList.remove(mi);
    }
}
