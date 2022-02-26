package domain;

/*Jamoi Robinson ID # 201700087
 *Ramoy Roberts ID # 201700871
 *Maxine Smith ID # 1300120136
 *Jonathan Beckford ID #2017002548
 *Orlando Brown ID # #2011025363
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Card card = new Card();

        //Create an object of type Client called Obj1
        Client Obj1 = new Client();

        //Prompt the user and accept all information for Obj1 (Client & Card info)
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        int idNumber;
        int age;
        double balance;
        int pin;

        System.out.println("Enter first name");
        firstName = scanner.nextLine();
        System.out.println("Enter last name");
        lastName = scanner.nextLine();
        System.out.println("Enter id number");
        idNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter age");
        age = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter card balance");
        balance = Double.valueOf(scanner.nextLine());
        System.out.println("Enter pin");
        pin = Integer.valueOf(scanner.nextLine());

        //Using setters to assign collected values for card and client objects
        card.setStatus(true);
        card.setCardNumber(45678);
        card.setBalance(balance);
        card.setPin(pin);

        Obj1.setFirstName(firstName);
        Obj1.setLastName(lastName);
        Obj1.setIdNumber(idNumber);
        Obj1.setAge(age);

        //Set the card value in client object
        Obj1.setCard(card);

        //Display all the contents of the Client object
        Obj1.display();
        System.out.println("==============================================");
        //Display only the card information for Obj1
        Obj1.getCard().display();
    }
}
