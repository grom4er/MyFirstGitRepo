package Module2.Lessons7;

abstract class Car extends Vehicle {
    private int maxSpeed;

    public Car(int size, String enginePower, int maxSpeed) {
        super(size, enginePower);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


}
