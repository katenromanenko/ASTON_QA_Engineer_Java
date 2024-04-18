package src.test.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.Lab10.JUnitFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Тестовый метод для проверки работы функции factorial")
public class JUnitFactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(1, JUnitFactorial.factorial(0), "Факториал 0 должен быть 1");
        assertEquals(24, JUnitFactorial.factorial(4), "Факториал 4 должен быть 24");
        assertEquals(3628800, JUnitFactorial.factorial(10), "Факториал 10 должен быть 3628800");
    }
}
