package ie.atu.sem2.week3.sem2week3.controller;

import ie.atu.sem2.week3.sem2week3.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
        public ResponseEntity<Integer> add(@RequestParam int a, @RequestParam int b) {
        int sum = calculatorService.add(a, b);
            return ResponseEntity.ok(sum);
    }

    @GetMapping("/subtract")
    public ResponseEntity<Integer> subtract(@RequestParam int a, @RequestParam int b) {
        int sum = calculatorService.subtract(a, b);
        return ResponseEntity.ok(sum);
    }

    @GetMapping("/multiply")
    public ResponseEntity<Integer> multiply(@RequestParam int a, @RequestParam int b) {
        int sum = calculatorService.multiply(a, b);
        return ResponseEntity.ok(sum);
    }

    @GetMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) {
            return ResponseEntity.badRequest().body("Division By Zero Error");
        }
        int sum = calculatorService.divide(a, b);
        return ResponseEntity.ok(sum);
    }
}
