package com.company;

import java.util.ArrayList;

public class City {
    private ArrayList<Person> citizens;
    private ArrayList<Building> buildings;
    private ArrayList<School> schools;

    public City(String schoolName, String schoolAddress, String cityHallAddress)
    {
        CityHall cityHall = new CityHall("City Hall", cityHallAddress);
        School firstSchool = new School(schoolName, schoolAddress);

        buildings.add(cityHall);
        buildings.add(firstSchool);
        schools.add(firstSchool);
    }

    public void addSchool(String schoolName, String schoolAddress)
    {
        School newSchool = new School(schoolName, schoolAddress);
        buildings.add(newSchool);
        schools.add(newSchool);
    }
    public void addBuilding(String buildingName, String buildingAddress)
    {
        Building newBuilding = new Building(buildingName, buildingAddress);
        buildings.add(newBuilding);
    }

    public void addPolice()
    {

    }
    public void addTeacher()
    {

    }
    public void addKid()
    {

    }
    public void addPerson()
    {

    }


    public void getCitizenNames(){
        System.out.printf("Here is the list of %d citizens:", citizens.size());
        for(int i = 0; i < citizens.size(); i++)
        {
            System.out.println(citizens.get(i).getName());
        }
    }

    public void getBuildingNames(){
        System.out.printf("Here is the list of %d buildings:", buildings.size());
        for(int i = 0; i < buildings.size(); i++)
        {
            System.out.println(buildings.get(i).getName());
        }
    }

    public void payAllEmployees()
    {
        for(int i = 0; i < citizens.size(); i++)
        {
            double pay = 0;
            //get person object
            Person person = citizens.get(i);
            //if employed, get pay
            if(person instanceof Police || person instanceof Teacher)
            {
                pay = ((Employee) person).getEmployeePay();
            }

            //add pay to person's total money
            person.addPay(pay);
        }
    }

    public void payEmployee(Person person) throws Exception
    {
        if(!(person instanceof Police) || !(person instanceof Teacher))
        {
            throw new Exception("cannot give pay to unemployed person");
        }
        double pay = ((Employee) person).getEmployeePay();
        person.addPay(pay);
    }

    public void


    //todo add city, school etc
    //todo move people in and out

}
