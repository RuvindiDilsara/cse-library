package it.uom.cse;

import java.util.Arrays;

public class MathOperation {

    public static double add(double... operands)
    {
        return Arrays.stream(operands).reduce(0d, Double::sum);
    }

    public static double subtract(double operand1, double operand2)
    {
        return operand1 - operand2;
    }

    public static int sumOfPrimes(int n) {
        int sum = 0;
        for (int m = 1; m <n ; m++) {
            for (int x = 2; x < m; x++) {
                if (m % x == 0) {
                    break;
                } else {
                    sum += m;
                }
            }
        }
        return sum;
    }
}
