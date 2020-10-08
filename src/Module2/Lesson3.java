package Module2;

public class Lesson3 {


    public static void main(String[] args) {
        Builder builder1 = new Builder("Ronald", 22);
        Builder builder2 = new Builder("Ronald", 23);
        Builder builder3 = new Builder("Matthew", 27);
        Doctor doctor1 = new Doctor("Steeve", 54);
        Doctor doctor2 = new Doctor("Alex", 59);
        Doctor doctor3 = new Doctor("Renata", 52);
        Module2.Lessons9.Programmer programmer1 = new Module2.Lessons9.Programmer("Eric", 43);
        Module2.Lessons9.Programmer programmer2 = new Module2.Lessons9.Programmer("Rita", 28);
        Module2.Lessons9.Programmer programmer3 = new Module2.Lessons9.Programmer("Misha", 64);
        builder1.build();
        builder2.workInfo();
        builder3.getName();
        doctor1.heal();
        doctor2.workInfo();
        doctor3.getName();
        programmer1.programming();
        programmer2.workInfo();
        programmer3.getName();
        doctor1.speak();
        doctor2.think();
        builder1.drag();
        programmer1.think();

        /*
        Question:  Can an abstract class be instantiated?
        Answer: Abstract classes cannot be instantiated.
        Question: Is it possible to define a constructor for an abstract class?
        Answer: Yes, an abstract class can have a constructor.
        Question: Can there be a non-abstract method in an abstract class?
        Answer: Yes, we can declare an abstract class with no abstract methods.
        Question: Can there be abstract and non-abstract methods in an abstract class?
        Answer: Yes, both methods can be declare in abstract class.
        Question: Can there be an abstract method in a non-abstract class?
        Answer: No.
        Question: Can a non-abstract method be overridden?
        Answer: Yes. We can use abstract method or override him.
        Question: Are all methods of an interface abstract?
        Answer: Methods in an interface that are not declared as default or static are implicitly abstract, so the abstract modifier is not used with interface methods.*[1]
        Question: Is it possible to create an interface without a method?
        Answer:  Yes, we can write an interface without any methods
        Question: What is the difference between an abstract class and an interface?
        Answer:
        If you choose the main difference:
        Interface:
        indicates to the class which methods must be used.
        What can be implemented as the creation of a contract, which the class must perform.
        A class can have several implementations of the interface.
        Also all variables in the interfaces have an implicit public static final call and all methods of public, which does not allow to implement encapsulation.

        Abstract class:
        The abstract class describes what the class can be and what behavior it can have.
        Only 1 parent can have a descendant, although an inheritance tree is possible.
        Access modifiers in the abstract class are selected explicitly, which gives the possibility of encapsulation.

        With 8 java added functionality that very much opens the boundaries of difference between them.







        *[1] Source: https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
         */
    }

}

abstract class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.printf("Hi, my name is %s. I'm %d years old.\n", getName(), getAge());
    }

    abstract void workInfo();

}

class Doctor extends Employee implements Intellectual {
    Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    void workInfo() {
        heal();
    }

    void heal() {
        System.out.println("Heal");
    }

}

class Builder extends Employee implements Strongman {
    Builder(String name, int age) {
        super(name, age);
    }

    @Override
    void workInfo() {
        build();
    }

    void build() {
        System.out.println("build");
    }
}

class Programmer extends Employee implements Intellectual {
    Programmer(String name, int age) {
        super(name, age);
    }


    @Override
    void workInfo() {
        programming();
    }

    void programming() {
        System.out.println("programming");
    }


}


interface Intellectual {
    default void think() {
        System.out.println("Thinks");
    }
}

interface Strongman {
    default void drag() {
        System.out.println("Drags");
    }
}


/* 0 11111
   0 01111
   0 11111


 */