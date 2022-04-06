package com.company;

public class Employee {
    private String fullName;
    private int department;
    private int sallary;
    private int id;
    private static int counter;

    public Employee (String fullName, int department, int sallary){
        this.fullName = fullName;
        this.department = department;
        this.sallary = sallary;
        counter ++;
        this.id = getCounter();
    }

    public String getFullName() {
        return fullName;
    }

    public int getSallary() {
        return sallary;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public static int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }
    @Override
    public String toString(){
        return fullName + sallary + department + id;
    }

}
