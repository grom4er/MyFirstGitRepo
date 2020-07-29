import java.util.Scanner;


public class Lesson7 {
    static void CreateTreeWithWidth(int WidthTree) {
        String star = "*";
        String space = " ";
        int forSpace = WidthTree;
        System.out.println();

        for (int i = 1; i <= WidthTree; i += 2) {
            System.out.print(space.repeat(forSpace / 2) + star.repeat(i));
            forSpace -= 2;
            System.out.println();
        }
    }

    static void CreateTreeWithHeight(int HeightTree) {
        String star = "*";
        String space = " ";
        int forSpace = HeightTree * 2;
        for (int i = 1; i <= HeightTree * 2; i += 2) {
            System.out.print(space.repeat(forSpace / 2) + star.repeat(i));
            forSpace -= 2;
            System.out.println();
        }
    }

    static void CheckDigit(int userNumber) {
        int[] table = new int[10];
        while (userNumber != 0) {
            if (++table[userNumber % 10] > 1) {
                System.out.println("Yes");
                return;
            }
            userNumber /= 10;

        }
        System.out.println("No");
    }

    static void CheckPopulation(int BirthRate, int DeathRate, int Population, int Years) {
        for (int i = 0; i < Years; i++) {
            System.out.printf("Population was in %d year is %d \n", i, Population);
            Population+= ((Population / 1000) * BirthRate) - ((Population / 1000) * DeathRate);
            System.out.printf("Population %s %d \n"
                    ,i!=Years-1? "after year": "in the last year is"
                    ,Population);
        }




    }


    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        for (int i = 10; i <= 20; i++) {
            System.out.printf("Square of %d is %d. \n", i, i * i);
        }
        System.out.println("______________________________");

        //task 2
        System.out.println("Task 2");
        Scanner sc = new Scanner(System.in);
        int UserNumber = sc.nextInt();
        int NaturalOrder = 1;
        int MaxNaturalOrder = NaturalOrder;
        while (UserNumber >= MaxNaturalOrder) {
            System.out.printf("Sqare of %d is %d\n", NaturalOrder, MaxNaturalOrder);
            NaturalOrder++;
            MaxNaturalOrder = NaturalOrder * NaturalOrder;
        }
        System.out.println("______________________________");


        //task 3
        System.out.println("Task 3");
        int[] array = {10, 20, 15, 17, 24, 35};
        int mul = 1;
        for (int n : array) {
            mul *= n;
        }
        System.out.println(mul + " The multiplayes of array");
        System.out.println("______________________________");
        //task 4
        System.out.println("Task 4");
        //tree. Let tree has width = random number from 3 to 30; And we have it;
        int width = 3 + (int) (Math.random() * 30);
        // to be cool, tree width must odd, so if width is even, we just add +1;
        width = width % 2 == 0 ? width + 1 : width;
        System.out.println("width of tree is " + width);
        CreateTreeWithWidth(width);
        System.out.println();
        System.out.println("oh wait!  We loose tree width... but we find height of tree!");
        // let tree was height = random number from 2 to 20; And we have it;
        width = 0;
        int height = 2 + (int) (Math.random() * 15);
        System.out.println("height of tree is " + height);
        System.out.println();
        CreateTreeWithHeight(height);
        System.out.println("______________________________");
        //task 5
        System.out.println("Task 5");
        int sum = 0;
        Scanner sc2 = new Scanner(System.in);

        while (true) {
            int UserNumber2 = sc.nextInt();
            if (UserNumber2 == 0) {
                System.out.print("You write 0! Loop over \n");
                break;
            }
            sum += UserNumber2;
        }
        System.out.println("Summ of numbers is " + sum);

        System.out.println("______________________________");
        //task 6
        System.out.println("Task 6");
        int userNumbForTask6 = sc.nextInt();
        CheckDigit(userNumbForTask6);
        System.out.println("______________________________");
        //task 7
        System.out.println("Task 7");
       CheckPopulation(14,8, 10_000_000, 10);

    }


}


