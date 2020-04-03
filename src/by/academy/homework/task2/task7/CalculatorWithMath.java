package by.academy.homework.task2.task7;

public class CalculatorWithMath implements ICalculator {public Double plus(Double a, Double b) {
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
        double result= Math.pow(a,b);
        return result;
    }

    public double module(double a) {
        double module= Math.abs(a);
        return module;
    }


    public double root(double a) {

        double result = Math.sqrt(a);
        return result;
    }

}