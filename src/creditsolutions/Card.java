package creditsolutions;

public class Card {
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;

    //default constructor
    public Card(){    }
    public Card(int cardNumber,double balance,int pin, boolean status){

    }
    public void setCardNumber(int cardNumber)
    {
        cardNumber = 1122446688;
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setPin(int pin)
    {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setStatus(boolean status)
    {
        status = true;
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
    public void display(){
        setStatus(this.status);
        setCardNumber(this.cardNumber);
        System.out.println("Balance: $"+ getBalance());
        System.out.println("creditsolutions.Card Number: "+ getCardNumber());
        System.out.println("Pin#: "+ getPin());
        System.out.print("creditsolutions.Card Status: ");
        System.out.println(getStatus()? "creditsolutions.Card is Activated": "creditsolutions.Card is not yet activated");
    }
}
