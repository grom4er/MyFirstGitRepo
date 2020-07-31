import java.util.Scanner;

// yes / no case insensitive

public class Lesson8 {
    static Scanner scN = new Scanner(System.in);
    static String userChoice = null;
    static int count = 1;
    static int Subparagraph = 0;


    static void parsingAskMethod(String MethodName, String userCase) {
        if (userCase == null) {
            System.out.printf("Do you want active method %s?" +
                    "\nPlease press \"Y\" to accept OR Press " +
                    "\"N\" to decline: \n", MethodName);
        } else {
            System.out.printf("Answer for %s is : \n", MethodName);
        }
    }

    static String nameTask(int Task, int Subparagraph) {
        return String.format("The task %d. Subparagraph %d",
                Task, Subparagraph);
    }

    static boolean yesOrNo(String userChoice) {

        userChoice = userChoice.toUpperCase();
        switch (userChoice) {
            case "Y":
                System.out.println("You answer is Y. I active method for you.");
                return true;
            case "N":
                System.out.println("You answer is N. Let's go another.");
                return false;
            default:
                System.out.printf("You answer %s is wrong. " +
                        "\nMust be only Y or N.\n" +
                        "Please, try again.", userChoice);
                System.out.println();
        }
        userChoice = scN.nextLine();
        return yesOrNo(userChoice);
    }

    static void printDigits() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "  " + ++i);
        }
    }

    static int sumOfDigits(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.printf("Sum from 1 to %d, is: \n", number);
        return sum; //IntStream.range(1,number+1).sum()
    }

    static int checkDigit() {
        if (scN.hasNextInt()) {
            return scN.nextInt();
        }
        System.out.println("Sorry, it not int number. Try again!");
        scN.next();
        return checkDigit();
    }

    static void numbersDivisibleBy3(int from, int To) {
        for (int i = from; i <= To; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d is divisible by 3 \n", i);
            }
        }
    }

    static void canItTringleBe(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide > thirdSide
                || firstSide + thirdSide > secondSide
                || secondSide + thirdSide > firstSide
        ) {
            System.out.println("It Tringle be");

        } else {
            System.out.println("It Tringle  impossible");
        }
    }


    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        while (count <= 4) {
            userChoice = null;
            parsingAskMethod(nameTask(1, ++Subparagraph), userChoice);
            userChoice = scN.next();
            if (yesOrNo(userChoice)) {
                switch (count) {
                    case 1:
                        printDigits();
                        break;
                    case 2:
                        System.out.println("You want sum from 1 to  what number?");
                        System.out.println(sumOfDigits(checkDigit()));
                        break;
                    case 3:
                        System.out.println("You want to find digit's by 3!");
                        System.out.println("Please, write first number from what digit start:");
                        int fNum = checkDigit();
                        System.out.println("Now, write second number, to what digit over:");
                        int sNum = checkDigit();
                        numbersDivisibleBy3(fNum, sNum);
                        break;
                    case 4:
                        System.out.println("Let we check, can be it Tringle!");
                        System.out.println("Please, write first number :");
                        fNum = checkDigit();
                        System.out.println("Please, write second number :");
                        sNum = checkDigit();
                        System.out.println("Please, write third number :");
                        int tNum = checkDigit();
                        canItTringleBe(fNum, sNum, tNum);
                        break;
                }
            }
            count++;
        }
        System.out.println("______________________________");

    }
}
