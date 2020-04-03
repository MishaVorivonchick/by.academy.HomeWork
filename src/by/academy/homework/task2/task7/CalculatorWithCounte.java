package by.academy.homework.task2.task7;

public class CalculatorWithCounte implements ICalculator {
    private ICalculator sum;

    public CalculatorWithCounte(ICalculator sum) {
        this.sum = sum;
    }

    private int count = 0;

    public int getCountOperation() {
        return count;
    }


    @Override
    public Double plus(Double a, Double b) {
        count++;
        return sum.plus( a,b);
    }

    @Override
    public Double minus(Double a, Double b) {
        count++;
        return sum.minus(a,b);
    }

    @Override
    public Double multiply(Double a, Double b) {
        count++;
        final Double multiply = sum.multiply(a, b);
        return multiply;
    }

    @Override
    public double division(double a, double b) {
        count++;
        return sum.division(a,b);
    }

    @Override
    public Double exponent(double a, double b) {
        count++;
        return sum.exponent(a,b);
    }

    @Override
    public double module(double a) {
        return 0;
    }

    @Override
    public double root(double n) {
        return 0;
    }

}

