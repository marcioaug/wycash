package net.marcioguimaraes.wycash.model;

public abstract class Money {

    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public String currency() {
        return this.currency;
    }

    abstract public Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        if (this.getClass().equals(obj.getClass())) {
            Money money = (Money) obj;
            return (this.amount == money.amount);
        }

        return false;
    }

}
