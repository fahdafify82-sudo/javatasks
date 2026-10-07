//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    BankAcc account = new BankAcc();
    Thread withdowm=new Thread(new Withdrown(account));

    Thread depsit=new Thread(new Depositer(account));
    withdowm.start();
    depsit.start();
    try {
        withdowm.join();
        depsit.join();
    }
    catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("finish");

}
