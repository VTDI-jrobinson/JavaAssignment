package com.payroll;

public class Manager extends StaffManager{

    private double bonus;

    public Manager(String firstName, String lastName, String debtNumber, double hoursWorked, double bonus)
    {
        super(firstName, lastName, debtNumber, hoursWorked);
        this.bonus = bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public void display()
    {
        System.out.println("Manager:\n" +
                "firstName =" + getFirstName() + "\n" +
                "lastName = " + getLastName() + "\n" +
                "debtNumber = " + getDebtNumber() + "\n" +
                "hoursWorked = " + getHoursWorked() + "\n" +
                "bonus = " + bonus + "\n" +
                "=========================================\n\n");
    }

    @Override
    public double calculateSalary()
    {
        return (getHoursWorked() * 2500) + bonus;
    }

}
