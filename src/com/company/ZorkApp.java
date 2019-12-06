package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ZorkApp {

    public static void main(String[] args) {

        System.out.println("Welcome to a not yet functioning text adventure!");

        Map<Integer, Room> map = new HashMap<>();
        Room testRoom = new Room("TestRoom");
        map.put(1,testRoom);

        Item testItem = new Item("testItem", "testItemDescription");
        ArrayList<Item> inventory = new ArrayList<>();
        inventory.add(testItem);

        Player player = new Player("TestPlayer", inventory);
        player.whoAmI();

        Room currentRoom = map.get(player.getLocation());

        System.out.println("Where you are: " + currentRoom.getName());
        System.out.println("Where you look at: " + currentRoom.getDirectionName(player.getDirection()));
        currentRoom.listItemsInEyesight(player.getDirection());
        player.listInventory();


    }
}
