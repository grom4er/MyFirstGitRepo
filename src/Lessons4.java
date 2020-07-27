public class Lessons4 {
    static void relax(int a) {
        System.out.println(a);
    }
    static void relax(boolean a){
        System.out.println(a);
    }
    static void forTask6(int a, int b){
        System.out.print(a&b);
        System.out.println(" this is a&b");
        System.out.print(a|b);
        System.out.println(" this is a|b");
        System.out.print(~a);
        System.out.println(" this is ~a");
        System.out.print(~b);
        System.out.println(" this is ~b");
        System.out.print(a^b);
        System.out.println(" this is a^b");
    }

    public static void main(String[] args) {
        System.out.println(t401.a + " " + t401.b + " " + t401.c + " " + t401.d + " "
                + t401.e + " " + t401.f + " " + t401.i);
        //task 2
        System.out.println("Task 2");
        int a = 10;
        relax(a += 3);
        relax(a -= 7);
        relax(a *= 4);
        relax(a /= 8);
        relax(a % 2);
        System.out.println("Task 3");
        int a3 = 0;
        int b3 = 5;
        a3++; // a = a+1 = 1
        b3--;  // b = b-1 = 4
        relax(a3);
        relax(b3);
        a3 = --b3; // a == b  and a =  4-1 = 3
        relax(a3);
        relax(b3);
        a3 = b3--; // a != b and a = 3 ;  b = 2;
        relax(a3);
        relax(b3);
        //task4
        System.out.println("Task 4");
        int a4 = 3;
        int b4 = 5; boolean res;
        res = a4 >  b4; relax(res); // 3 not more 5 = false
        res = a4 >= b4; relax(res); // 3 not more or == 5 = false
        res = a4 <= b4; relax(res); // 3 is bellow  5 = true
        res = a4 == b4; relax(res); // 3 is not 5 = false
        res = a4 != b4; relax(res); // 3 is not 5 = true
        a4 = 5;
        res = a4 >  b4; relax(res); // 5 not more 5 = false
        res = a4 >= b4; relax(res); // 5 not more but == 5 = true
        res = a4 <= b4; relax(res); // 5 not bellow but == 5 = true
        res = a4 == b4; relax(res); // 5  == 5  = true
        res = a4 != b4; relax(res); // 5  == 5 = false
        // task 5
        System.out.println("Task 5");
         boolean bOne = true;
         boolean bTwo = false;
         t405.GiveMeBooleanValue(bOne,bTwo);
         bTwo = true;
        t405.GiveMeBooleanValue(bOne,bTwo);
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
        int at6 = 4; int b46 = 3;
        forTask6(at6,b46);

        //task 7
        System.out.println("Task 7");
        int at7 = 10;
        at7 = at7<<1;
        at7 = at7 >>2;
        at7 = -5;
        at7 =at7 >>>1;


    }

    static class t401 {
        static int a = 10 + 2;
        static int b = a + 5;
        static int c = a - b + 1;
        static int d = a * b * c;
        static int e = d / 8;
        static int f = e % 30;
        static int i = -f;
    }
    static class t405{

        static void GiveMeBooleanValue(boolean a, boolean b){
            System.out.println(a&&b);
            System.out.println(a||b);
            System.out.println(a^b);
            System.out.println(a!=b);
            System.out.println(a&b);
            System.out.println(a|b);
            System.out.println(a!=b);
            System.out.println(a^b);
        }
    }

}
