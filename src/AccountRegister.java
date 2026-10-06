
import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    private List <Account> accounts = new ArrayList<>();

    public void createAccount(String owner, double balance) {
        Account account = new Account(owner, balance);
        accounts.add(account);
    }
    public void showAccounts() {
        for (Account account : accounts) {
            System.out.println(account.getOwner() + " - " + account.getBalance());
        }
    }
    public Account findAccount(String owner) {
        for (Account account : accounts) {
            if (account.getOwner().equals(owner)) {
                return account;
            }
        }
        return null;
    }
}
