package com.company;

public class Door extends Item implements Openable{

    private boolean locked;

    public Door(String name, String description, boolean locked) {
        super(name, description);
        this.locked = locked;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }
}
