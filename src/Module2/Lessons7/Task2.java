package Module2.Lessons7;

interface garageFunction {
    boolean enterGarage(Vehicle vehicle);

    boolean leaveGarage();

    default void enterText(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName() + " is parking");
    }

    default void leaveText(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName() + " is leave parking");
    }
}


class MiniGarage implements garageFunction {
    protected Vehicle tempVehicle;

    boolean enter(Vehicle vehicle) {
        return vehicle instanceof Car;
    }

    public boolean enterGarage(Vehicle vehicle) {
        if (!enter(vehicle)) {
            System.out.println("Sorry, that vehicle cannot be here");
            return false;
        }
        if (tempVehicle == null) {
            tempVehicle = vehicle;
            enterText(vehicle);
            return true;
        } else {
            System.out.println("Sorry, no space in Garage");
            return false;
        }
    }


    public boolean leaveGarage() {
        if (tempVehicle == null) {
            System.out.println("Nothing to leave");
            return false;
        } else {
            leaveText(tempVehicle);
            tempVehicle = null;
            return true;
        }
    }

}

class MidGarage extends MiniGarage {
    @Override
    boolean enter(Vehicle vehicle) {
        return vehicle instanceof Car || vehicle instanceof Truck;
    }
}

class BigGarage extends MidGarage {
    protected Vehicle tempVehicleTwo;

    @Override
    boolean enter(Vehicle vehicle) {
        return true;
    }




}


