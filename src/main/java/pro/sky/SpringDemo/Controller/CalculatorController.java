package pro.sky.SpringDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.SpringDemo.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }
    @GetMapping(path = "/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.sum(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String diff(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.diff(num1, num2);
    }
    @GetMapping(path = "/multiple")
    public String mult(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.mult(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String div(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.div(num1, num2);
    }
}
