package pro.sky.SpringDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.SpringDemo.Service.CalculatorService;
import pro.sky.SpringDemo.Service.CalculatorServiceImpl;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void sum5and5() {
        String sum = calculatorService.sum(5, 5);
        Assertions.assertEquals(10, sum);
    }

    @Test
    public void diff5and5() {
        String diff = calculatorService.diff(5, 5);
        Assertions.assertEquals(0, diff);
    }

    @Test
    public void mult5and5() {
        String mult = calculatorService.mult(5, 5);
        Assertions.assertEquals(25, mult);
    }

    @Test
    public void div5and5() {
        String div = calculatorService.div(5, 5);
        Assertions.assertEquals(1, div);
    }

    @Test
    public void IllegalArgumentException() {
        Assertions.assertThrows(IllegalAccessException.class, () -> calculatorService.div(5, 0));
    }
}
