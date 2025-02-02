package _2025_01_23;

public class Atm {

    private Card card;

    private int enteredPinCode;

    public Atm() {
    }

    public Card getCard() {
        return card;
    }

    public void enterCard(Card card, int enteredPinCode) {
        this.card = card;
        this.enteredPinCode = enteredPinCode;
    }

    public void plusMoney(double amount) {
        card.addMoney(amount, enteredPinCode);
    }

    public void minusMoney(double amount) {
        card.widthrow(amount, enteredPinCode);
    }

    public void displayAccount() {
       card.displayBalance(enteredPinCode);
    }
}
