package Module3.Lesson3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task1 {

    static long[][] cache = new long[10][20];

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        fillCache();
        System.out.println(Arrays.toString(getNumbersCache(100_000_000L)));
        long b = System.currentTimeMillis();
        System.out.println("memory = " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 128 * 1024) + " megabyte");
        System.out.println("time = " + (b - a) + " milliseconds");

    }
    static void fillCache() {
        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                cache[i][j] = powMath(i, j);
            }
        }
    }
    public static long[] getNumbersCache(long number) {
        if (number < 0) {
            System.out.println("Armstrong numbers only natural numbers");
            return null;
        }
        List<Long> list = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (checkValueCachce(i)) {
                list.add((long) i);
            }
        }
        return list.stream().mapToLong(a -> a).toArray();
    }

    static long powMath(long base, int exponent) {
        long result = 1;
        while (exponent-- > 0) {
            result *= base;
        }
        return result;
    }

    static long powCache(int base, int exponent) {
        return cache[base][exponent];
    }
    static boolean checkValueCachce(int number) {
        return sumNumbersCache(number) == number;
    }

    static long sumNumbersCache(int number) {
        int length = String.valueOf(number).length();
        long result = 0;
        while (number > 0) {
            result += powCache(number % 10, length);
            number /= 10;
        }
        return result;
    }



}
