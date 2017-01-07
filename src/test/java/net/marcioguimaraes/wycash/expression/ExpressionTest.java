package net.marcioguimaraes.wycash.expression;

import net.marcioguimaraes.wycash.model.Money;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionTest {

    @Test
    public void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        Assert.assertEquals(five, sum.augend);
        Assert.assertEquals(five, sum.addend);
    }
}
