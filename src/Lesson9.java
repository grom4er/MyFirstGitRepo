import java.util.Arrays;
import java.util.Scanner;

public class Lesson9 {
    static Scanner sc = new Scanner(System.in);

    static void changeString1() {
        System.out.println("London - is a capital of Great Britain");
    }

    static String changeString2(String name) {
        return name.replace("England", "Great Britain");
    }

    static String changeString3(String name) {
        String[] array = name.split(" ");
        String res = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("England")) {
                array[i] = "Great Britain";
            }
            res += array[i] + " ";
        }
        return res;
    }


    static String checkString() {
        while (true) {
            System.out.println("Write word, where symbols a Even");
            String res = sc.nextLine();
            if (res.length() % 2 == 0) {
                return res;
            }
            System.out.println("Sorry, you do mistake. Please try again");
        }
    }

    static String delString1(String nameOne, String nameTwo) {
        char[] arrayOne = nameOne.toCharArray();
        String resOne = "";
        for (int i = 0; i < arrayOne.length / 2; i++) {
            resOne += arrayOne[i];
        }

        char[] arrayTwo = nameTwo.toCharArray();
        String restWo = "";
        for (int i = arrayTwo.length / 2; i < arrayTwo.length; i++) {
            restWo += arrayTwo[i];
        }
        return resOne.concat(restWo);
    }


    static String delString2(String nameOne, String nameTwo) {
        char[] arrayOne = nameOne.toCharArray();
        char[] arrayTwo = nameTwo.toCharArray();
        return String
                .copyValueOf(arrayOne, 0, nameOne.length() / 2)
                .concat(String.copyValueOf(arrayTwo, nameTwo.length() / 2, nameTwo.length() / 2));

    }

    static String delString3(String nameOne, String nameTwo) {
        return nameOne.substring(0, nameOne.length() / 2) + nameTwo.substring(nameTwo.length() / 2);
    }

    static String reverse1(String name) {
        char[] array = name.toCharArray();
        String res = "";
        for (int i = array.length; i > 0; i--) {
            res += array[i - 1];
        }
        return res;
    }
    static String reverse2(String name){
        StringBuffer r = new StringBuffer(name);
        return ""+r.reverse();
    }


    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
                /*
                int count = 0;
String st = "Java"; - String pull; count ++;
String st2 = new String("Java"); - String pull; count++;
String st3 = st2.intern(); - String was in pull;
String st4 = "java";  - String pull; count++;
String st = null; null
String st6 = new String("JAVA"); - String pull; count ++;
count = 4;
         */

        //task 2
        System.out.println("Task 2");
        String m = "London - is a capital of England";
        changeString1(); // easy mode
        System.out.println(changeString2(m)); // almost easy
        System.out.println(changeString3(m)); // boring method


        //task 3
        System.out.println("Task 3");
        String firstString = checkString();
        String secondString = checkString();
        System.out.println("Resault is: " + delString1(firstString, secondString)); //first method
        firstString = checkString();
        secondString = checkString();
        System.out.println("Resault is: " + delString2(firstString, secondString)); //second method
        firstString = checkString();
        secondString = checkString();
        System.out.println(delString3(firstString, secondString)); //third method

        //task 4
        System.out.println("Task 4");
        System.out.println("Let reverse!");
        firstString = checkString();
        System.out.println("Resault is: " + reverse1(firstString)); //first method
        firstString = checkString();
        System.out.println("Resault is: " + reverse2(firstString)); //first method



    }
}
