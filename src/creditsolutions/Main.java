package creditsolutions;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Client client1 = new Client();
        Card card1 = new Card();
        String name;
        int num;
        double d;

        System.out.print("enter your First name? ");
        name = input.nextLine();
        client1.setFirstName(name);

        System.out.print("enter your Last name? ");
        name = input.nextLine();
        client1.setLastName(name);

        System.out.print("Enter your ID number: ");
        num = input.nextInt();
        client1.setIdNumber(num);

        System.out.print("What is your age: ");
        num = input.nextInt();
        client1.setAge(num);

        System.out.println("Please Enter your creditsolutions.Card Details");
        System.out.print("creditsolutions.Card pin: ");
        num = input.nextInt();
        card1.setPin(num);

        System.out.print("What is your Balance: $");
        d = input.nextDouble();
        card1.setBalance(d);

        client1.setCard(card1);


        System.out.println("");
        //this will call the display method of the client class
        client1.display();
        //this will call the display method of the card class
        card1.display();



    }
}