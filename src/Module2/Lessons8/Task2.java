package Module2.Lessons8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Task2and3 {
    static private String regexTask = "122 var3 34 2%^i 90";

    //task 2.1
//    static {
//        String[] text = regexTask.split("\\D+");
//        System.out.println(Arrays.toString(text));
//    }
    //task 2.2
//    static {
//        Pattern pattern = Pattern.compile("([ ]|^)(\\d+)([ ]|$)");
//        Matcher matcher = pattern.matcher(regexTask);
//        while (matcher.find()) {
//            System.out.println(regexTask.substring(matcher.start(2), matcher.end(2)));
//        }

    //task 3.1
    static {

        System.out.println("Write you password." +
                "\n It must contain at least 6 symbols, include numbers, letters, punctuation marks and special characters like $%# - at least one of each group.");
        Scanner sc = new Scanner(System.in);
        String userText = sc.nextLine();
        Pattern pattern = Pattern.compile("(?=.*\\w)(?=.*\\W)(?=.*\\d)[\\w\\W\\d]{6,}");
        Matcher matcher = pattern.matcher(userText);
        if (matcher.find()) {
            System.out.println("Password is correct");
        }
        else {
            System.out.println("Password is incorrect");
        }

    }


    public static void main(String[] args) {

        Task2and3 task2 = new Task2and3();
    }
}
