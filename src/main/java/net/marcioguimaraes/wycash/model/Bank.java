package net.marcioguimaraes.wycash.model;

import net.marcioguimaraes.wycash.expression.Expression;

public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }

}
