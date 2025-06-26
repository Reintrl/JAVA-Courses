package HomeWork6;

public class CreditCard {
    int accountNumber;
    long currentAccountBalance;

    CreditCard(int accountNumber, long currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }

    void addMoney(long sumToAdd) {
        currentAccountBalance += sumToAdd;
    }

    void withdrawMoney(long sumToRemove) {
        if (currentAccountBalance < sumToRemove) {
            currentAccountBalance = 0;
            System.out.println("Снято " + currentAccountBalance);
        } else {
            currentAccountBalance -= sumToRemove;
            System.out.println("Снято " + sumToRemove);
        }
    }

    void outputInfo() {
        System.out.println("Номер счёта: " + accountNumber + "\nСумма на счету: " + currentAccountBalance);
    }
}
