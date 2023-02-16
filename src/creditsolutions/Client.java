package creditsolutions;

import java.util.Scanner;
public class Client extends Card {
    private int idNumber;
    private String firstName;
    private String lastName;;
    private int age;
    private Card card;

    Scanner in = new Scanner(System.in);

    public Client(){ }
    public Client(int idNumber, String firstName, String lastName)
    {

    }
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
    int getIdNumber()
    {
        return this.idNumber;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
    public void display(){
        System.out.println("ID#: "+ getIdNumber());
        System.out.println("Name: "+getFirstName() +" "+getLastName());
        System.out.println("Age: "+getAge());
    }
}
