package com.company;

public class Kid extends Person {
    private String favCandy;

    public Kid (String newFavCandy, int age, String name, String phoneNumber, double money) throws Exception
    {
        super(age, name, phoneNumber, money);
        if(age>18)
        {
            throw new Exception("Non-kid age entered for a kid");
        }
        favCandy = newFavCandy;
    }

    public String getFavCandy() {
        return favCandy;
    }

    public void setFavCandy(String favCandy) {
        this.favCandy = favCandy;
    }
}
