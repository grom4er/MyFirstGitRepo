package Module2.Lessons7;

abstract class Truck extends Vehicle {
    private int maxWeight;

    public int getMaxWeight() {
        return maxWeight;
    }


    public Truck(int size, String enginePower, int maxWeight) {
        super(size, enginePower);
        this.maxWeight = maxWeight;
    }
}
