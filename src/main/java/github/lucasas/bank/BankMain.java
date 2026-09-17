package github.lucasas.bank;

public class BankMain {
    private double balance = 0;
    private String accountName = "";

    void main() {
        accountName = "Lucas";
        deposit(200);
        withdraw(50);
        printBalance();

    }

    private void deposit(double amount) {
        balance += amount;
        System.out.println("Tilføjede " + amount + " kr. til " + accountName);
    }

    private void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Du har ikke nok penge på din konto");
            return;
        }
        balance -= amount;
        System.out.println("Fjernede " + amount + " kr. fra " + accountName);
    }

    private void printBalance() {
        System.out.println("Du har " + balance + " kr. i din konto!");
    }
}
