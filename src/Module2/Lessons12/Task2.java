package Module2.Lessons12;

import java.util.List;

public class Task2 {
    static <T> void fill(List<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }
}
