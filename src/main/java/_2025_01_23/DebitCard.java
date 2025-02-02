package _2025_01_23;

public class DebitCard extends Card{

    public DebitCard(String userName, double balance, int pinCode) {
        super(userName, balance, pinCode);
    }

    public DebitCard(String userName, int pinCode) {
        super(userName, pinCode);
    }

    @Override
    public void widthrow(double amount, int enteredPinCode) {
        checkPinCode(enteredPinCode);
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount +
                    ". Остаток: " + balance);
        } else {
            System.out.println("Недостаточно средств или некорректная сумма.");
        }
    }
}
