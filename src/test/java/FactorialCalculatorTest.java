package src.test.java;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import src.Lab10.FactorialCalculator;

public class FactorialCalculatorTest {
    private FactorialCalculator calculator;

    @BeforeSuite
    public void setup() {
        calculator = new FactorialCalculator();
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(calculator.factorial(5), 120);
        Assert.assertEquals(calculator.factorial(0), 1);
    }

    @AfterSuite
    public void teardown() {
        calculator = null;
    }
}
