public class ChaseLoan implements Loan {
    @Override
    public void welcomeMessage() {

        System.out.println("Welcome to Chase Loan Application: ");

    }

    @Override
    public String loaneligibitly(String name, int creditscore, double loanamount) {
        double result = 0;

        if (creditscore > 750) {
            result = 10000;
        } else if (creditscore >= 700) {

            result = 8000;

        } else if (creditscore >= 650) {

            result = 5000;

        } else if (creditscore >= 600) {

            result = 2000;

        }
        if (result > 0) {

            return "Congratulations" + name + ",your loan is aproved:" + result;

        } else {

            return "Sorry " + name + ", your loan is declined: " + result;
        }
    }


        @Override
        public void exitMessage() {

            System.out.println("Thank you for banking with Chase");

        }
    }

