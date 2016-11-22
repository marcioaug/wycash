package net.marcioguimaraes.wycash.model;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }

}
