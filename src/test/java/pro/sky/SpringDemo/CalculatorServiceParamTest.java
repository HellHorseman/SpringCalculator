package pro.sky.SpringDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.SpringDemo.Service.CalculatorService;
import pro.sky.SpringDemo.Service.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceParamTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("argsForSum")
    public void correctSum(int num1, int num2, int expected) {
        String sum = calculatorService.sum(num1, num2);
        Assertions.assertEquals(expected, sum);
    }

    private static Stream<Arguments> argsForSum() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(3, 3, 6),
                Arguments.of(2, 7, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("argsForDiff")
    public void correctDiff(int num1, int num2, int expected) {
        String diff = calculatorService.diff(num1, num2);
        Assertions.assertEquals(expected, diff);
    }

    private static Stream<Arguments> argsForDiff() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(3, 4, -1),
                Arguments.of(-2, -7, -9)
        );
    }

    @ParameterizedTest
    @MethodSource("argsForMult")
    public void correctMult(int num1, int num2, int expected) {
        String mult = calculatorService.mult(num1, num2);
        Assertions.assertEquals(expected, mult);
    }

    private static Stream<Arguments> argsForMult() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(3, 3, 9),
                Arguments.of(2, 7, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("argsForDiv")
    public void correctDiv(int num1, int num2, int expected) {
        String div = calculatorService.div(num1, num2);
        Assertions.assertEquals(expected, div);
    }

    private static Stream<Arguments> argsForDiv() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(8, 2, 4),
                Arguments.of(24, 6, 4)
        );
    }
}
