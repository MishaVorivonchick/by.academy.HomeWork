package by.academy.homework.task1;

public class CalculatorWithOperator {public Double plus(Double a, Double b) {
    return a + b;
}

    public Double minus(Double a, Double b) {
        return a - b;
    }

    public Double multiply(Double a, Double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public Double exponent(double a, double b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public double module(double a) {
        double module;
        if (a > 0) {
            module = a;
            return module;
        }
        if (a < 0) {
            module = a * -1;
            return module;
        }else return 0;
    }

}

