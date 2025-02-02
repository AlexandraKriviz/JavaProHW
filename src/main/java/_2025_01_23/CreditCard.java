package _2025_01_23;

public class CreditCard extends Card{

    public CreditCard(String userName, double balance, int pinCode) {
        super(userName, balance, pinCode);
    }

    public CreditCard(String userName, int pinCode) {
        super(userName, pinCode);
    }

    @Override
    public void widthrow(double amount, int enteredPinCode) {
        checkPinCode(enteredPinCode);
        if (amount > 0) {
            balance -= amount;
            System.out.println("Снято: " + amount +
                    ". Остаток: " + balance);
        } else {
            System.out.println("Некорректная сумма.");
        }
    }


}
