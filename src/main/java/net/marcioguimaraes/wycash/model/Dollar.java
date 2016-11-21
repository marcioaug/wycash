package net.marcioguimaraes.wycash.model;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass()) {
            Dollar dollar = (Dollar) obj;
            return (this.amount == dollar.amount);
        }

        return false;
    }
}
