package pro.sky.firsthomework.calculator;

public class CalculatorException extends RuntimeException{
    private final int errorCode;

    public CalculatorException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
