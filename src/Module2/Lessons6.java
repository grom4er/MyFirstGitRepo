package Module2;

import java.util.ArrayList;
import java.util.List;

public class Lessons6 {
}

class Home {
    private int id;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int numbersOfRoom;
    private String street;
    private String buildingType;
    private int lifeTime;
    Home [] homeArray = new Home[50];



    public Home(int id, int apartmentNumber, double area, int floor, int numbersOfRoom, String street, String buildingType, int lifeTime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numbersOfRoom = numbersOfRoom;
        this.street = street;
        this.buildingType = buildingType;
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area='" + area + '\'' +
                ", floor=" + floor +
                ", numbersOfRoom=" + numbersOfRoom +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", lifeTime=" + lifeTime +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
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

    static Home[] arrayOfHome(Home home) {
        List<Home> array = new ArrayList<>();
        array.add(home);
        return array.toArray(Home[]::new);
    }
}
