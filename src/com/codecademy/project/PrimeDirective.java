package com.codecademy.project;

import java.util.ArrayList;
import java.lang.Math;

class PrimeDirective {

    // Add your methods here:

    public boolean isPrime (int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            int nSqrt = (int) Math.floor(Math.sqrt(number));

            /*
            for a pair of integers between 2, sqrt(number) check the number can be built up from a multiple of both and
            if so return false
            */
            for (int numDIv = 2; numDIv <= nSqrt; numDIv++) {
                if (number % numDIv == 0) {
                    return false;
                }
            }

            // standard return after checking if number is not prime
            return true;
        }
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int number: numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.onlyPrimes(numbers));
    }

}
