public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance () {
            return balance;
    }
    public void deposit (double amount) {
        balance = balance + amount;
    }
    public void withdraw (double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }  else System.out.println("Du har inte tillräckligt med pengar på kontot");
    }
}


