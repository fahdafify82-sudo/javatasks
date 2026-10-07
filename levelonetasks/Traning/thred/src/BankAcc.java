public class BankAcc {
    private int balance;
    synchronized public void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Deposited "+amount);

notify();
    }
synchronized  public void withdraw(int amount)throws InterruptedException{
{
    while(amount>balance) {
        System.out.println("Not enough balance");

        wait();
    }

    balance-=amount;
    System.out.println("Withdrawn "+amount);
}}

}
