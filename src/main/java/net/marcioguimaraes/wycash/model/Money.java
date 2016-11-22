package net.marcioguimaraes.wycash.model;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public String currency() {
        return this.currency;
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return (this.amount == money.amount
                && money.currency.equals(this.currency));
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

}
