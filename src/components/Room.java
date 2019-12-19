package components;

import java.util.ArrayList;

public class Room {

    private Crossing north;
    private Crossing east;
    private Crossing south;
    private Crossing west;
    private Inventory northInv;
    private Inventory eastInv;
    private Inventory southInv;
    private Inventory westInv;


    public Room(Crossing north, Crossing east, Crossing south, Crossing west) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public Room(Crossing north, Crossing east, Crossing south, Crossing west,
                Inventory northInv, Inventory eastInv, Inventory southInv, Inventory westInv) {
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        this.northInv = northInv;
        this.eastInv = eastInv;
        this.southInv = southInv;
        this.westInv = westInv;
    }

    public Crossing getNorth() {
        return north;
    }

    public void setNorth(Crossing north) {
        this.north = north;
    }

    public Crossing getEast() {
        return east;
    }

    public void setEast(Crossing east) {
        this.east = east;
    }

    public Crossing getSouth() {
        return south;
    }

    public void setSouth(Crossing south) {
        this.south = south;
    }

    public Crossing getWest() {
        return west;
    }

    public void setWest(Crossing west) {
        this.west = west;
    }

    public Inventory getNorthInv() {
        return northInv;
    }

    public void setNorthInv(Inventory northInv) {
        this.northInv = northInv;
    }

    public Inventory getEastInv() {
        return eastInv;
    }

    public void setEastInv(Inventory eastInv) {
        this.eastInv = eastInv;
    }

    public Inventory getSouthInv() {
        return southInv;
    }

    public void setSouthInv(Inventory southInv) {
        this.southInv = southInv;
    }

    public Inventory getWestInv() {
        return westInv;
    }

    public void setWestInv(Inventory westInv) {
        this.westInv = westInv;
    }

    public String describeCrossing(Crossing crossing) {
        String desc = "";
        switch (crossing) {
            case WALL:
                desc = " wall.";
                break;
            case OPEN_DOOR:
                desc = "n open door.";
                break;
            case CLOSED_DOOR:
                desc = " closed door.";
                break;
        }
        return desc;
    }

    public void listInventory(ArrayList<Item> inventory){
        System.out.println("There are the following items visible: ");
        for(Item item : inventory){
            System.out.println("\t- Name: "+ item.getName());
            System.out.println("\t\t- Description: "+ item.getDescription());
        }
    }

    public void showNorth() {

        String desc = describeCrossing(this.north);
        System.out.println("To the north is a" + desc);

        //Todo: list items on north side

    }

    public void showEast() {

        String desc = describeCrossing(this.east);
        System.out.println("To the east is a" + desc);

        //Todo: list items on east side

    }

    public void showSouth() {

        String desc = describeCrossing(this.south);
        System.out.println("To the south is a" + desc);

        //Todo: list items on south side

    }

    public void showWest() {

        String desc = describeCrossing(this.west);
        System.out.println("To the west is a" + desc);

        //Todo: list items on west side

    }

    public boolean isCrossable(Crossing crossing){
        boolean crossable = false;
        switch (crossing) {
            case OPEN_DOOR:
                crossable = true;
                break;
            default:
                break;
        }
        return crossable;
    }

    public boolean isNorthCrossable() {
        return isCrossable(this.north);
    }

    public boolean isEastCrossable() {
        return isCrossable(this.east);
    }

    public boolean isSouthCrossable() {
        return isCrossable(this.south);
    }

    public boolean isWestCrossable() {
        return isCrossable(this.west);
    }

}