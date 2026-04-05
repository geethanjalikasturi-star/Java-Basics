public class LoanMain {

    public static void main(String[] args) {
            Loan l1 = new ChaseLoan();

            l1.welcomeMessage();
            System.out.println(l1.loaneligibitly("Geetha", 750, 8000));
            l1.exitMessage();


          //  ------------------------------------------------------------------- //

        Loan l2 = new PncLoan();

        l2.welcomeMessage();
        System.out.println(l2.loaneligibitly("Annie", 500, 10000 ));
        l2.exitMessage();

    }
}
