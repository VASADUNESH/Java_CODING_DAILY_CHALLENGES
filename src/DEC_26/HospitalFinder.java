package DEC_26;
import java.util.*;

class Hospital {
    private static int count = 100; 
    private int hospitalCode;
    private String hospitalName;
    private List<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber,
                    String location) {
        this.hospitalCode = count++;
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    public int getHospitalCode() {
        return hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public List<String> getListOfTreatments() {
        return listOfTreatments;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Hospital:\n" +
               "hospitalCode=" + hospitalCode + "\n" +
               "hospitalName=" + hospitalName + "\n" +
               "listOfTreatments=" + listOfTreatments + "\n" +
               "contactPerson=" + contactPerson + "\n" +
               "contactNumber=" + contactNumber + "\n" +
               "location=" + location;
    }
}

class HospitalService {
    
    List<Hospital> hospitals = new ArrayList<>();

    public int addHospital(String hospitalName, List<String> listOfTreatments, 
                           String contactPerson, String contactNumber, String location) {
        Hospital hospital = new Hospital(hospitalName, listOfTreatments, 
                                          contactPerson, contactNumber, location);
        hospitals.add(hospital);
        return hospital.getHospitalCode();
    }

    public Map<Integer, String> getHospitals() {
        Map<Integer, String> hospitalMap = new HashMap<>();
        for (Hospital hos : hospitals) {
            hospitalMap.put(hos.getHospitalCode(), hos.getHospitalName());
        }
        return hospitalMap;
    }

    public Hospital getHospitalDetails(int hospitalCode) {
        for (Hospital hos : hospitals) {
            if (hos.getHospitalCode() == hospitalCode) {
                return hos;
            }
        }
        return null; 
    }
}

public class HospitalFinder {
    public static void main(String[] args) {
    	HospitalService hospitalService = new HospitalService();

        List<String> treatments1 = Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro");
        int code1 = hospitalService.addHospital("YASHODA", treatments1, "MATHEWS", "9848222222", "Sec");

        List<String> treatments2 = Arrays.asList("Dental", "Orthopedic", "Dermatology");
        int code2 = hospitalService.addHospital("APOLLO", treatments2, "JOHN", "9848223333", "Downtown");

        List<String> treatments3 = Arrays.asList("Neurosurgery", "Pediatric", "Internal Medicine");
        int code3 = hospitalService.addHospital("MAX", treatments3, "LISA", "9848224444", "North");

        System.out.println("List of hospitals:");
        Map<Integer, String> hospitals = hospitalService.getHospitals();
        for (Map.Entry<Integer, String> entry : hospitals.entrySet()) {
            System.out.println("Hospital Code: " + entry.getKey() + ", Hospital Name: " + entry.getValue());
        }

        System.out.println("\nDetails of hospital with code " + code1 + ":");
        Hospital hospitalDetails = hospitalService.getHospitalDetails(code1); 
        if (hospitalDetails != null) {
            System.out.println(hospitalDetails.toString());
        } else {
            System.out.println("Hospital not found with code " + code1);
        }

        System.out.println("\nDetails of hospital with code " + code2 + ":");
        Hospital anotherHospitalDetails = hospitalService.getHospitalDetails(code2); 
        if (anotherHospitalDetails != null) {
            System.out.println(anotherHospitalDetails.toString());
        } else {
            System.out.println("Hospital not found with code " + code2);
        }

        System.out.println("\nDetails of hospital with a non-existent code 999:");
        Hospital nonExistentHospital = hospitalService.getHospitalDetails(999);
        if (nonExistentHospital != null) {
            System.out.println(nonExistentHospital.toString());
        } else {
            System.out.println("Hospital not found with code 999");
        }
        
        
    }
}
