package Module3.Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Realization {
    private static Scanner sc = new Scanner(System.in); // 1 scanner for all aplication
    private static String userName; // for safe user name
    private static String robotText; // for print robot
    static int timeRobot = 3; // time robot, important to pause
    private static String[] menu = {"1. Add book"
            , "2. Delete book"
            , "3. Change name book"
            , "4. Show all books"
            , "5. Find book"
            , "6. Sort books by names"
            , "7. back to robot configuration speed"
            , "8. Exit"
            , "99. Joke"}; // menu
    private static ArrayList<String> list = new ArrayList<>();
    private static String noBook = "Sorry, but in my library no one book. Add first."; // to stop dublicate


    public static void start() { // Method to start.
        robotHello();
        menuOfProgram();
    }

    public static void robotHello() {
        robot("Hello. My name is DestroyerWorld2000. A am librarian.");
        robot("So, what is you name? Please write it:");
        stringCheckUserName();
        robot(String.format("So, i glad to see you %s", userName));
        robot("I help you in library, but first you need help me.");
        robot("Like you see, i  cool robot. But you just are human!");
        robot("So, you can - write me speed how i will talk with you.");
        robot("It must be second from 3-20 and an integer");
        robot("So, all it time before we talk on speed 3.");
        robotSpeedChange();
    }

    static void menuOfProgram() {
        while (true) {
            robot(String.format("*Robot sounds*, now we in menu of my library %s. Choice menu:", userName == null ? "Guest" : userName)); // check for test/start option
            pause(timeRobot);
            showMenu();
            pause(timeRobot + 2);
            robot("*Robot sounds*, what menu you want to use? Write number");
            menu(); //start main method for menu
        }
    }

    public static void menu() {
        while (true) {
            stopDublicateCode();
            String choiceMenu = sc.nextLine().trim();
            switch (choiceMenu.toLowerCase()) {
                case "1":
                    addBook();
                    break;
                case "2":
                    if (list.isEmpty()) {
                        robot("Sorry, but in my library no one book. Add first.");
                    } else {
                        deleteBook();
                    }
                    break;
                case "3":
                    if (list.isEmpty()) {
                        robot(noBook);
                    } else {
                        changeBookName();
                    }
                    break;
                case "4":
                    System.out.println();
                    if (list.isEmpty()) {
                        robot(noBook);
                    } else {
                        showBooks();
                    }
                    break;
                case "5":
                    if (list.isEmpty()) {
                        robot(noBook);
                    } else {
                        findBookMenu();
                    }
                    break;
                case "6":
                    if (list.isEmpty()) {
                        robot(noBook);
                    } else {
                        robot("Books are sorted. Please, check it in menu \"4\" ");
                        Collections.sort(list);
                    }
                    break;
                case "7":
                    robotSpeedChange();
                    break;
                case "8":
                    robot(String.format("Thanks for coming %s. Goodbye.", userName == null ? "Guest" : userName));
                    System.exit(0);
                    break;
                case "99":
                    robot("The man bought a hat, and she just right for him");
                    break;
                case "menu":
                    showMenu();
                    pause(timeRobot + 2);
                    break;
                default:
                    errorRobotSay();
            }
            robot("Write you choice number of menu");
            robot("If you forgot the menu, just write \"menu\"");
            System.out.println();
        }


    }

    public static void robot(String robotText) {
        pause(timeRobot);
        System.out.println("\n".repeat(12));
        Realization.robotText = String.format("     ,_,_,     \r\n     \\O O/     \r\n     /_E_\\     ---- %s  \r\n()ooo|\\=/|ooo()\r\n     |___|    \r\n     /| |\\     \r\n    [_] [_] ", robotText);
        System.out.print(Realization.robotText);
    }

    static void pause(int time) {
        long timeStart = System.currentTimeMillis();
        long timeOver = timeStart + 1000 * time;
        while (timeStart != timeOver) {
            timeStart = System.currentTimeMillis();
        }
    }

    static void stringCheckUserName() {
        System.out.println();
        while (true) {
            stopDublicateCode();
            userName = sc.nextLine();
            if (userName == null || userName.length() <= 3) {
                System.out.println("Sorry, you name is impossible. Try again.\nMust be more 3 symbol.");
            } else if (!checkName(userName)) {
                System.out.println("Sorry, you name is impossible. Try again.\nAt name cannot be numbers or not latters.");
            } else if (checkName(userName)) {
                return;
            }
        }
    }

    static void robotSpeedChange() {
        System.out.println();
        robot("You want to change my speed? Write y if yes or write n if no");
        while (true) {
            stopDublicateCode();
            String answer = sc.nextLine().trim();
            if (answer.equalsIgnoreCase("n")) {
                robot(String.format("You don't change anything, speed still is : %d", timeRobot));
                return;
            } else if (answer.equalsIgnoreCase("y")) {
                while (true) {
                    robot("*Robot sounds*, what speed you want?");
                    stopDublicateCode();
                    int check = checkDigit();
                    if (check >= 3 && check <= 20) {
                        timeRobot = check;
                        robot(String.format("*Robot sounds*, now my speed is: %d", timeRobot));
                        return;
                    } else {
                        errorRobotSay();
                        robot("Like i said before, it must be 3 or more where max is 20");
                    }
                }
            } else {
                errorRobotSay();
                robot("You want to change my speed? Write y if yes or write n if no");
            }
        }
    }


    static int checkDigit() {
        System.out.println();
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                errorRobotSay();
                stopDublicateCode();
            }
        }
    }

    static boolean checkName(String name) {
        char[] array = name.toCharArray();
        for (char check : array) {
            if (!Character.isLetter(check)) {
                return false;
            }
        }
        return true;
    }

    static void showMenu() {
        System.out.println("\n".repeat(12));
        for (int i = 0; i < menu.length - 1; i++) {
            System.out.println(menu[i]);
        }
        if ((int) (Math.random() * 100) == 99) {
            System.out.println(menu[menu.length - 1]);
        }
    }

    static void addBook() {
        while (true) {
            robot("*robot sounds*, you choice add book. Write book name:");
            list.add(checkNameBookAndAdd());
            while (true) {
                robot("Do you want add more books? Write Y or N like always");
                stopDublicateCode();
                String answ = sc.nextLine().trim();
                if (answ.equalsIgnoreCase("n")) {
                    return;
                } else if (answ.equalsIgnoreCase("y")) {
                    break;
                }
                errorRobotSay();
            }
        }
    }

    static String checkNameBookAndAdd() {
        String check;
        while (true) {
            robot("Remember, books has Rules:");
            rulesBooksName();
            System.out.println();
            stopDublicateCode();
            check = sc.nextLine().trim();
            if (checkBookInLibary(check)) {
                robot("Book already have in libary");
                continue;
            }
            char[] temp = check.toCharArray();
            if (check.length() == 2
                    && Character.isLetter(temp[0])) {
                robot("*bi-bip sounds* Book is add");
                break;
            } else if (check.length() > 2) {
                int tempCountSymbol = 0;
                int tempCountLetter = 0;
                for (char tempChar : temp) {
                    if (Character.isLetter(tempChar)) {
                        tempCountLetter++;
                    } else {
                        tempCountSymbol++;
                    }
                }
                if (tempCountSymbol < tempCountLetter) {
                    robot("Book is add");
                    break;
                }
            }
            errorRobotSay();
        }
        return check;
    }

    static void rulesBooksName() {
        System.out.println("\n".repeat(12));
        System.out.println("Rules of name book" +
                "\n1. Name must be more 1 symbol " +
                "\n2. If only two sybols: first symbol must be always be a letter " +
                "\n3. Letters must be more then another symbols" +
                "\n4. Books cannot be repeat if it have in library");

        pause(timeRobot + 2);
    }

    static void stopDublicateCode() {
        System.err.print("\n\nWrite here:");
    }


    static void deleteBook() {
        while (true) {
            robot("*Robot sounds*, you choice delete book. I show you list of books");
            showBooks();
            pause(timeRobot + 2);
            robot("Just write number of book you want to delete");
            stopDublicateCode();
            while (true) {
                int choice = checkDigit();
                if (choice <= 0 || choice > list.size()) {
                    errorRobotSay();
                    robot(String.format("Book number %d cannot be delete", choice));
                    continue;
                }
                list.remove(choice-1);
                break;
            }
            robot("Book was deleted");
            if (list.isEmpty()) {
                robot("Sorry, books are over");
                return;
            }
            while (true) {
                robot("Do you want delete more books? Write Y or N like always");
                System.out.println();
                stopDublicateCode();
                String answ = sc.nextLine().trim();
                if (answ.equalsIgnoreCase("n")) {
                    return;
                } else if (answ.equalsIgnoreCase("y")) {
                    continue;
                }
                errorRobotSay();
            }
        }
    }

    static void changeBookName() {
        while (true) {
            robot("*Robot sounds*, you choice change name book. I show you list of books");
            showBooks();
            pause(timeRobot + 2);
            robot("Just write number of book you want to change");
            stopDublicateCode();
            int choice;
            while (true) {
                choice = checkDigit();
                if (choice <= 0 || choice > list.size()) {
                    errorRobotSay();
                    robot(String.format("Book number %d cannot be change", choice));
                    continue;
                }
                break;
            }
            System.out.println();
            robot("Now write new name of book");
            list.set(choice-1, checkNameBookAndAdd());
            stopDublicateCode();
            robot("Do you want change more books? Write Y or N like always");
            System.out.println();
            stopDublicateCode();
            while (true) {
                String answ = sc.nextLine().trim();
                if (answ.equalsIgnoreCase("n")) {
                    return;
                } else if (answ.equalsIgnoreCase("y")) {
                    continue;
                }
                errorRobotSay();
            }
        }
    }

    static void findBookMenu() {
        robot("*Robot sounds*, you choice find book.");
        while (true) {
            robot("I can show you all books or you can write name of book");
            robot("Write \"show\", and i just show you books");
            robot("Or write  \"find\", and i try find it");
            System.out.println();
            stopDublicateCode();
            String choiceToFind = sc.nextLine().trim();
            if (choiceToFind.equalsIgnoreCase("show")) {
                showBooks();
                pause(2);
                robot("Do you want find more books? Y or N like always");
                stopDublicateCode();
                choiceToFind = sc.nextLine().trim();
                if (choiceToFind.equalsIgnoreCase("n")) {
                    break;
                } else if (choiceToFind.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    errorRobotSay();
                    robot("I back you to menu 5");
                }
            } else if (choiceToFind.equalsIgnoreCase("find")) {
                findBook();
                robot("Do you want find more books? Y or N like always");
                stopDublicateCode();
                choiceToFind = sc.nextLine().trim();
                if (choiceToFind.equalsIgnoreCase("n")) {
                    break;
                } else if (choiceToFind.equalsIgnoreCase("y")) {
                    continue;
                }
            }
            errorRobotSay();
        }
    }

    static void findBook() {
        System.out.println();
        robot("Write name book what you wanna find");
        stopDublicateCode();
        String bookCheck = sc.nextLine().trim();
        if (checkLibary(bookCheck)) {
            robot("I find you book!");
            return;
        }
        robot("Sorry, i don't find you book");
    }

    static boolean checkBookInLibary(String bookName) {
        if (list.isEmpty()) {
            return false;
        }

        if (checkLibary(bookName)) {
            robot("Please, write another book");
            return true;
        }

        return false;
    }

    private static boolean checkLibary(String bookNameCheck) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(bookNameCheck)) {
                return true;
            }
        }
        return false;
    }

    static void errorRobotSay() {
        robot("Sorry, you do mistake. Please try again");
    }

    static void showBooks() {
        robot("Now i show you books in library");
        pause(timeRobot);
        System.out.println("\n".repeat(12));
        System.out.println("Books in library:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(1 + i + " # of book  is " + list.get(i));
        }
        System.out.println();
        pause(timeRobot);
    }

    static boolean checkNullLibrary() {
        return list.size() == 0 ? true : false; // to stop duplicate code
    }

    static int checkNumberOfBook(int userNumber, int tempLength) {
        while (true)
            if (userNumber <= 0 || userNumber > tempLength) {
                errorRobotSay();
                stopDublicateCode();
                userNumber = checkDigit();
                continue;
            } else {
                break;
            }
        return userNumber;
    }

}




