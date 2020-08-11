package Module2;

import java.util.Arrays;
import java.util.Date;

public class Lesson1 {

    public static void main(String[] args) {
        Person person1 = new Person("Duno", 20);
        person1.meditaion();
        Cat cat1 = new Cat("Murka", 2, Cat.Breed.SIAMESE, person1);
        System.out.println(cat1.toString());
        Person[] people = new Person[6];
        people[0] = person1;
        people[1] = new Person("Ara", 55);
        people[2] = new Person("Tikidok", 22);
        people[3] = new Person("Dimooon", 22);
        people[4] = new Person("Edick", 25);
        people[5] = new Person("Rumba", 44);
        Person.sortByName(people);
        System.out.println("After sorting by name:");
        System.out.println(Arrays.toString(people));
        Person.sortByAge(people);
        System.out.println("After sorting by age:");
        System.out.println(Arrays.toString(people));

    }
}

class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void meditaion() {
        Date date = new Date();
        System.out.printf("I think - it means I exist. (%s) %s \n", this.name, date.toString());
    }

    static void sortByAge(Person[] people) {
        int[] sortAge = new int[people.length];
        for (int i = 0; i < sortAge.length; i++) {
            sortAge[i] = people[i].age;
        }
        Arrays.sort(sortAge);
        for (int i = 0; i < sortAge.length; i++) {
            int count = i;
            while (true) {
                if (sortAge[i] == people[count].age) {
                    if (i != 0
                            && count != sortAge.length
                            && myEquals(people[count], people[count - 1])) {
                        count++;
                        continue;
                    }
                    Person temp = people[i];
                    people[i] = people[count];
                    people[count] = temp;
                    break;
                } else {
                    count++;
                }
            }
        }

    }

   static void sortByName(Person[] people) {
        String[] name = new String[people.length];
        for (int i = 0; i < name.length; i++) {
            name[i] = people[i].name;
        }
        Arrays.sort(name);

        for (int i = 0; i < name.length; i++) {
            int count = i;
            while (true) {
                if (name[i].equals(people[count].name)) {
                    if (i != 0
                            && count != name.length
                            && myEquals(people[count], people[count - 1])) {
                        count++;
                        continue;
                    }
                    Person temp = people[i];
                    people[i] = people[count];
                    people[count] = temp;
                    break;
                } else {
                    count++;
                }
            }
        }

    }

   static boolean myEquals(Person one, Person two) {
        if (one.name.equals(two.name) && one.age == two.age) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat {
    public enum Breed {
        SIAMESE,
        NEBELUNG,
        BIRMAN;
    }

    String catName;
    int catAge;
    Breed breed;
    Person personOwner;

    Cat(String catName, int catAge, Breed breed, Person personOwner) {
        this.catName = catName;
        this.catAge = catAge;
        this.breed = breed;
        this.personOwner = personOwner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                ", breed=" + breed +
                ", personOwner=" + personOwner +
                '}';
    }
}