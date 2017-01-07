package net.marcioguimaraes.wycash.model;

import net.marcioguimaraes.wycash.expression.Expression;
import net.marcioguimaraes.wycash.expression.Sum;
import org.junit.Assert;
import org.junit.Test;

public class BankTest {

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        Assert.assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        Assert.assertEquals(Money.dollar(1), result);
    }
}
