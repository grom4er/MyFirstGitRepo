package Module1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// yes / no case insensitive

// 1.2 указать диапазаон и до минус числа
// Для чисел с запятой добавить считывание "." или указать что запятая

public class Lesson8 {
    static Scanner scN = new Scanner(System.in);
    static String userChoice = null;
    static int count = 1;
    static int Subparagraph = 0;
    static String forTask3;



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
                        "\nMust be only  one symbol  Y or N.\n" +
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
        if(number<=0){
            System.out.printf("Sorry, you number %d don't correct. Must be More 1", number);
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.printf("Sum from 1 to %d, is: \n", number);
        return sum; //IntStream.range(1,number+1).sum()
    }
    static double checkDigitDouble(){
        if (scN.hasNextDouble()) {
            return scN.nextDouble();
        }
        System.out.println("Sorry, it not double number. Try again!");
        scN.next();
        return checkDigitDouble();
    }
    static int checkDigit() {
        if (scN.hasNextInt()) {
            return Integer.parseInt(scN.next());
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
        if(firstSide <=0 || secondSide <= 0 || secondSide <=0 ){
            System.out.println("Triangle with you numbers can is impossible");
            return;
        }
        if (firstSide + secondSide > thirdSide
                || firstSide + thirdSide > secondSide
                || secondSide + thirdSide > firstSide
        ) {
            System.out.println("Triangle with you numbers can be");
        } else {
            System.out.println("Triangle with you numbers can is impossible");
        }
    }

    static boolean numberBellowOrMoreZero(int number) {
        return number >= 0 ? true : false;
    }

    static void upgradeNumberBellowOrMoreZero(int number) {
        System.out.printf("Number %d is %s \n", number
                , numberBellowOrMoreZero(number) == true
                        ? "More  zero" : "Bellow  zero or is zero");
    }

    static void moreUpgradeNumberBellowOrMoreZero(int number) {
        upgradeNumberBellowOrMoreZero(number);
        System.out.printf("And number is %s \n", number % 2 == 0 ? "Odd" : "Even");
    }

    static void overloadMethodForTask3(int number) {
        System.out.printf("I will square you number. \n " +
                "brrrr.....\n" +
                "brrrrr...." +
                "scquare of %d is %d", number, number * number);
    }

    static void overloadMethodForTask3(int fNumb, int sNumb) {
        System.out.printf("I will multiply you number. \n " +
                "brrrr.....\n" +
                "brrrrr...." +
                "multiply is %d \n", fNumb * sNumb);
    }

    static void overloadMethodForTask3(double fNumb, int sNumb) {
        System.out.print("I will multiply you number. \n " +
                "brrrr.....\n" +
                "brrrrr...." +
                "multiply is \n" +  fNumb * ((double)sNumb));
    }

    static void overloadMethodForTask3(double fNumb, double sNumb) {
        System.out.print("I will multiply you number. \n " +
                "brrrr.....\n" +
                "brrrrr...." +
                "multiply is \n" + fNumb * sNumb);
    }
    static void overloadMethodForTask3(String answ) {
        try {
            if(answ.toLowerCase().equals("start")){
                forNnums();
                return;
            }
            else if(Integer.parseInt(answ) > 0){
                forNnums(Integer.parseInt(answ));
                return;
            }
        }
        catch (Exception e){
            System.out.println("You answer is not integer more zero or word \"start\" \n" +
                    "Please try again ");
            forTask3 = scN.next();
            overloadMethodForTask3(forTask3);

        }



    }
    static void forNnums(){
        System.out.println("If you stop, just write 0");
        System.out.println("Write fist number:");
        int sum = 0;
        int temp = 0;
        while (true){
            temp = checkDigit();
            sum+=temp;
            if(temp == 0) break;
            System.out.println("Write another number or zero for over");
        }
        System.out.println("The sum of you numbers is " + sum);
    }
    static void forNnums(int countValues){
        int [] array = new int[countValues];
        System.out.println("Please, write numbers:");
        for(int i = 0; i <array.length; i++){
            array[i] = checkDigit();
        }
        System.out.println("Sum of you digits is " + Arrays.stream(array).sum());

    }


    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        while (count <= 4) {
            userChoice = null;
            parsingAskMethod(nameTask(1, ++Subparagraph), userChoice);
            userChoice = scN.next();
            scN.skip("\n");
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
        //task 2
        count = 1;
        Subparagraph = 0;
        System.out.println("Task 2");
        while (count <= 3) {
            userChoice = null;
            parsingAskMethod(nameTask(2, ++Subparagraph), userChoice);
            userChoice = scN.next();
            scN.skip("\n");
            if (yesOrNo(userChoice)) {
                switch (count) {
                    case 1:
                        System.out.println("Let check. You number is more then 0? \n" + "" +
                                "Write please number:");
                        System.out.printf("The answer is %b \n", numberBellowOrMoreZero(checkDigit()));
                        break;

                    case 2:
                        System.out.println("Let check. You number is more then 0 or is 0? \n" +
                                "But now we upgrade our answer.\n" +
                                "Write please number:");
                        upgradeNumberBellowOrMoreZero(checkDigit());
                        break;
                    case 3:
                        System.out.println("Let check. You number is more then 0 or is 0? \n" +
                                "But now we upgrade our answer more.\n" +
                                "Write please number:");
                        moreUpgradeNumberBellowOrMoreZero(checkDigit());
                        break;
                }
            }
            count++;
        }
        System.out.println("______________________________");

        //task 3
        count = 1;
        Subparagraph = 0;
        System.out.println("Task 3");
        while (count <= 5) {
            userChoice = null;
            parsingAskMethod(nameTask(3, ++Subparagraph), userChoice);
            userChoice = scN.next();
            scN.skip("\n");
            if (yesOrNo(userChoice)) {
                switch (count) {
                    case 1:
                        System.out.println("I want to square you number. Give me it");
                        overloadMethodForTask3(checkDigit());
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("I want to multiply you two number. Give me it");
                        System.out.println("Please, write first number :");
                        int fNum = checkDigit();
                        System.out.println("Please, write second number :");
                        int sNum = checkDigit();
                        overloadMethodForTask3(fNum, sNum);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("I want to multiply you two number.\n" +
                                "Give me it. But first can be float number ");
                        System.out.println("Please, write first number :");
                        double fNumD = checkDigitDouble();
                        System.out.println("Please, write second number :");
                        sNum = checkDigit();
                        overloadMethodForTask3(fNumD, sNum);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("I want to multiply you two number. \n " +
                                "Give me it. But both can be float number ");
                        System.out.println("Please, write first number :");
                        fNumD = checkDigitDouble();
                        System.out.println("Please, write second number :");
                        double sNumD = checkDigitDouble();
                        overloadMethodForTask3(fNumD, sNumD);
                        break;
                    case  5: System.out.println("I want to sum you o numbers. \n");
                        System.out.println("Please, write how many numbers you want. Or write \"start\" if you not know count of you numbers ");
                        forTask3 = scN.next();
                        overloadMethodForTask3(forTask3);
                        break;
                }
            }
            count++;
        }


    }
}
