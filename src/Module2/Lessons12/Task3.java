package Module2.Lessons12;

import java.util.List;

public class Task3 {
    static void sum(List<? extends Number> list) {
        double sum = 0;
        for (Number i: list)
        {
            sum+=i.doubleValue();
        }

        System.out.println("sum is " + sum);

    }
    public static void printOnlyInteger(List<? super Integer> list)
    {
        System.out.println(list);
    }
     static void printAnyList(List<?> list)
    {
        System.out.println(list);
    }
}
