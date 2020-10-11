package Module2.Lessons11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

class PersonTwo {
    private String name;
    private int age;
    private String company;


    public PersonTwo() {
    }

    public PersonTwo(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    private String getCompany() {
        return company;
    }
}

class Reflection {


    public static void main(String[] args) {
        try {
            PersonTwo testPersonOne = createObjectWithoutConstructor();
            PersonTwo testPersonTwo = createObjectWithConstructor();
            if (testPersonOne instanceof  PersonTwo && testPersonTwo instanceof PersonTwo) {
                System.out.println("Objects create сorrect");
            } else {
                System.out.println("Some problem");
            }
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }


    }

    static PersonTwo createObjectWithoutConstructor() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (PersonTwo) Class.forName("Module2.Lessons11.PersonTwo").newInstance();
    }
    static PersonTwo createObjectWithConstructor() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor constructor = PersonTwo.class.getConstructor(String.class, int.class, String.class);
        return (PersonTwo) constructor.newInstance("Pavel",22,"Aplle");
    }
}


