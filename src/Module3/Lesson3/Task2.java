package Module3.Lesson3;

import java.util.*;


public class Task2 {
    static long[][] cache = new long[11][20];
    static TreeSet<Long> set = new TreeSet<>();

    static void fillCache() {
        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                cache[i][j] = Task1.powMath(i, j);
            }
        }
    }

    public static void main(String[] args) {
        fillCache();
        for (int i = 0; i < 10; i++) {
            long a = System.currentTimeMillis();
            //System.out.println(Arrays.toString(getNumbers(100_000_000_000_0000L)));
            System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
            // with LONG.MAX_VALUE work at 4 second
            long b = System.currentTimeMillis();
            System.out.println("memory = " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 128 * 1024) + " megabyte");
            System.out.println("time = " + (b - a) + " milliseconds");
        }

        /*
        My result is:
        memory = 3 megabyte
        time = 500-900 miliseconds
         with LONG.MAX_VALUE work at 5 second
         */

    }

    static long[] getNumbers(long number) {
        if (number < 0) {
            System.out.println("Armstrong numbers only natural numbers");
            return null;
        }
        createTableAndPutInList(number, takeExponent(number), 0, 0);
        set.remove((long) 0);

        return set.stream().mapToLong(Number::longValue).toArray();

    }

    static void createTableAndPutInList(long maxValue, int exponent, int min, long value) {
        if (value > maxValue || value < 0) return;
        for (int i = min; i < 11; i++) {
            if (exponent > 0) {
                createTableAndPutInList(maxValue, exponent - 1, i,
                        value + heroToZero(i) * Task1.powMath(10, exponent));
            } else {
                if (value + heroToZero(i) > maxValue || value + heroToZero(i) == 0) {
                    continue;
                } else {
                    long tempResult = sumNumbers(value + heroToZero(i));

                    if (tempResult == sumNumbers(tempResult)) {
                        set.add(tempResult);
                    }
                }

            }
        }
    }

    static long heroToZero(int checkNumber) {
        return checkNumber < 10 ? checkNumber : 0;
    }

    /**
     * from Integer.stringSize
     **/
    static int takeExponent(long number) {
        long p = 10;
        for (int i = 1; i < 19; i++) {
            if (number < p)
                return i;
            p = 10 * p;
        }
        return 19;
    }

    static long sumNumbers(long number) {
        int lengthNumber = takeExponent(number);
        long result = 0;
        while (number > 0) {
            //  result += Task1.powMath(number % 10, lengthNumber);
            result += cache[(int) (number % 10)][lengthNumber];
            number /= 10;
        }
        return result > 0 ? result : 0;
    }
}



