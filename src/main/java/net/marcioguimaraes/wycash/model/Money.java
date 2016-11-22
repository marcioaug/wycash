package net.marcioguimaraes.wycash.model;

public abstract class Money {

    protected int amount;

    @Override
    public boolean equals(Object obj) {
        if (this.getClass().equals(obj.getClass())) {
            Money money = (Money) obj;
            return (this.amount == money.amount);
        }

        return false;
    }

}
