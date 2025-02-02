package _2025_01_23;

public class Main {
    public static void main(String[] args) {
        Card card1 = new CreditCard("John", 5000, 4325);
        Card card2 = new DebitCard("Anna", 9875);
        Atm atm = new Atm();

      /*  card1.addMoney(2000);
        card1.displayBalance();
        card1.widthrow(1000);

        card2.addMoney(500);
        card2.displayBalance();
        card2.displayBalanceInCurrency(0.57, "EUR");*/

        atm.enterCard(card1, 4325);
        atm.displayAccount();

    }
}
