package Module2.Lessons7;

interface garageFunctionMiniGarage {
    default boolean enter(Car car) {
        venicleEnter(car);
        return true;
    }

    default boolean leave(Car car) {
        vehicleLeave(car);
        return true;
    }

    default void venicleEnter(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName() + " is parking");
    }

    default void vehicleLeave(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName() + " is out of parking");
    }
}

interface garageFunctionGarage extends garageFunctionMiniGarage {
    default boolean enter(Truck truck) {
        venicleEnter(truck);
        return true;
    }

    default boolean leave(Truck truck) {
        vehicleLeave(truck);
        return true;
    }
}

interface garageFunctionBigGarage extends garageFunctionGarage {
    default boolean enter(Vehicle vehicleFirst, Vehicle vehicleSecond) {
        venicleEnter(vehicleFirst);
        venicleEnter(vehicleSecond);
        return true;
    }

    default boolean leave(Vehicle vehicleFirst, Vehicle vehicleSecond) {
        vehicleLeave(vehicleFirst);
        vehicleLeave(vehicleSecond);
        return true;
    }

}


class MiniGarage implements garageFunctionMiniGarage {
}

class Garage implements garageFunctionGarage {
}

class BigGarage implements garageFunctionBigGarage {
}
