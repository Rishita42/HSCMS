/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author family
 */
public class MedicalEquipmentWorkRequest extends WorkRequest {

    private String equipmentName;
    private String urgencyLevel;
    private String expectedArivalTime;
    private int quantity;
    private String hospitalName;
    private String network;
    private float actualprice;
    private float loanedprice;
    
    private String transportrequestStatus;
    

    public String getTransportrequestStatus() {
        return transportrequestStatus;
    }

    public void setTransportrequestStatus(String transportrequestStatus) {
        this.transportrequestStatus = transportrequestStatus;
    }

    public float getActualprice() {
        return actualprice;
    }

    public void setActualprice(float actualprice) {
        this.actualprice = actualprice;
    }

    public float getLoanedprice() {
        return loanedprice;
    }

    public void setLoanedprice(float loanedprice) {
        this.loanedprice = loanedprice;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getExpectedArivalTime() {
        return expectedArivalTime;
    }

    public void setExpectedArivalTime(String expectedArivalTime) {
        this.expectedArivalTime = expectedArivalTime;
    }

    @Override
    public String toString() {
        return this.equipmentName;
    }

}
