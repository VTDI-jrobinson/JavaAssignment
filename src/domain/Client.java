package domain;

public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    public Client() {
    }

    public Client(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void display() {
        System.out.println( "Client: " + "\n" +
                "Id Number = " + idNumber + "\n" +
                "First Name = " + firstName + "\n" +
                "Last Name = " + lastName + "\n" +
                "Age = " + age + "\n" +
                "Card Number = " + card.getCardNumber() + "\n" +
                "Card Balance = " + card.getBalance() + "\n" +
                "Card PIN = " + card.getPin() + "\n" +
                "Card Status = " + card.isStatus());
    }
}
