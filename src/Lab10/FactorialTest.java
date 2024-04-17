package src.Lab10;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Assert.assertEquals(Factorial.factorial(0), 1);
        Assert.assertEquals(Factorial.factorial(1), 1);
        Assert.assertEquals(Factorial.factorial(2), 2);
        Assert.assertEquals(Factorial.factorial(3), 6);
        Assert.assertEquals(Factorial.factorial(4), 24);
    }
}
