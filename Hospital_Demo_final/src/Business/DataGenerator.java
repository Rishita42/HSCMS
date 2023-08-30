/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.AdminOrganization;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.MedicalEquipmentWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.Supplier.Product;
import com.oracle.jrockit.jfr.Producer;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author family
 */
public class DataGenerator {

    private static String[] equipmentName = {"Stethescope", "Thermometer", "Syringe", "Stretcher", "Blood pressure Kit", "Microscope"};
    private static Random rand = new Random();
    private static String[] network = {"Boston", "Cambridge", "Waltham", "Framingham"};

    private static String[] beginning = {"kr", "ca", "Ra", "Ho", "Lj", "pg", "kre", "lop", "mat"};
    private static String[] middle = {"air", "cal", "Pla", "ghdo", "kal", "hkg", "pokre", "lojop", "mploat"};

    private static String[] hospitalName = {"MGH", "Beth Israel", "Tufts", "South Shore", "Cape cod", "Winchester", "Boston Medical", "Brigham"};

    private static String[] organisationName = {"Doctor", "Pharmacy", "Supplier", "Transportation", "Equipment"};

    private static String[] vaccinationName = {"Meningococcal", "Tdap", "HPV", "Seasonal Flu", "Varicella", "Hepititis B", "MMR"};

    private static String[] medicineName = {"Synthroid", "Crestor", "Ventolin", "esomeprazole", "insulin", "infliximab", "fluticasone", "rosuvastatin"};

    public static String generateEquipmentName() {
        return equipmentName[rand.nextInt(equipmentName.length)];

    }

    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }

    public static String generateSuppliers() {

        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }

    public static String generatePaitents() {

        return beginning[rand.nextInt(beginning.length)] + middle[rand.nextInt(middle.length)];
    }

    public static String generateHospitalName() {
        return hospitalName[rand.nextInt(hospitalName.length)];
    }

    public static String generationOrganisationName() {
        return organisationName[rand.nextInt(organisationName.length)];
    }

    public static String generateVaccineName() {
        return vaccinationName[rand.nextInt(vaccinationName.length)];

    }

    public static String generateMedicine() {

        return medicineName[rand.nextInt(medicineName.length)];

    }

    public static MedicalEquipmentWorkRequest InitMedicalRequest() {
        //ArrayList<MedicalEquipmentWorkRequest> medreq=new ArrayList<>();
        //for(int i=0;i<100;i++){
        MedicalEquipmentWorkRequest request = new MedicalEquipmentWorkRequest();
        request.setEquipmentName(generateEquipmentName());
        request.setNetwork(generateNetwork());
        return request;
    }

    public static PharmacyWorkRequest InitSupplierInfo() {

        PharmacyWorkRequest request = new PharmacyWorkRequest();
        request.setSupplierName(generateSuppliers());
        request.setNetwork(generateNetwork());

        return request;
    }

    public static DoctorWorkRequest InitPaitenceInfo() {

        DoctorWorkRequest request = new DoctorWorkRequest();

        request.setHospitalName(generateHospitalName());
        request.setPaitentName(generatePaitents());

        return request;

    }

    public static AdminOrganization InitOrgName() {

        AdminOrganization request = new AdminOrganization();

        request.setOrganisationName(generationOrganisationName());
        return request;

    }

    public static Product InitVaccineName() {

        Product request = new Product();
        request.setVaccinationName(generateVaccineName());
        request.setHospitalName(generateHospitalName());
        return request;

    }

    public static Product InitMedicineName() {

        Product request = new Product();
        request.setMedicineName(generateMedicine());
        return request;

    }
}
