package pro.sky.firsthomework.calculator;

public class DvisionByZeroException extends CalculatorException{

    public DvisionByZeroException() {
        super("Division by 0", 400);
    }
}
