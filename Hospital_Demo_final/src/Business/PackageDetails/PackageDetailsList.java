/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PackageDetails;

import java.util.ArrayList;

/**
 *
 * @author family
 */
public class PackageDetailsList {
    
    private ArrayList<Packagedetails> detailsList;
    
    public PackageDetailsList(){
        detailsList=new ArrayList<>();
    }

    public ArrayList<Packagedetails> getDetailsList() {
        return detailsList;
    }

    public void setDetailsList(ArrayList<Packagedetails> detailsList) {
        this.detailsList = detailsList;
    }
    
    public Packagedetails addDetails(){
        Packagedetails p=new Packagedetails();
        detailsList.add(p);
        return p;
        
    }
    
    
}
