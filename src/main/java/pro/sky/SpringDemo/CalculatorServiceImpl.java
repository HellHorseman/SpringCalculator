package pro.sky.SpringDemo;

import org.springframework.stereotype.Service;

@Service
 public class CalculatorServiceImpl implements CalculatorService {
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public String sum(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String diff(int num1, int num2) {
        int difference = num1 - num2;
        return num1 + " - " + num2 + " = " + difference;
    }

    public String mult(int num1, int num2) {
        int multiple = num1 * num2;
        return num1 + " * " + num2 + " = " + multiple;
    }

    public String div(int num1, int num2) {
        if (num2 == 0) {
            error();
            throw new RuntimeException("На ноль делить нельзя!");
        }
        int divide = num1 / num2;
        return num1 + " / " + num2 + " = " + divide;
    }
    public String error() {
        return "На ноль делить нельзя!";
    }
}
