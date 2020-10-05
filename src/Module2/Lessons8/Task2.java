package Module2.Lessons8;

import java.util.Arrays;


public class Task2 {
    static private String regexTask = "12 var3 34 2%^i 90";

    static {
//        String[] text = regexTask.split("\\D+");
//        System.out.println(Arrays.toString(text));
    }
    static {
        String [] text = regexTask.split(".^\\d");
        System.out.println(Arrays.toString(text));

    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
    }
}
