package Week1;

import java.util.Scanner;

public class PrimeCalc {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Please write which number you'd like to check: ");
        long check = in.nextLong();
        System.out.println(check + " is prime: " + PrimeCheck(check));
    }

    static boolean PrimeCheck(long x) {
        boolean isPrime = true;
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
            if (i % 2 == 1)
                i++;
        }
        if (x == 1)
            isPrime = false;
        return isPrime;
    }
}
