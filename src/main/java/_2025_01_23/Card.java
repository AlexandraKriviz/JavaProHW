package _2025_01_23;

public abstract class Card {
    private String userName;

    protected double balance;

    private int pinCode;

    public Card(String userName, double balance, int pinCode) {
        this.userName = userName;
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public Card(String userName, int pinCode) {

        this.userName = userName;
        this.pinCode = pinCode;
    }

    public void addMoney(double amount, int enteredPinCode) {
        checkPinCode(enteredPinCode);
            if (amount > 0) {
                balance += amount;
                System.out.println("Баланс пополнен на " + amount +
                        ". Новый баланс: " + balance);
            } else {
                System.out.println("Сумма для пополнения баланса " +
                        "должна быть положительной.");
            }
    }

    public abstract void widthrow(double amount, int enteredPinCode);

    public void displayBalance(int enteredPinCode) {
        checkPinCode(enteredPinCode);

        System.out.println("Баланс пользователя " + userName +
                ": " + balance);
    }

    public void displayBalanceInCurrency(double exhangeRate, String currency, int
                                          enteredPinCode) {
        checkPinCode(enteredPinCode);
        if (exhangeRate > 0) {
            double convertedBalance = balance * exhangeRate;
            System.out.println("Баланс в " + currency + ": " + convertedBalance);
        } else {
            System.out.println("Некорректный курс валют");
        }
    }

    protected void checkPinCode(int enteredPinCode) {
        if (pinCode != enteredPinCode) {
            throw new IllegalArgumentException("Pin Code is incorrect.");
        }
    }
}
