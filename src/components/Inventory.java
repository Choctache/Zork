package components;

import java.util.Map;

public class Inventory {

    private Map<String, Item> inventory;

    public Inventory(Map<String, Item> inventory) {
        this.inventory = inventory;
    }

    public Map<String, Item> getInventory() {
        return inventory;
    }

    public void setInventory(Map<String, Item> inventory) {
        this.inventory = inventory;
    }

    public void addItemToInventory(Item item){
        this.inventory.put(item.getName(), item);
    }

    public Item removeItemFromInventory(String name){
        return this.inventory.remove(name);

    }

    public void listInventory(){
       //TODO: list inventory
    }
}
