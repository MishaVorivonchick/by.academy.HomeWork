package by.academy.homework.task2.task7;

public class Test2 {public static void main(String[] args) {
    CalculatorWithCounte sum1 = new CalculatorWithCounte(new CalculatorWithMath());
    double sum = sum1.plus(4.1, sum1.plus(sum1.multiply(15d, 7d), sum1.exponent(sum1.division(28, 5), 2)));
    CalculatorWithCounte sum3 = new CalculatorWithCounte(new CalculatorWithOperator());
    System.out.println(sum1.getCountOperation());
    double sum2 = sum3.plus(4.1, sum3.plus(sum3.multiply(15d, 7d), sum3.exponent(sum3.division(28, 5), 2)));
    System.out.println(sum3.getCountOperation());

}

}
