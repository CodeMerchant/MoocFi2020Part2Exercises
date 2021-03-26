
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author musa
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }

    /**
     * Assigns the owner it received as a parameter to a car that corresponds to
     * the license plate received as a parameter. If plate doesn't have an
     * owner, the method returns true and adds the new registration. If the
     * license already has an owner, the method returns false and does nothing.
     *
     * @param licensePlate
     * @param owner
     * @return
     */
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.hashmap.get(licensePlate) == null) {
            this.hashmap.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    /**
     * Method that returns the owner of the car corresponding to the license
     * plate
     *
     * @param licensePlate object passed as an argument to help get owner of car
     * @return owner of car is returned. Null reference returned if car isn't in
     * registry
     */
    public String get(LicensePlate licensePlate) {
        return this.hashmap.get(licensePlate);
    }

    /**
     * removes the license plate and attached data from the registry. Method
     * returns true if removal has been successful and false upon an
     * unsuccessful removal (i.e if the plate wasn't in the registry.
     *
     * @param licensePlate object that needs to passed as an argument to the
     * method.
     * @return true or false depending on success of removal or lack of.
     */
    public boolean remove(LicensePlate licensePlate) {
        if (this.hashmap.containsKey(licensePlate)) {
            this.hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }

    /**
     * prints the license plates in the registry
     */
    public void printLicensePlates() {
        for (Map.Entry<LicensePlate, String> entry : this.hashmap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    /**
     * Prints the owners of the cars in the registry. Each name is printed once,
     * even if an owner owns more than one car
     *
     */
    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<>();
        for (Map.Entry<LicensePlate, String> entry : this.hashmap.entrySet()) {
            String owner = entry.getValue();
            //checking if the list already has a particular owner to help avoid duplicate entries
            if (!ownersList.contains(owner)) {
                ownersList.add(owner);
                System.out.println(owner);
            }
        }

        /*
        faster way - we haven't been taught HashSets yet by the way. Make sure you understand
        whats happening in this code before using it. Again, thanks to @cardouken from GitHub.
        NB! make sure to import java.util.Set
        
        final Set<String> owners = new HashSet<>(this.hashmap.values()):
        for(String ownerList : owners){
        System.out.println(ownerList);
         */
    }
}
