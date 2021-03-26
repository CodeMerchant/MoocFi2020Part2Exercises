
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author musa
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());

        //adding to list
        this.storageFacility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageFacility.getOrDefault(storageUnit, new ArrayList<>());
    }

    /**
     * Removes only one item from the storage unit. If there are several items
     * with the same name, the rest of them will remain. If storage unit is
     * empty after the removal, the method removes it.
     *
     * @param storageUnit
     * @param item
     */
    public void remove(String storageUnit, String item) {

        ArrayList<String> list = this.storageFacility.get(storageUnit); //first get the item associated with the Unit
        list.remove(item);//remove it from the list

        if (list.isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }

    }

    /**
     * Returns the names of the storage units as a list. NB! Only the storage
     * units that contain items are listed
     *
     * @return list of storage units
     */
    public ArrayList<String> storageUnits() {
        ArrayList<String> namesOfStorageUnits = new ArrayList<>();

        for (Map.Entry<String, ArrayList<String>> storageUnitName : this.storageFacility.entrySet()) {
            if (!storageUnitName.getValue().isEmpty()) {
                namesOfStorageUnits.add(storageUnitName.getKey());
            }
        }
        return namesOfStorageUnits;
    }

}
