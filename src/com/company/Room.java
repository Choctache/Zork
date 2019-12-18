package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {

    private String name;
    private HashMap<Integer, ArrayList<Item>> directions;

    public Room(String name){
        this.name = name;

        Item testMItem = new Item("testItem", "testItemDescription");

        ArrayList<Item> east = new ArrayList<>();
        ArrayList<Item> west = new ArrayList<>();
        ArrayList<Item> north = new ArrayList<>();
        ArrayList<Item> south = new ArrayList<>();

        north.add(testMItem);

        this.directions = new HashMap<>();
        directions.put(1,north);
        directions.put(2,east);
        directions.put(3,south);
        directions.put(4,west);
    }

    public String getName() {
        return name;
    }

    public String getDirectionName(int index){
        switch(index){
            case 1:
                return "North";
            case 2:
                return "East";
            case 3:
                return "South";
            default:
                return "West";

        }
    }

    public HashMap<Integer,ArrayList<Item>> getDirections() {
        return directions;
    }

    public void listItemsInEyesight(int index){
        System.out.println("What is in front of you: ");
        ArrayList<Item> items = getDirections().get(index);
        for(Item item : items){
            System.out.println("\t- " + item.getName() + ": " + item.getDescription());
        }
    }

}
