package Module2.Lessons7;

abstract class Vehicle {
    private int size;
    private String enginePower;

    public Vehicle(int size, String enginePower) {
        this.size = size;
        this.enginePower = enginePower;
    }

    public int getSize() {
        return size;
    }


    public String getEnginePower() {
        return enginePower;
    }


}
