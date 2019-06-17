package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    Map<String, Integer> inventory;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        inventory = new HashMap<>();

        for(String str : strings){
            inventory.merge(str, 1, (v1, v2) -> v1 + v2);
        }

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inventory = new HashMap<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        inventory.merge(item, 1, (v1, v2) -> v1 + v2);
        return;
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventory.merge(item, -1, (v1, v2) -> (v1 == null || v1 == 0) ? 0 : v1 + v2);
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer amount = inventory.get(item);
        if(amount == null){
            amount = 0;
        }
        return amount;
    }
}
