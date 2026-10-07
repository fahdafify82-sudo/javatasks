public class Depositer implements Runnable {
    private BankAcc account;
    public Depositer(BankAcc account) {
        this.account = account;
    }
    @Override
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            account.deposit(100);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }






}
