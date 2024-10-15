package oops;

public class AccessModifiers {

    public static void main(String[] args){

        BankAccount myAccount = new BankAccount();

        System.out.println(myAccount.name);

        myAccount.setPin(9999);
    }
    
}

class BankAccount {

    private int atmPin = 1234;
    public String name = "mandar";

    public void setPin(int newPin){
        atmPin = newPin;

    }

}
