public interface Bank {

   void getWelcomeMessage();
   float getBalance();
   String deposit(float amount);
   String withdraw(float amount);
   void getExitMessage();
}
