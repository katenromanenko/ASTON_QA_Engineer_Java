package src.test.java;

import org.testng.Assert;
import org.testng.annotations.Test;
import src.Lab10.NGFactorial;

public class NGFactorialTest {
    @Test
    public void testFactorial() {
        Assert.assertEquals(NGFactorial.factorial(0), 1);
        Assert.assertEquals(NGFactorial.factorial(1), 1);
        Assert.assertEquals(NGFactorial.factorial(2), 2);
        Assert.assertEquals(NGFactorial.factorial(3), 6);
        Assert.assertEquals(NGFactorial.factorial(4), 24);
    }
}
