package com.payroll;

/*Jamoi Robinson ID # 201700087
 *Ramoy Roberts ID # 201700871
 *Maxine Smith ID # 1300120136
 *Jonathan Beckford ID #2017002548
 */

import java.util.ArrayList;
import java.util.List;

// Create a file called Payroll for testing the functionality of your application.
public class Payroll {

    public static void main(String[] args) {
        // Within Payroll create an object of the base or super class
        // called StaffMember using the primary constructor,
        // then call the object’s display() method.

//        StaffManager staffManager = new StaffManager(
//                "Jamoi",
//                "Robinson",
//                "D100",
//                40);
//        staffManager.display();

        // Create a list of 5 Sales Rep using an ArrayList
        List<SalesRep> salesReps = new ArrayList<>();
        salesReps.add(new SalesRep(
                "Ana",
                "Blaire",
                "D201",
                50,
                500.21));
        salesReps.add(new SalesRep(
                "Nicole",
                "Farquharson",
                "D250",
                40,
                600.11));
        salesReps.add(new SalesRep(
                "Nicleo",
                "Kerr",
                "D676",
                25,
                250.67));
        salesReps.add(new SalesRep(
                "Jheidi",
                "Gayle",
                "D787",
                50,
                509.29));
        salesReps.add(new SalesRep(
                "Steven",
                "Harding",
                "D676",
                50,
                491.31));

        // Loop/iterate through the ArrayList to display the contents
        // of the list created above.
        for(int x = 0; x < salesReps.size(); x++)
        {
            salesReps.get(x).display();
        }

        // Within the Payroll file demonstrate polymorphism
        // by displaying the additional attributes within the sub-classes
        // Manager & Sales Rep by overriding the display() methods in each.
        StaffManager manager = new Manager(
                "Dane",
                "Jackson",
                "D100",
                40,
                1901.21);
        manager.display();

        StaffManager salesRep = new SalesRep(
                "Gelly",
                "Beans",
                "D878",
                50,
                1092.99
        );
        salesRep.display();

        // In the Payroll file you’ve create, display the salaries for both a Manager and Sales Rep.
        System.out.println("Manager salary: " + manager.calculateSalary());
        System.out.println("Sales Rep salary: " + salesRep.calculateSalary());
    }

}
