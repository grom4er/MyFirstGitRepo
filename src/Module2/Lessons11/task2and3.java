package Module2.Lessons11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class task2and3 {
    private static Person person = new Person();
    private static Class reflection = person.getClass();

    public static void main(String[] args) {

        try {
//           setAndPrintAge(18); // task age field
//           System.out.println(person.getAge()); // test Field

//           person.setName("Pavel"); // setter
//           getAndPrintName(); // task name field

//           person.setCompany("Apple"); // setter
//           printPrivateMethod(); // task print private method


//            printAllFields(); //Display all fields on the screen.

//            printAllPublicMethod(); // Display all PUBLIC methods of the Person class.

//            printAllMethods(); // Display all methods of the Person class.

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }


    }

    static void setAndPrintAge(int age) throws NoSuchFieldException, IllegalAccessException {
        Field fieldAge = reflection.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.set(person, age);
        System.out.println(fieldAge.get(person));
    }

    static void getAndPrintName() throws NoSuchFieldException, IllegalAccessException {
        Field fieldName = reflection.getDeclaredField("name");
        fieldName.setAccessible(true);
        System.out.println(fieldName.get(person));
    }

    static void printPrivateMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = reflection.getDeclaredMethod("getCompany");
        method.setAccessible(true);
        System.out.println((String) method.invoke(person));
    }

    static void printAllFields() {
        Field[] fieldsArray = reflection.getDeclaredFields();
        for (Field field : fieldsArray) {
            String tempName = field.getName();
            System.out.println(tempName);
        }
    }

    static void printAllPublicMethod() {
        Method[] methods = reflection.getMethods();
        for (Method tempMethod : methods) {
            if (tempMethod.getName().equals("wait")) {
                break;
            }
            System.out.println(tempMethod.getName());
        }
    }

    static void printAllMethods() {
        Method[] methods = reflection.getDeclaredMethods();
        for (Method tempMethod : methods) {
            if (tempMethod.getName().equals("wait")) {
                break;
            }
            System.out.println(tempMethod.getName());
        }
    }
}


