package com.payroll;

public class SalesRep extends StaffManager{

    private double allowance;

    public SalesRep(String firstName, String lastName, String debtNumber, double hoursWorked, double allowance) {
        super(firstName, lastName, debtNumber, hoursWorked);
        this.allowance = allowance;
    }

    public double getAllowance()
    {
        return allowance;
    }

    public void setAllowance(double allowance)
    {
        this.allowance = allowance;
    }

    @Override
    public void display()
    {
        System.out.println("Sales Rep:\n" +
                "firstName = " + getFirstName() + "\n" +
                "lastName = " + getLastName() + "\n" +
                "debtNumber = " + getDebtNumber() + "\n" +
                "hoursWorked = " + getHoursWorked() + "\n" +
                "allowance = " + allowance + "\n" +
                "=========================================\n\n");
    }

    @Override
    public double calculateSalary()
    {
        return (getHoursWorked() * 1500) + allowance;
    }
}
