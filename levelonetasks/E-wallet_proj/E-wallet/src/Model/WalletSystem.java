package Model;

import java.util.ArrayList;
import java.util.List;

public class WalletSystem {
    public final static String name="ERAASOFT-WALLET";
    private List<Account> accounts=new ArrayList();
public String getNAme(){
    return name;
}
public void addAccount(Account account){
    accounts.add(account);
}
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
