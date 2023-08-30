/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author family
 */
public class MedicalEquipmentEnterprise extends Enterprise{
    
    private WorkQueue equipmentworkqueue;
     
     public MedicalEquipmentEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.MedicalEquipmentWareHouse);
        equipmentworkqueue=new WorkQueue();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public WorkQueue getEquipmentworkqueue() {
        return equipmentworkqueue;
    }

    public void setEquipmentworkqueue(WorkQueue equipmentworkqueue) {
        this.equipmentworkqueue = equipmentworkqueue;
    }

    
    
    
    
}
