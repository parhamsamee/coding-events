package org.launchcode.codingevents.models;

public class Event {

    //Variables

    private String name;

    //Constructors

    public Event(String name) {
        this.name = name;
    }

    //Methods

    @Override
    public String toString() {
        return name;
    }


    //Getters && Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
