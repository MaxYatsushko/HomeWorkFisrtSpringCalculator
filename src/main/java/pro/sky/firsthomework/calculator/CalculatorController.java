package pro.sky.firsthomework.calculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

   /* @ExceptionHandler(DivisionByZeroException.clas)
    public ResponseEntity<?> handleDivisionByZero(DivisionByZeroException exception){
        return ResponseEntity.badRequest().body("Division 0");
    }*/

    @ExceptionHandler(DvisionByZeroException.class)
    public ResponseEntity<?> handleDivisionByZero(DvisionByZeroException exception){
        return ResponseEntity.badRequest().body("Division 0");
    }

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String Hello() {
        return "Welcone to calculator";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        int result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        int result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public ResponseEntity<String> divide(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        try {
            int result = calculatorService.divide(num1, num2);
            return ResponseEntity.ok(num1 + " + " + num2 + " = " + result);
        } catch (ArithmeticException exception){
            return ResponseEntity.badRequest().body("Division 0");
        }

    }

    @GetMapping("/divide2")
    public String divide2(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        int result = calculatorService.divide2(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
        int result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }
}

