package org.launchcode.codingevents.models;

public class Event {

    //Variables

    private String name;
    private String description;

    //Constructors

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
