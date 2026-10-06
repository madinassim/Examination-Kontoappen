//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Account account1 = new Account("Ada", 1000);
    Account account2 = new Account("Adib", 1000);
    System.out.println(account1.getOwner());
    System.out.println(account2.getBalance());

    account1.deposit(500);
    System.out.println(account1.getBalance());

    account1.withdraw(300);
    System.out.println(account1.getBalance());
