/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author family
 */
public class OperationsWorkRequest extends WorkRequest {
    
    private UserAccount sender;
    private UserAccount receiver;
    private String medicationName;
    private int Quantity;
    private Date requestDate;
    private String status;
    private String equipmentName;
    private String urgencyLevel;
    private String expectedArivalTime;
    private String availability;

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
    
    
    public String getExpectedArivalTime() {
        return expectedArivalTime;
    }

    public void setExpectedArivalTime(String expectedArivalTime) {
        this.expectedArivalTime = expectedArivalTime;
    }
    
    

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }
    

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString(){
        return this.medicationName;
         
    }
    
    /*@Override 
    public ArrayList<String> toString(){
        Arra
        return this.equipmentName;
        
    }*/
    
    
    
}
