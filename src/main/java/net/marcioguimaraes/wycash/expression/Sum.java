package net.marcioguimaraes.wycash.expression;

import net.marcioguimaraes.wycash.model.Money;

public class Sum implements Expression {

    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        return new Money(this.augend.amount + this.addend.amount, to);
    }

}
