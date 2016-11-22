package net.marcioguimaraes.wycash.model;

public abstract class Money {

    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
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
