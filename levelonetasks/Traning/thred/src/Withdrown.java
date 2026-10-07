public class Withdrown implements Runnable {
    private BankAcc account;
    public Withdrown(BankAcc account) {
        this.account = account;
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
           ;
            try {
                account.withdraw(100) ;
                Thread.sleep(1500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

}
