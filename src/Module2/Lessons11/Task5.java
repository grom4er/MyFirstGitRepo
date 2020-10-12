package Module2.Lessons11;

import java.lang.reflect.Modifier;

//Check if your class is an interface.
//Check if your class is an public.
//Check if your class is an static.
public class Task5 {

    static void isInterface(Class checkClass) {
        System.out.printf("%s is %s Interface\n", checkClass.getSimpleName(),
                checkClass.getModifiers() == Modifier.INTERFACE ? "" : "not");
    }

    static void isPublic(Class checkClass) {
        System.out.printf("%s is %s Public\n", checkClass.getSimpleName(),
                checkClass.getModifiers() == Modifier.PUBLIC ? "" : "not");
    }

    static void isStatic(Class checkClass) {
        System.out.printf("%s is %s Static\n", checkClass.getSimpleName(),
                checkClass.getModifiers() == Modifier.STATIC ? "" : "not");
    }

    public static void main(String[] args) {
        Class checkClass = new PersonTwo().getClass();
        isInterface(checkClass);
        isPublic(checkClass);
        isStatic(checkClass);


    }
}

