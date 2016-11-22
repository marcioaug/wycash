package net.marcioguimaraes.wycash.model;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public String currency() {
        return "CHF";
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

}
