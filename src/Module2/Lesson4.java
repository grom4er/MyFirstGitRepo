package Module2;

import java.util.Scanner;

public class Lesson4 {
    //task1
    /*
     we create private variable String name,
     but only class Lesson4 see that.
    */
    private String name;
    //To solve this task, you need to create getters and setters.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    Now, when we create object from class Lesson4, and
    we can set for variable name what we need. For that we must use structure:
    objectname.setName(name);
    Where, objectname - name of object from class Lesson4
           name - name, what we want to use.

    If, we want to take this variable, we must use structure:
           objectname.getName();
     Where objectname - name of object from class Lesson4
     */
    //task2 we just create static variable, and we use Constructor:
    static int count = 0;

    Lesson4() {
        count++;
    }
    // So, every time i create object, Constructor just count my count variable.


    public static void main(String[] args) throws InterruptedException {
        //task2
        Lesson4 l1 = new Lesson4();
        Lesson4 l2 = new Lesson4();
        System.out.println(Lesson4.count);
        //task3
        Lion lion = new Lion();
        lion.changePrivateString(); //first method with scanner in method
        lion.changeStringToNullandPrintIt(); // we just change name to null
        lion.changePrivateString("Puma");
        lion.changeStringToNullandPrintIt();
        lion.changePrivateString(lion, "Simba");
        lion.changeStringToNullandPrintIt();
        // task4
        /*
        class B {
    static int j = 5;

    static void abc(int i) {
        System.out.println(i); - here 5
    }

    public static void main(String[] args){
        abc(j++); Explanation: before ";" j is 5, so like argument we give number 5 to method
        System.out.println(j);  - here 6
    }
}
         */


        //task 5
        /*
        class D {
    int x = 10;
    int a = 5;
    int b = 6;
    int c = 4;

    public double average() {
        if (x > 0) {
            double avg = 0;
            avg = (double) (a + b + c) / 3;
            return avg;
        } else {
            avg = 0; Explanation - that class don't compile. avg variable only have seen from 82 to 86 Code line. In 87 variable avg not have. We must initialization it again
            return avg;
        }

    }
}
         */



        //task6
        /*
        class A {
            public A() {
                str1 = abc("String1");                 //seventh activate
            }
            static String str1 = abc("String2");    // first activate
            String str3 = abc("String3");          //fourth activate
            {
                str1 = abc("String4");            //fifth activate
            }
            static {
                str1 = abc("String5");           // second activate
            }

            static String str2 = abc("String6"); // third activate
            String str4 = abc("String7");        //sixth activate

            public static void main(String[] args){
                A a = new A();                         // seventh activate
            }

            static String abc(String str) {
                System.out.println(str);
                return str;
            }
        }

*/

    }
}

//task 3
class Lion {
    private String name1;
    /*
    Use, if user want to change name by himself
     */
    public void changePrivateString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write new name of lion");
        name1 = sc.next();
    }

    /*
    setter - yeah! But it without getter.
     */
    public void changePrivateString(String newName) {
        this.name1 = newName;
    }

    /*
       new representation
     */
    public void changePrivateString(Lion lion, String newName) {
        lion.name1 = newName;
    }

    public void changeStringToNullandPrintIt() throws InterruptedException {
        System.out.println("Name was " + name1);
        Thread.sleep(3000);
        this.name1 = null; // of course we can not change to null, but it just to check what another method works
        System.out.println("Now name is " + name1);
    }


}
