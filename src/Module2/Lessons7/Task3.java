package Module2.Lessons7;

class TestGarage{
    public static void main(String[] args) {
        Audi car = new Audi(10,"v12",200);
        MercedesBenz truck = new MercedesBenz(15,"V20",200);
        VolgaBus bus = new VolgaBus(20,"v16",20);
        MiniGarage miniGarage = new MiniGarage();
        Garage garage = new Garage();
        BigGarage bigGarage = new BigGarage();
        miniGarage.enter(car);
        miniGarage.leave(car);
        garage.enter(truck);
        garage.leave(truck);
        bigGarage.enter(car, bus);
        bigGarage.leave(car,bus);
    }
}
