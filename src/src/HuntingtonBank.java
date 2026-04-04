import java.sql.SQLOutput;

public class HuntingtonBank implements Bank {

   private float balance = 1000.00f;

    @Override
    public void getWelcomeMessage() {
        System.out.println("Welcome to Huntington Bank:");
    }

    @Override
    public float getBalance() {
        return balance;
    }

    @Override
    public String deposit(float amount) {
        balance = balance + amount;
        return "Your balance is:" +balance ;
    }

    @Override
    public String withdraw(float amount) {
        balance = balance - amount;
        return "Your balance is:" +balance;
    }

    @Override
    public void getExitMessage() {

        System.out.println("Thank you for banking in Huntington");

    }
}
