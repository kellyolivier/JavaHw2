package com.company;

public class Police extends Person implements Employee {

    public enum Role{
        PATROL, SARGENT, CAPTAIN, CHIEF
    }
    private Role policeRole;
    private int ID;

    public Police (Role newRole, int newId, int age, String name, String phoneNumber, double money) throws Exception
    {
        super(age, name, phoneNumber,money);
        if(age <18)
        {
            throw new Exception("Non-adult employee not allowed");
        }

        policeRole = newRole;
        ID = newId;
    }

    @Override
    public double getEmployeePay() {

        switch (policeRole) {
            case CHIEF:
            {
                return 1500.30;
            }
            case PATROL:
            {
                return 1200.99;
            }
            case CAPTAIN:
            {
                return 1444.35;
            }
            case SARGENT:
            {
                return 1300.34;
            }
        }
        return -1; //if things go terribly wrong
    }

    @Override
    public int getEmployeeId() {
        return ID;
    }

    public Role getPoliceRole()
    {
        return policeRole;
    }

    public void setPoliceRole(Role policeRole) {
        this.policeRole = policeRole;
    }
}
