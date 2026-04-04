public class BankDetails {

    public static void main(String[] args) {

        ChaseBank bank1 = new ChaseBank();

        bank1.getWelcomeMessage();

        float amount = bank1.getBalance();
        System.out.println(bank1.getBalance());
        System.out.println(amount);
        System.out.println("balance after amazon purchaase: " + (amount - 100));

        System.out.println(bank1.deposit(500.f));
        String bal = bank1.deposit(1000);
        System.out.println(bal);

        String withd = bank1.withdraw(200);
        System.out.println(withd);

        bank1.getExitMessage();


        HuntingtonBank bank2 = new HuntingtonBank();

        bank2.getWelcomeMessage();

        float balan = bank2.getBalance();
        System.out.println(balan);

        String depo = bank2.deposit(500);
        System.out.println(depo);

        String withdraw = bank2.withdraw(300);
        System.out.println(withdraw);

        bank2.getExitMessage();



    }
}
