package Module1;

class Lesssons3 {
    public static void main(String[] args) {
        System.out.println(T303.x + " X value");
        System.out.println(T303.x * T303.x + " square of X");
        System.out.println(T303.x * T303.x * T303.x + "  cube of X");
        System.out.println((int) Math.pow((double) T303.x, 2) + " another representation  square of X");
        System.out.println((int) Math.cbrt((double) T303.x) + " another representation  cube of X");
        System.out.println(T304.LongNumber + " Max Long number");
        System.out.println(T305.res1 - (int) (T305.res1) + " after dot");
        T306.GiveMeValue();
        T308.GiveMeBinary();
        T308.GiveMeOctal();
        T308.GiveMeHexadecimal();
       


        /*
        int x = 'r' -  compile; char can be representation in ASCII Table;
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
        //Stack: in stack we have primitive data and reference to object;
        // Heap: in heap we have dynamic memory for object
        System.out.println(Integer.SIZE + "bits of Integer");
        System.out.println(Character.SIZE+ "bits of Character");
        System.out.println(Double.SIZE+ "bits of Double");
        System.out.println(Long.SIZE+ "bits of Long");
        System.out.println(Byte.SIZE+ "bits of Byte");
        System.out.println(Short.SIZE+ "bits of Short");
        System.out.println(Float.SIZE+ "bits of Float");

    }


}

class T301 {
    byte n1 = 127;
    int n2 = 255;
    byte res = (byte) (n1 - n2);
    Byte res2 = (byte) (n2 - n1);
        /*
        Byte have value from -128 to 127 integers;
        Memory take 8 bit
         */
}

class T302 {
    int n1 = -32768;
    int n2 = 32768;
    Short res = (short) (n1 + n2);
        /*
        Short have value from -32768 to 32767 integers;
        Memory take 16 bit
         */
}

class T303 {
    static int x = 1200;
        /*
        Int have value from -2147483648 to 2147483647 integers;
        Memory take 32 bit
         */

}

 class T304 {
    static long LongNumber = Long.MAX_VALUE;
    //can be use for implement id humans in all Planet for all time;

}

 class T305 {
    static float A = 1245.554f; // kg of apples
    static double B = 256.3785d; // kg of apples
    static double res1 = A * B;
    // if i right understand, i need to print value after dot ;
}

 class T306 {
    static char[] i = {'+', '!', '?'};

    static void GiveMeValue() {
        for (char d : i) {
            System.out.format("The char is %s", d);
            System.out.println();
        }
    }

}

 class T308 {
    static int x = 121;

    static void GiveMeBinary() {

        System.out.println(Integer.toBinaryString(x) + " first representation of x in binary");
        //another way:
        // (from CS50)
        // 128 64 32  16 8 4 2 1
        //  0  1  1   1  1 0 0 1
        String BinaryRepresentationFirstPart = "0b";
        String BinaryRepresentationSecondPart = "01111001";
        System.out.println(BinaryRepresentationFirstPart
                + BinaryRepresentationSecondPart
                + " second representation of x in binary");

    }

    static void GiveMeOctal() {

        System.out.println(Integer.toOctalString(x) + " first representation of x in octal");
        //another way:
        // 121/8 = 15 ; 15 / 8 = (1)
        //  (1)              (7)
       String OctalRepresentationFirstPart = "0";
       String SecondRepresentationFirstPart ="171";
        System.out.println(OctalRepresentationFirstPart
                +SecondRepresentationFirstPart
                + " second representation of x in octal");
    }

    static void GiveMeHexadecimal() {
        System.out.println(Integer.toHexString(x) + " first representation of x in Hexadecimal");
        //another way:
        //121/16 = 7
        //  9
        String HexadecimalRepresentationFirstPart = "0x";
        String HexadecimalRepresentationSecondPart = "79";
        System.out.println(HexadecimalRepresentationFirstPart
                +HexadecimalRepresentationSecondPart + " second representation of x in Hexadecimal");

    }



}



