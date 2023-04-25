package pro.sky.SpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private CalculatorService calculatorService = new CalculatorService();
//
//    public CalculatorController(CalculatorService calculatorService) {
//        this.calculatorService = calculatorService;
//    }

    @GetMapping(path = "/calculator")
    public String greetings() {
        return calculatorService.greetings();
    }
    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.sum(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String diff(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.diff(num1, num2);
    }
    @GetMapping(path = "/calculator/multiple")
    public String mult(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.mult(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String div(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.div(num1, num2);
    }
}
