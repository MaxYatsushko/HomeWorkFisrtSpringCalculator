package pro.sky.firsthomework.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public CalculatorService() {
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        /*if(num2 == 0){
            throw new DivideByZeroException();
        }*/
        //if(num2 == 0){
        //    throw new ArithmeticException();
        //}
        return num1 / num2;
    }

    public int divide2(int num1, int num2) {
        if(num2 == 0){
            throw new DvisionByZeroException();
        }
        //if(num2 == 0){
        //    throw new ArithmeticException();
        //}
        return num1 / num2;
    }
}
