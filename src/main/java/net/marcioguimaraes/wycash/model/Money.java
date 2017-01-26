package net.marcioguimaraes.wycash.model;

import net.marcioguimaraes.wycash.expression.Expression;
import net.marcioguimaraes.wycash.expression.Sum;

public class Money implements Expression {

    public int amount;
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

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {

        int rate = bank.rate(currency, to);

        return new Money(amount / rate, to);
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
