public class Lessons4 {
    static void GiveMeBooleanValue(boolean a, boolean b) {
        System.out.format("Answer a&&b  is %b\n", a && b);
        System.out.format("Answer a||b  is %b\n", a || b);
        System.out.format("Answer a^b  is %b\n", a ^ b);
        System.out.format("Answer a!=b  is %b\n", a != b);
        System.out.format("Answer a&b is %b\n", a & b);
        System.out.format("Answer a|b  is %b\n", a | b);
        System.out.format("Answer a!=b  is %b\n", a != b);


    }

    static void forTask6(int a, int b) {
        System.out.print(a & b);
        System.out.println(" this is a&b");
        System.out.print(a | b);
        System.out.println(" this is a|b");
        System.out.print(~a);
        System.out.println(" this is ~a");
        System.out.print(~b);
        System.out.println(" this is ~b");
        System.out.print(a ^ b);
        System.out.println(" this is a^b");
    }

    public static void main(String[] args) {
        //task 1;
        System.out.println("Task 1");
        System.out.println("Answer a = 10 + 2 is " + T401.a);
        System.out.println("Answer b = a + 5 is " + T401.b);
        System.out.println("Answer c = a - b + 1 is " + T401.c);
        System.out.println("Answer d = a * b is " + T401.d);
        System.out.println("Answer e = d / 8 is " + T401.e);
        System.out.println("Answer f = e % 30 is " + T401.e);
        System.out.println("Answer i = -f; is " + T401.i);
        System.out.println("______________________________");

        //task 2
        System.out.println("Task 2");
        int a = 10;
        System.out.format("Answer a += 3 is %d \n", a += 3);
        System.out.format("Answer a -= 7 is %d \n", a -= 7);
        System.out.format("Answer a *= 4 is %d \n", a *= 4);
        System.out.format("Answer a /= 8 is %d \n", a /= 8);
        System.out.format("Answer a %% 2 is %d \n", a % 2);
        System.out.println("______________________________");

        //task3
        System.out.println("Task 3");
        int a3 = 0;
        int b3 = 5;
        a3++;
        b3--;
        System.out.println("Answer a3++ is " + a3); // a = a+1 = 1
        System.out.println("Answer b3-- is " + b3); // b = b-1 = 4
        a3 = --b3;
        System.out.printf("Answer a3 = --b3  where a is %d and b is %d \n", a3, b3); // a == b  and a =  4-1 = 3
        a3 = b3--;
        System.out.printf("Answer a3 = b3--  where a is %d and b is %d \n", a3, b3); // a != b and a = 3 ;  b = 2;
        System.out.println("______________________________");


        //task4
        System.out.println("Task 4");
        int a4 = 3;
        int b4 = 5;
        System.out.format("Answer a4 > b4  is %b \n", a4 > b4); // 3 not more 5 = false
        System.out.format("Answer a4 >= b4  is %b \n", a4 >= b4);// 3 not more or == 5 = false
        System.out.format("Answer a4 <= b4 is %b \n", a4 <= b4); // 3 is bellow  5 = true
        System.out.format("Answer a4 == b4 is %b \n", a4 == b4); // 3 is not 5 = false
        System.out.format("Answer a4 != b4 is %b \n", a4 != b4);// 3 is not 5 = true
        System.out.println("Now we change a to 5.\n a = 5");
        a4 = 5;
        System.out.format("Answer a4 > b4  is %b \n", a4 > b4); // 5 not more 5 = false
        System.out.format("Answer a4 >= b4  is %b \n", a4 >= b4); // 5 not more but == 5 = true
        System.out.format("Answer a4 <= b4 is %b \n", a4 <= b4);// 5 not bellow but == 5 = true
        System.out.format("Answer a4 == b4 is %b \n", a4 == b4);// 5  == 5  = true
        System.out.format("Answer a4 != b4 is %b \n", a4 != b4);// 5  == 5 = false
        System.out.println("______________________________");
        // task 5
        System.out.println("Task 5");
        boolean bOne = true;
        boolean bTwo = false;
        GiveMeBooleanValue(bOne, bTwo);
        bTwo = true;
        System.out.println("Now we change bTwo to true. bTwo = true");
        GiveMeBooleanValue(bOne, bTwo);
        System.out.println("______________________________");
         /*
        a. true || false = true
        b. false && true = false
        c. !true || 1 >= 0   = true (work 1>=0)
        d. false && 5  = error
        e. true &&! false = true
        f. true ^! true = true - but i look it in IDE;
        i. 1> = 1 || false = true
        g. true && 5 - 5 = error
*/
        //task 6
        System.out.println("Task 6");
        int at6 = 4;
        int b46 = 3;
        forTask6(at6, b46);
        System.out.println("______________________________");

        //task 7
        System.out.println("Task 7");
        int at7 = 10;
        // 8 4 2 1 (cs50)  10 = 1010
        at7 = at7 << 1; // 1010 <<1 =10100
        at7 = at7 >> 2; // 10100 >>2 = 1001
        at7 = -5; //full representation int is  11111111111111111111111111111011
        // all int is have 32 bits, but left zero's don't get for save memory
        at7 = at7 >>> 1;
        /* so we take first number and last five  .
        let first number be a, last five be b
        a = 1;
        b = 11011;
        so now we have pull of 32 bits, move a and b ;
        a change to 0;
        b move to 11101
        */


    }

    static class T401 {
        static int a = 10 + 2;
        static int b = a + 5;
        static int c = a - b + 1;
        static int d = a * b * c;
        static int e = d / 8;
        static int f = e % 30;
        static int i = -f;


    }


}
