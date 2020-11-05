package Module3.Lesson2;

import java.util.*;

public class Task1 {
    LinkedList<Integer> linkedList = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();
    long timeStart;
    long timeOver;

    long takeTime() {
        return System.currentTimeMillis();
    }

    Integer randomNumber() {
        return new Random().nextInt();
    }

    Long anyListTimeAdd(List<Integer> list, int count) {
        timeStart = takeTime();
        while (count > 0) {
            list.add(randomNumber());
            count--;
        }
        timeOver = takeTime();
        return timeOver - timeStart;
    }

    Long listFind(List<Integer> list) {
        timeStart = takeTime();
        int randomNuber = new Task1().randomNumber();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == randomNuber) {
                break;
            }
        }
        //if we don't find random number, we check all collection
        timeOver = takeTime();
        return timeOver - timeStart;

    }


    static void resaultTime(Long linkedListTime, Long ArrayListTime, String name) {
        if (linkedListTime > ArrayListTime) {
            System.out.printf("ArrayList faster %s\n", name);
        } else {
            System.out.printf("LinkedList faster %s\n", name);
        }
        System.out.println("Time of Linked " + linkedListTime +
                "\nTime of ArrayList " + ArrayListTime);

    }

    Long removeElementsOfList(List<Integer> list) {
        timeStart = takeTime();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        timeOver = takeTime();
        return timeOver - timeStart;
    }
    Long removeElementsOfListWithIterator(List<Integer> list) {
        timeStart = takeTime();
        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            if(iterator.next() <0){
                iterator.remove();
            }
        }

        timeOver = takeTime();
        return timeOver - timeStart;
    }



    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int count = 100000; // how many object to create. Optimal number, my PC at ~15-20 sec
        //add function
        task1.resaultTime(task1.anyListTimeAdd(task1.linkedList, count),
                task1.anyListTimeAdd(task1.arrayList, count),
                "add"); // Results are close to each
        System.out.println("_".repeat(20));
        //find function
        task1.resaultTime(task1.listFind(task1.linkedList),
                task1.listFind(task1.arrayList),
                "Find");
        System.out.println("_".repeat(20));
        task1.resaultTime(task1.removeElementsOfList(task1.linkedList),
                task1.removeElementsOfList(task1.arrayList),
                "remove");
        System.out.println("_".repeat(20));
        task1.resaultTime(task1.removeElementsOfListWithIterator(task1.linkedList),
                task1.removeElementsOfListWithIterator(task1.arrayList),
                "remove with iterator");

    }


}
