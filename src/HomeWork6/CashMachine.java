package HomeWork6;

public class CashMachine {
    int count20;
    int count50;
    int count100;

    CashMachine(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    boolean withdrawMoney(int amount) {
        int used100 = 0, used50 = 0, used20 = 0;

        int max100 = Math.min(amount / 100, count100);

        boolean found = false;
        for (int i = max100; i >= 0 && !found; i--) {
            int tempAmount = amount - i * 100;
            int max50 = Math.min(tempAmount / 50, count50);
            int remainingAfter50 = tempAmount - max50 * 50;

            if (remainingAfter50 % 20 == 0 && remainingAfter50 / 20 <= count20) {
                used100 = i;
                used50 = max50;
                used20 = remainingAfter50 / 20;
                found = true;
            } else {
                for (int j = max50; j >= 0 && !found; j--) {
                    int remaining = tempAmount - j * 50;
                    if (remaining % 20 == 0 && remaining / 20 <= count20) {
                        used100 = i;
                        used50 = j;
                        used20 = remaining / 20;
                        found = true;
                    }
                }
            }
        }

        if (found) {
            count100 -= used100;
            count50 -= used50;
            count20 -= used20;

            System.out.println("Выдано:");
            System.out.println("100: " + used100);
            System.out.println("50: " + used50);
            System.out.println("20: " + used20);
            return true;
        } else {
            System.out.println("Невозможно выдать указанную сумму имеющимися купюрами");
            return false;
        }
    }

    public void addMoney(int add20, int add50, int add100) {
        count20 += add20;
        count50 += add50;
        count100 += add100;
    }
}
