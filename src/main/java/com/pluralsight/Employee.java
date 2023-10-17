package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;
    private double GrossPay;

    public Employee(){
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    public int getEmployeeID(){
        return this.employeeID;
    }
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
    public String getName (){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getHoursWorked(){
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return (payRate * hoursWorked);
    }

    public void setGrossPay(double grossPay) {
        GrossPay = grossPay;
    }
}
