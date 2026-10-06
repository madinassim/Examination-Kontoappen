
import java.util.Scanner;

void main() {
    AccountRegister register = new AccountRegister();
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    while (running) {
        System.out.println("1. Skapa konto");
        System.out.println("2. Lista konto");
        System.out.println("3. Sätt in pengar");
        System.out.println("4. Ta ut pengar");
        System.out.println("5. Avsluta");

        System.out.println("Välj ett alternativ: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ange ägarens namn: ");
                String owner = scanner.next();
                System.out.println("Ange startsaldo: ");
                double balance  = scanner.nextDouble();
                register.createAccount(owner, balance);
                break;
        }

    }
}