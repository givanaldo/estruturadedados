package fatorial;

import java.math.BigInteger;

public class Fatorial {

    // função recursiva
    public static double fatorial1(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fatorial1(n - 1);
        }
    }
    // função recursiva usando BigInteger
    public static BigInteger fatorial3(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
        	BigInteger m = BigInteger.valueOf(n);
        	return m.multiply(fatorial3(n - 1));
        }
    }

    // função interativa
    public static double fatorial2(int n) {
        double fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }

    // função interativa usando BigInteger
    public static BigInteger fatorial4(int n) {
        BigInteger fat = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fat = fat.multiply(BigInteger.valueOf(i));
        }
        return fat;
    }
}
