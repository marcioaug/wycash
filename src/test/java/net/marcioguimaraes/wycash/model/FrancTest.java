package net.marcioguimaraes.wycash.model;

import org.junit.Assert;
import org.junit.Test;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Franc five = new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(15), five.times(3));
    }

}
