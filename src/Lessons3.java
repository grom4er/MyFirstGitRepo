import java.math.BigDecimal;

class Lesssons3 {
    public static void main(String[] args) {
        System.out.println(t303.x + " X value");
        System.out.println(t303.x * t303.x + " square of X");
        System.out.println(t303.x * t303.x * t303.x + "  cube of X");
        System.out.println((int) Math.cbrt((double) t303.x) + " another representation of cube of X");
        System.out.println(t304.LongNumber + " Max Long number");
        System.out.println(t305.res);
        int a;


    }

    class t301 {
        byte n1 = 127;
        int n2 = 255;
        byte res = (byte) (n1 - n2);
        Byte res2 = (byte) (n2 - n1);
        /*
        Byte have value from -128 to 127 integers;
        Memory take 8 bit
         */
    }

    class t302 {
        int n1 = -32768;
        int n2 = 32768;
        Short res = (short) (n1 + n2);
        /*
        Short have value from -32768 to 32767 integers;
        Memory take 16 bit
         */
    }

    static class t303 {
        static int x = 1200;
        /*
        Int have value from -2147483648 to 2147483647 integers;
        Memory take 32 bit
         */

    }

    static class t304 {
        static long LongNumber = Long.MAX_VALUE;
        //can be use for implement id humans in all Planet for all time;

    }

    static class t305 {
        static float A = 1245.554f; // kg of apples
        static double B = 256.3785d; // kg of aplles
        // if i right understand, i need to print value after dot ;
        static BigDecimal A1 =  new BigDecimal(A);
        static BigDecimal B2 = new BigDecimal(B);
    }


}