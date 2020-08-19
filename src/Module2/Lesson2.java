package Module2;

import java.util.Objects;

public class Lesson2 {
    public static void main(String[] args) {
        //task1
        System.out.println("Task1");
        Cat2 cat1 = new Cat2("Barsik", 2, "australian mist");
        Cat2 cat2 = new Cat2("Murka", 5, "american curl");
        Cat2 cat3 = new Cat2("Black", 1, "donskoy cat");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        // task 2
        System.out.println("_".repeat(10));
        System.out.println("Task2");
        Human human = new Human("Richard");
        System.out.println(human.hashCode());
        // task 3
        System.out.println("_".repeat(10));
        System.out.println("Task3");
        Dog dog1 = new Dog("Stuard");
        Dog dog2 = new Dog("Devid");
        Dog dog3 = new Dog ("Stuard");
        System.out.println(dog1.equals(dog2)); // must be false
        System.out.println(dog1.equals(dog3)); // must be true
        // task 4
        System.out.println("_".repeat(10));
        System.out.println("Task4");

        /*
      Object a = new Integer(100);  // Line1
      Object b = new Long(100);     // Line2
      Object c = new String("100"); // Line3
      a = null;                     // Line4 // null
      a = c;                        // Line5 // String "100"
      c = b;                        // Line6 // Long 100
      b = a;                        // Line7 // String "100";
      we loose Integer 100
         */
    }
}

// i make Cat2, because in Lesson1 have class Cat
class Cat2 {
    String name;
    int age;
    String breed;

    Cat2(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}

class Human {
    String name;

    Human(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Dog {
    String name;
    Dog(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }
}
