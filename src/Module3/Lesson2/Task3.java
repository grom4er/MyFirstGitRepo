package Module3.Lesson2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task3 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    private int count;

    Task3(int count) {
        this.count = count;
        createRandomNumbers();
        iteratorAndPrint();
    }


    void createRandomNumbers() {
        while (count > 0) {
            arrayList.add(createRandomNumber());
            count--;
        }
    }

    Integer createRandomNumber() {
        return new Random().nextInt();
    }

    void iteratorAndPrint() {
        System.out.println("Elemet's of list before iterator: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (!(iterator.next() % 2 == 0)) {
                iterator.remove();
            }
        }
        System.out.println("\nElemet's of list after iterator: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    public static void main(String[] args) {
    Task3 test =  new Task3(50);
    }
}
