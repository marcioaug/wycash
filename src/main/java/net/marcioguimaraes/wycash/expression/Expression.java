package net.marcioguimaraes.wycash.expression;

import net.marcioguimaraes.wycash.model.Bank;
import net.marcioguimaraes.wycash.model.Money;

public interface Expression {

    Money reduce(Bank bank, String to);

}
