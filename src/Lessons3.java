import java.math.BigDecimal;

class Lesssons3 {
    public static void main(String[] args) {
        System.out.println(t303.x + " X value");
        System.out.println(t303.x * t303.x + " square of X");
        System.out.println(t303.x * t303.x * t303.x + "  cube of X");
        System.out.println((int) Math.pow((double) t303.x, 2) + " another representation  square of X");
        System.out.println((int) Math.cbrt((double) t303.x) + " another representation  cube of X");
        System.out.println(t304.LongNumber + " Max Long number");
        System.out.println(t305.res1 - (int) (t305.res1) + " after dot");
        t306.giveMeValue();
       


        /*
        int x = 'r' - not compile; int can be only integer number;
        char x = 123 -  compile; char can be representation in ASCII Table;
        float x = 7.2 - not compile; we must specify float with "f" in last index
        short x = 3L - not compile; short x = 3.0 == short x = 3l; what is error
        double x = 0x123D  -compile;  it double value in 16 system
        int x = 0x123f -compile;  it int value in 16 system
        int x = 078 - not compile;  The octal numeral system don't have number 8
        short x = 7 -  compile; all fine;
        byte x = 255 - not compile;  byte cannot be large 127;
        double x = 9 -compile; all fine;
        int x = 5.5 - not compile; int only integers numbers
        int x = 5 -compile; all file
        */
        //for task 9
        int c; // it just primitive type java. We 100% know how many bytes it takes. And we always can see what in "box"
        Integer c1; // it is a object. c1 don't know what he have, he only have reference to object.
        // Difference:
        int testD1 = 0; int testD2;
        testD2 = testD1; // we can do that operation, and we give number to box testD2;
        Integer testD3 = 1; Integer testD4;
        testD4 = testD3; // we can do that operation, but we ONLY give reference to object;
        //Steak: in Steak we have primitive data and reference to object;

    }


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

class t303 {
    static int x = 1200;
        /*
        Int have value from -2147483648 to 2147483647 integers;
        Memory take 32 bit
         */

}

 class t304 {
    static long LongNumber = Long.MAX_VALUE;
    //can be use for implement id humans in all Planet for all time;

}

 class t305 {
    static float A = 1245.554f; // kg of apples
    static double B = 256.3785d; // kg of apples
    static double res1 = A * B;
    // if i right understand, i need to print value after dot ;
}

 class t306 {
    static char[] i = {'+', '!', '?'};

    static void giveMeValue() {
        for (char d : i) {
            System.out.format("The char is %s", d);
            System.out.println();
        }
    }

}

 class t308 {
    static int x = 121;

    static void GiveMeBinary() {
        System.out.println(Integer.toBinaryString(x));
    }

    static void GiveMeOctal() {
        System.out.println(Integer.toOctalString(x));
    }

    static void GiveMeHexadecimal() {
        System.out.println(Integer.toHexString(x));
    }


}



