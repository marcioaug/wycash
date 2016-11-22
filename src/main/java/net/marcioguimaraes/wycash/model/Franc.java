package net.marcioguimaraes.wycash.model;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public Money times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }

}