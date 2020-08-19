package Module2;

public class Lesson3 {

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
        System.out.printf("Hi, my name is s%. I'm %d years old.", name, age);
    }
    abstract void workInfo();

}

class Doctor extends Employee{

    Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    void workInfo() {
    heal();
    }
    void heal(){
        System.out.println("Heal");
    }

}

class Builder extends Employee{
    Builder(String name, int age) {
        super(name, age);
    }

    @Override
    void workInfo() {
        build();
    }
    void build(){
        System.out.println("build");
    }
}

class Programmer extends Employee{
    Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    void workInfo() {
        programming();
    }
    void programming(){
        System.out.println("programming");
    }

}