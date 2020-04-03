package by.academy.homework.task2.task7;

public class Test {public static void main(String[] args) {
    CalculatorWithOperator sum1 = new CalculatorWithOperator();
    double sum;
    sum = sum1.plus(4.1, sum1.plus(sum1.multiply(15d,7d), sum1.exponent(sum1.division(28,5),2)));
    System.out.println(sum);
    CalculatorWithOperator sum2 = new CalculatorWithOperator();
    System.out.println(sum2.division(sum,0));//Infinity (a/0==±∞)
    System.out.println(sum2.division(sum,0.0d));//Infinity (a/0==±∞)
    CalculatorWithMath calculatorWithMath = new CalculatorWithMath();
    double  sum3 =calculatorWithMath.plus(4.1, sum1.plus(sum1.multiply(15d,7d), sum1.exponent(sum1.division(28,5),2)));
    System.out.println(sum3 );


}

}
