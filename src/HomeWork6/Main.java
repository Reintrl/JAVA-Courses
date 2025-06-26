package HomeWork6;

public class Main {
    public static void main(String[] args) {
        // Task 1 =================================================================
        CreditCard card1 = new CreditCard(1, 0);
        CreditCard card2 = new CreditCard(2, 1000);
        CreditCard card3 = new CreditCard(4, 2430000);

        card1.addMoney(100500);
        card2.addMoney(500);
        card3.withdrawMoney(2400000);

        card1.outputInfo();
        card2.outputInfo();
        card3.outputInfo();

        System.out.println("=====================");

        // Task* ==================================================================

        CashMachine machine1 = new CashMachine(5, 3, 2);

        System.out.println(machine1.withdrawMoney(230));

        System.out.println("=====================");

        System.out.println(machine1.withdrawMoney(200));

        System.out.println("=====================");

        System.out.println(machine1.withdrawMoney(40));
    }
}
