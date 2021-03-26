
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("GB", "LDN-987");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list again

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Mauricio");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
        System.out.println("");

        VehicleRegistry reg = new VehicleRegistry();
        //adding li1 to the registry - should return true since the plate hasn't yet been added to 
        System.out.println("Adding Mauricio to registry:");
        System.out.println(reg.add(li1, "Mauricio"));
        //getting li1 owner
        System.out.println(reg.get(li1));

        System.out.println("");

        System.out.println("trying to add Mauricio license again:");

        //attempting to add li1 again. Should return false
        System.out.println(reg.add(li1, "Mauricio"));
        System.out.println("");
        System.out.println("trying to get owner of unregistered plate:");

        System.out.println(reg.get(li2)); //hasn't been added to the registry. Will return null
        System.out.println("");

        System.out.println("removing existing plate(true means removal is successful):");
        //removing existing plate
        System.out.println(reg.remove(li1));

        System.out.println("");

        System.out.println("removing unregistered plate:");
        //removing plate not in registry - should return false
        System.out.println(reg.remove(li2));

        System.out.println("");

        System.out.println("printing out all licence plates in registry:");
        reg.add(li1, "Mauricio");
        reg.add(li2, "Jose");
        reg.add(li3, "Jurgen");
        reg.add(li4, "Jose");

        reg.printLicensePlates();

        System.out.println("");
        //printing out owners. 
        System.out.println("Printing out all the owners:");
        reg.printOwners();

    }
}
