package by.academy.homework.task1;

public class Test {
    public static void main(String[] args) {
        CalculatorWithOperator sum1 = new CalculatorWithOperator();

        double sum;
        sum = sum1.plus(4.1, sum1.plus(sum1.multiply(15d,7d), sum1.exponent(sum1.division(28,5),2)));
        System.out.println(sum);

    }

}
