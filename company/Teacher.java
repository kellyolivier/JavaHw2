package com.company;

public class Teacher extends Person implements Employee {

    public enum GradeLevel{
        ELEMENTARY, MIDDLE, HIGHSCHOOL, UNIVERSITY
    }
    public enum TeachingCertification{
        UNDERGRAD, MASTERS, DOCTORATE
    }

    private GradeLevel teachingLevel;
    private TeachingCertification certification;
    private int ID;

    public Teacher(GradeLevel newLevel,TeachingCertification newCertification, int newId, int age, String name, String phoneNumber, double money) throws Exception
    {
        super(age, name, phoneNumber, money);
        if(age <18)
        {
            throw new Exception("Non-adult employee not allowed");
        }

        teachingLevel = newLevel;
        certification = newCertification;
        ID = newId;
    }

    @Override
    public double getEmployeePay() {

        switch (certification) {
            case UNDERGRAD:
            {
                return 403.90;
            }
            case MASTERS:
            {
                return 790.29;
            }
            case DOCTORATE:
            {
                return 1050.35;
            }
        }
        return -1; //if things go terribly wrong
    }

    @Override
    public int getEmployeeId() {
        return ID;
    }

    public GradeLevel getTeachingLevel() {
        return teachingLevel;
    }
    public TeachingCertification getCertification()
    {
        return certification;
    }

    public void setCertification(TeachingCertification certification) {
        this.certification = certification;
    }
    public void setTeachingLevel(GradeLevel teachingLevel) {
        this.teachingLevel = teachingLevel;
    }
}
