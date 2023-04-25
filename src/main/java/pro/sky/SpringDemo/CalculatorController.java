package pro.sky.SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
//    private final CalculatorService calculatorService;
//
//    public CalculatorController(CalculatorService calculatorService) {
//        this.calculatorService = calculatorService;
//    }

    @GetMapping(path = "/calculator")
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2  + " = " + sum;
    }
    @GetMapping(path = "/calculator/minus")
    public String diff(@RequestParam int num1, @RequestParam int num2) {
        int difference = num1 - num2;
        return num1 + " - " + num2  + " = " + difference;
    }
    @GetMapping(path = "/calculator/multiple")
    public String mult(@RequestParam int num1, @RequestParam int num2) {
        int multiple = num1 * num2;
        return num1 + " * " + num2  + " = " + multiple;
    }
    @GetMapping(path = "/calculator/divide")
    public String div(@RequestParam int num1, @RequestParam int num2) {
        int divide = num1 / num2;
        return num1 + " / " + num2  + " = " + divide;
    }
}
