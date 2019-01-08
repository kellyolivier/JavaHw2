package com.company;
import java.util.ArrayList;

import java.util.ArrayList;

public class Building {
    private String name;
    private String address;
    protected ArrayList<Person> occupants;

    public Building(String newName, String newAddress)
    {
        name = newName;
        name = newAddress;
    }

    public int getOccupantsIndex(String personName)
    {
        for(int i = 0; i < occupants.size(); i++)
        {
            if(occupants.get(i).getName() == personName)
            {
                return i;
            }
        }
        return -1;
    }

    public void addOccupant(Person person)
    {
        occupants.add(person);
    }
    public void removeOccupant(int index)
    {
        occupants.remove(index);
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
