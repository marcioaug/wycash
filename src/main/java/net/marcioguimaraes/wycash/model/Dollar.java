package net.marcioguimaraes.wycash.model;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public String currency() {
        return "USD";
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

}
