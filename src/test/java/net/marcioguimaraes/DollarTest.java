package net.marcioguimaraes;

import net.marcioguimaraes.wycash.model.Dollar;
import org.junit.*;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }

}
