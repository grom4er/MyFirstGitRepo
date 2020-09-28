package Module2.Lessons7;

abstract class Bus extends Vehicle {
    private int numberSeats;

    public int getNumberSeats() {
        return numberSeats;
    }


    public Bus(int size, String enginePower, int numberSeats) {
        super(size, enginePower);
        this.numberSeats = numberSeats;
    }
}
