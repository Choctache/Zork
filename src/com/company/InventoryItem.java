package com.company;

public class InventoryItem extends Item implements Moveable {


    public InventoryItem(String name, String description) {
        super(name, description);
    }

    @Override
    public void takeItem() {

    }

    @Override
    public void removeItemFromInventory() {

    }
}
