package net.marcioguimaraes.wycash.model;

public class Money {

    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public String currency() {
        return this.currency;
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {
            Money money = (Money) obj;
            return (this.amount == money.amount
                    && money.currency.equals(this.currency));

        }

        return false;
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

}
