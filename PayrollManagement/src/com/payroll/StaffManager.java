package com.payroll;

public abstract class StaffManager {
    private String firstName;
    private String lastName;
    private String debtNumber;
    private double hoursWorked;

    public StaffManager(String firstName, String lastName, String debtNumber, double hoursWorked)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.debtNumber = debtNumber;
        this.hoursWorked = hoursWorked;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getDebtNumber()
    {
        return debtNumber;
    }

    public void setDebtNumber(String debtNumber)
    {
        this.debtNumber = debtNumber;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public void display()
    {
        System.out.println("StaffManager:\n" +
                "firstName = " + firstName + "\n" +
                "lastName = " + lastName + "\n" +
                "debtNumber = " + debtNumber + "\n" +
                "hoursWorked = " + hoursWorked + "\n" +
                "=========================================\n\n");
    }

    // Create an abstract method that returns a double called calculateSalary()
    // in the base class. This method should calculate and display the salary
    // for each staff member
    public abstract double calculateSalary();
}
