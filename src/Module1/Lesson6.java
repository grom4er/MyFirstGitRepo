package Module1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lesson6 {
    static int[] CreateArray(int FromIndex, int toIndex) {
        int [] array;
        if(FromIndex <0){
             array = new int[toIndex+Math.abs(FromIndex)+1];
        }
        else {
            array = new int[toIndex];
        }
        for (int i = 0 ; i < array.length; i++) {
            array[i] = FromIndex;
            FromIndex++;
        }
        return array;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }

    private static void swap2(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
        if (indexA < 0 || indexB >= array.length) {
            System.out.format("%s (%d) incorrect!\n",
                    indexA < 0? "indexA" : "indexB", indexA<0? indexA:indexB);
        } else {
            int temp = array[indexA];
            array[indexA] = array[indexB];
            array[indexB] = temp;
            System.out.println("Result: " + Arrays.toString(array) + "\n");
        }
    }


    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        System.out.println(Arrays.toString(Lesson6.CreateArray(1, 10)));
        System.out.println("Another way: ");
        int[] array1 = IntStream.range(1, 11).toArray();
        System.out.println(Arrays.toString(array1));
        System.out.println("______________________________");


        //Task 2
        System.out.println("Task 2");
        int[] ArrayForTask2 = Lesson6.CreateArray(1, 10);
        int[] ArrayForTask2Answ = new int[10];
        int count = 0;
        for (int i = ArrayForTask2.length - 1; i >= 0; i--) {
            ArrayForTask2Answ[count] = ArrayForTask2[i];
            count++;
        }
        System.out.println(Arrays.toString(ArrayForTask2Answ));
        System.out.println("______________________________");


        //Task 3
        System.out.println("Task 3");
        int[] arrayTask3 = {1, 2, 3, 4, 5};
        swap(arrayTask3, 0, 1);
        int[] array2Task3 = new int[]{2, 3, 4, 5, 6, 10};
        swap(array2Task3, 2, 5);
        System.out.println("______________________________");

        //Task4
        System.out.println("Task 4");
        int[] array = {1, 2, 3};
        swap2(array, 1, 2);
        swap2(array, 1, 3);
        swap2(array, -1, 0);

        int[] array2 = new int[]{2, 4, 6, 8, 10};
        swap2(array2, 2, 3);
        swap2(array2, 4, 5);
        swap2(array2, -2, 0);
    }


    }


