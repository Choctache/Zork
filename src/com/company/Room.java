package com.company;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String name;
    private List<Item> south;
    private List<Item> north;
    private List<Item> east;
    private List<Item> west;

    public List<Item> getSouth() {
        return south;
    }

    public void setSouth(List<Item> south) {
        this.south = south;
    }

    public List<Item> getNorth() {
        return north;
    }

    public void setNorth(List<Item> north) {
        this.north = north;
    }

    public List<Item> getEast() {
        return east;
    }

    public void setEast(List<Item> east) {
        this.east = east;
    }

    public List<Item> getWest() {
        return west;
    }

    public void setWest(List<Item> west) {
        this.west = west;
    }

    public Room(String name){
        this.name = name;
        this.south = new ArrayList<>();
        this.north = new ArrayList<>();
        this.east = new ArrayList<>();
        this.west = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
