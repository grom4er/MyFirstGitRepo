import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        //if will be false. b = 6;

        //Task 2
        System.out.println("Task 2");
        // compile error. Cannot be c = d++; Must be c == d++;
        // if be right,will be else statment;
        //Task 3
        System.out.println("Task 3");
        int a = 34, b = 2, c = 78;
        //find max
        if (a > b && a > c) {
            System.out.println("max is A");
        } else if (b > a && b > c) {
            System.out.println("max is A");
        } else {
            System.out.println("max is C");
        }
        //another way
        // System.out.println(Math.max(Math.max(a,b), Math.max(b,c) ));
        //find min


        if (a < b && a < c) {
            System.out.println("min is A");
        } else if (b < a && b < c) {
            System.out.println("min is B");
        } else {
            System.out.println("min is C");
        }
        //another way
        // System.out.println(Math.min(Math.min(a,b), Math.min(b,c) ));

        //Task 4
        System.out.println("Task 4");
        //First answer is "All statements are true."
        // second answer is : in fist if change (b >= a) to (b == a);

        //Task 5
        System.out.println("Task 5");

        int num = 8;
        String.format("Number is %s 10", num > 10 ? "greater than" : "less than or equal to");

        //Task 6
        System.out.println("Task 6");
        System.out.println("Enter any number.");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int i = 1;
        switch (month) {
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
            default:
                System.out.println("You do mistake,");

        }



        //Task 7
        System.out.println("Task 7");
        System.out.println("Enter the day of the week.");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next().toLowerCase(); // it can be any day
        switch (day) {
            case "monday":
                System.out.println("This is the first day of the week");
                break;
            case "tuesday":
                System.out.println("This is the second day of the week");
                break;
            case "wednesday":
                System.out.println("This is the third day of the week");
                break;
            case "thursday":
                System.out.println("This is the fourth day of the week");
                break;
            case "friday":
                System.out.println("This is the fifth day of the week");
                break;
            case "saturday":
                System.out.println("This is the sixth day of the week");
                break;
            case "sunday":
                System.out.println("This is the seventh day of the week");
                break;
            default:
                System.out.println("Such day of the week doesn't exist.");
        }


    }
}
