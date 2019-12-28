package components;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private HashMap<String, Item> inventory;

    public Inventory(){
        this.inventory = new HashMap<String,Item>();
    }

    public Inventory(HashMap<String, Item> inventory) {
        this.inventory = inventory;
    }

    public Map<String, Item> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<String, Item> inventory) {
        this.inventory = inventory;
    }

    public boolean containsItem(String key){
        return this.inventory.containsKey(key);
    }

    public void addItemToInventory(Item item){
        this.inventory.put(item.getName(), item);
    }

    public Item removeItemFromInventory(String name){
        //TODO: Exception handling
        if(!inventory.containsKey(name)){
            throw new IllegalArgumentException();
        }else{
            return inventory.get(name);
        }
    }


    public void listInventory(){
        for (Map.Entry<String, Item> entry : inventory.entrySet()) {
            System.out.println("\t- " +entry.getValue().getName() + ": " + entry.getValue().getDescription());
        }
    }

    public boolean isEmtpy(){
        return this.inventory.isEmpty();
    }

}
