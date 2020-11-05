package Module3.Lesson2;


import java.util.ArrayList;


public class Task2 {
    ArrayList<String> list = new ArrayList<>();

    Task2() {
        for (int i = 0; i < 10; i++) {
            list.add(createRandomString());
        }
        checkValue();
    }

    private String createRandomString() {
        String res = "";
        int random = (int) (Math.random() * 10) + 1;
        for (int i = 0; i <= random; i++) {
            res += "A";
        }
        return res;
    }

    void checkValue() {
        int max = 0;
        int min = 1000;
        int maxPlace = -1;
        int minPlace = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxPlace = list.indexOf(list.get(i));
            }
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                minPlace = list.indexOf(list.get(i));
            }
        }
        System.out.println("Length elemenets of list:\n");
        for (String s : list) {
            System.out.print(s.length() + " ");
        }
        if (maxPlace > minPlace) {
            System.out.println("\nThe first was short. It: " + list.get(minPlace) + " it was in position: " + minPlace);
        } else {
            System.out.println("\nThe first was long. It: " + list.get(maxPlace)+ " it was in position: " + maxPlace);
        }


    }

    public static void main(String[] args) {
        Task2 test = new Task2();

    }
}
