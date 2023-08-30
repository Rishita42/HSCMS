/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author family
 */
public class TransportationWorkRequest extends WorkRequest {
    
    private String senderName;
    private String time;
    private String timezone;
    private String vehicleNumber;
    private String hospitalName;
    private String message;
    private String urgency;
    private String equipmentinfo;
     private int uniqueId;
    private static int count=11001;
    private int requestId;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    
    
    
    public TransportationWorkRequest(){
        count++;
        uniqueId=count;
        
    }

    public int getUniqueId() {
        return uniqueId;
    }
    
    

    public String getEquipmentinfo() {
        return equipmentinfo;
    }

    public void setEquipmentinfo(String equipmentinfo) {
        this.equipmentinfo = equipmentinfo;
    }
    
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
    
    

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    
    

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String sender) {
        this.senderName = sender;
    }
    
    
    @Override
    public String toString(){
        return this.senderName;
    }
    
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    
    
    
    
}
