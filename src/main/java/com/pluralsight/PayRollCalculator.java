package com.pluralsight;
import java.io.*;
import java.util.Arrays;

public class PayRollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            while ((input = bufReader.readLine()) != null) {

                String[] line = input.split("\\|");
                String id = line[0];
                String name = line[1];
                String hoursWorked = line[2];
                String payRate = line[3];

                Employee employee = new Employee();
                String[] thing = new String[0];
                double varName = Double.parseDouble(thing[0]);
                System.out.printf("Employee Id: %d, Name: %s, GrossPay: $%.2f%n", employee.getEmployeeID(), employee.getName(), employee.getGrossPay());
            }






                }
        catch (IOException e) {
            e.printStackTrace();
        }
            }
    }
