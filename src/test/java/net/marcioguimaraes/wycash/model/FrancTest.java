package net.marcioguimaraes.wycash.model;

import org.junit.Assert;
import org.junit.Test;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Money five = Money.franc(5);
        Assert.assertEquals(Money.franc(10), five.times(2));
        Assert.assertEquals(Money.franc(15), five.times(3));
    }

}
