package Module2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * (we can change any Parameter)
 * Let apartment have max is 200
 * Let floor be max 14
 * Let numbers of rooms be max 6
 * let life time of home be min 25 and max is 125
 */

public class Lessons6 {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Home home = new Home((randomOfMax(200)), randomOfMax(60.0), randomOfMax(14), randomOfMax(6), randomStreet(), randomNameBuild(), randomOfMax(25, 100));
            home.addArrayOfHome(home);
        }
        // must stop dublicate code ((
        //  Home.showAllBuilding(); //- if need check all.
        //  Home.forTaskA(5); // for task A
        //  Home.forTaskB(4,2,10); // for task B
        // Home.forTaskC(32.9); // for task C
    }


    static int randomOfMax(int numb) {
        return 1 + (int) (Math.random() * numb);
    }

    static double randomOfMax(double numb) {
        int tempValue = (int) (100 * (20 + (Math.random() * numb)));
        return (double) (tempValue) / 100;
    }

    static int randomOfMax(int min, int max) {
        return min + (int) (Math.random() * max);
    }

    static String randomNameBuild() {
        return Math.random() > 0.5 ? "new" : "old";
    }

    static String randomStreet() {
        /**
         * names was take from website https://www.nlc.org/most-common-us-street-names
         */
        String[] namesOfStreet = {"Second", "Third", "First", "Fourth", "Park", "Fifth",
                "Main", "Sixth", "Oak", "Seventh", "Pine", "Maple", "Cedar", "Eighth",
                "Elm", "View", "Washington", "Ninth", "Lake", "Hill"};
        return namesOfStreet[(int) (Math.random() * namesOfStreet.length)];
    }
}

class Home {
    private static int id = 0;
    private int homeID;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int numbersOfRoom;
    private String street;
    private String buildingType;
    private int lifeTime;
    private static ArrayList<Home> arrayOfHome = new ArrayList<>();


    public ArrayList<Home> getArrayOfHome() {
        return arrayOfHome;
    }

    public void setArrayOfHome(ArrayList<Home> arrayOfHome) {
        this.arrayOfHome = arrayOfHome;
    }

    public Home() {
    }

    static void showAllBuilding() {
        Home home = new Home();
        for (Home homeTest : home.getArrayOfHome()) {
            System.out.println(homeTest);
        }
    }

    public Home(int apartmentNumber, double area, int floor, int numbersOfRoom, String street, String buildingType, int lifeTime) {
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numbersOfRoom = numbersOfRoom;
        this.street = street;
        this.buildingType = buildingType;
        this.lifeTime = lifeTime;
        id++;
        this.homeID = id;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id = " + homeID +
                ", apartmentNumber = " + apartmentNumber +
                ", area = " + area +
                ", floor = " + floor +
                ", numbersOfRoom = " + numbersOfRoom +
                ", street = " + street +
                ", buildingType = " + buildingType +
                ", lifeTime = " + lifeTime +
                '}';
    }


    public int getHomeID() {
        return homeID;
    }

    public void setHomeID(int homeID) {
        this.homeID = homeID;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumbersOfRoom() {
        return numbersOfRoom;
    }

    public void setNumbersOfRoom(int numbersOfRoom) {
        this.numbersOfRoom = numbersOfRoom;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public void addArrayOfHome(Home homeArray) {
        ArrayList<Home> tempArray = new ArrayList<>();
        tempArray = homeArray.getArrayOfHome();
        tempArray.add(homeArray);
        homeArray.setArrayOfHome(tempArray);
    }

    public static void forTaskA(int findRoom) {
        if (findRoom <= 0 || findRoom > 6) {
            System.out.println("Sorry, you number not found");
            return;
        }
        ArrayList<Home> tempArray = new ArrayList<>();
        for (Home tempHome : arrayOfHome) {
            if (tempHome.getNumbersOfRoom() == findRoom) {
                tempArray.add(tempHome);
            }
        }
        if (tempArray.size() == 0) {
            System.out.println("Sorry, you number not found");
        } else {
            System.out.println("We find rooms. List of them:");
            for (Home tempHome : tempArray) {
                System.out.println(tempHome);
            }
        }
    }

    public static void forTaskB(int findRoom, int fromFlorr, int toFloor) {
        if (findRoom <= 0 || findRoom > 6 || fromFlorr <= 0 || toFloor > 14) {
            System.out.println("Sorry, you number not found");
            return;
        }
        ArrayList<Home> tempArray = new ArrayList<>();
        for (Home tempHome : arrayOfHome) {
            if (tempHome.getNumbersOfRoom() == findRoom && (tempHome.getFloor() >= fromFlorr && tempHome.getFloor() <= toFloor)) {
                tempArray.add(tempHome);
            }
        }
        if (tempArray.size() == 0) {
            System.out.println("Sorry, you number not found");
        } else {
            System.out.println("We find rooms. List of them:");
            for (Home tempHome : tempArray) {
                System.out.println(tempHome);
            }
        }

    }

    public static void forTaskC(double area) {
        if (area < 20 || area > 60) {
            System.out.println("Sorry, you number not found");
            return;
        }
        ArrayList<Home> tempArray = new ArrayList<>();
        for (Home tempHome : arrayOfHome) {
            if (tempHome.getArea() > area) {
                tempArray.add(tempHome);
            }
        }
        if (tempArray.size() == 0) {
            System.out.println("Sorry, you number not found");
        } else {
            System.out.println("We find apartments with an area exceeding the specified one. List of them:");
            for (Home tempHome : tempArray) {
                System.out.println(tempHome);
            }
        }

    }
}

/*
Question
1) Why has object-oriented programming replaced procedural programming?
Answer:
(3) OOP reduces the complexity of software development

Question
2) Which of the following is an advantage of OOP?
Answer:
(3) increase the speed of program execution

Question
3) Which of the following is a disadvantage of OOP?
Answer:
(2) unification of programs through standard components

Question
4) What are the benefits of providing access to class properties only through its methods?
Answer:
(1) you can control the correct values of the class fields

Question
5) Which statements about encapsulation are correct?
Answer:
(1) allows you to control the correct values ​​of the class fields
 */
