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
}
