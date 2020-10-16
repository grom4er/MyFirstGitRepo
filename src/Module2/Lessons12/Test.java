package Module2.Lessons12;

import Module2.Lessons7.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //task1
        Triple<String, Integer, Boolean> test1 = new Triple<>("String", 12, true);
        System.out.println(test1.toString());
        Triple<Integer, Double, Boolean> test2 = new Triple<>(12, 55.2, true);
        System.out.println(test2.toString());
        Triple<Character, String, Integer> test3 = new Triple<>('a', "Some String", 66);
        System.out.println(test3.toString());

        //task2
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);
        Task2.fill(list,22);
        System.out.println(list);

        //task 3
        Task3.sum(list);
        List<String> listTest = new ArrayList<>();
        listTest.add("One");
        listTest.add("Two");
       // Task3.printOnlyInteger(listTest); - not work
        Task3.printOnlyInteger(list);
        Task3.printAnyList(list);
        Task3.printAnyList(listTest);

    }
}
