package pro.sky.SpringDemo;

 public class CalculatorService {
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
        int divide = num1 / num2;
        return num1 + " / " + num2 + " = " + divide;
    }
}
