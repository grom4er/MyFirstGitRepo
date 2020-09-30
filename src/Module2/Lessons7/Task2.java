package Module2.Lessons7;

interface garageFunctionMiniGarage {
    boolean enterGarage(Car car);

    boolean leaveGarage();

    default void vehicleEnterText(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName() + " is parking");
    }

    default void vehicleLeaveText(String name) {
        System.out.println(name + " is out of garage");
    }


}

interface garageFunctionGarage extends garageFunctionMiniGarage {
    boolean enterGarage(Truck truck);

    boolean leaveGarage();
}

interface garageFunctionBigGarage  {
    boolean enterGarage(Vehicle vehicleFirst, Vehicle vehicleSecond);

    boolean enterGarage(Vehicle vehicle);

    boolean leaveGarage(Vehicle vehicle);

    boolean leaveGarage(Vehicle vehicleFirst, Vehicle vehicleSecond);

    default void vehicleEnterText(Vehicle vehicleOne, Vehicle vehicleTwo) {
        System.out.println(vehicleOne.getClass().getSimpleName()
                +  " and  "
                + vehicleTwo.getClass().getSimpleName()
                +" is parking");
    }

    default void vehicleLeaveText(String nameVehicleOne, String nameVehicleTwo) {
        System.out.println(nameVehicleOne + " and " + nameVehicleTwo + " is out of garage");
    }
    default void vehicleEnterText(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getSimpleName() + " is parking");
    }

    default void vehicleLeaveText(String name) {
        System.out.println(name + " is out of garage");
    }
}


class MiniGarage implements garageFunctionMiniGarage {
    protected String vehicleName;
    protected boolean vehicleInGarage = false;

    @Override
    public boolean enterGarage(Car car) {

        if (!vehicleInGarage) {
            this.vehicleName = car.getClass().getSimpleName();
            vehicleEnterText(car);
            vehicleInGarage = true;
            return true;
        } else {
            System.out.println("No space in the garage. Wait when vehicle leave Garage");
            return false;
        }
    }

    @Override
    public boolean leaveGarage() {
        if (!vehicleInGarage) {
            System.out.println("No vehicle in garage");
            return false;
        } else {
            vehicleLeaveText(vehicleName);
            vehicleInGarage = false;
            vehicleName = "";
            return true;
        }

    }

}

class Garage extends MiniGarage implements garageFunctionGarage {
    @Override
    public boolean enterGarage(Truck truck) {
        this.vehicleName = truck.getClass().getSimpleName();
        if (!vehicleInGarage) {
            vehicleEnterText(truck);
            vehicleInGarage = true;
            return true;
        } else {
            System.out.println("No space in the garage. Wait when vehicle leave Garage");
            return false;
        }
    }


}

class BigGarage  implements garageFunctionBigGarage {
    private int countOfVehicleInGarage = 0;
    @Override
    public boolean enterGarage(Vehicle vehicleFirst, Vehicle vehicleSecond) {
        if(countOfVehicleInGarage != 0){
            System.out.println("No space in the garage. Wait when vehicle leave Garage\"");
            return false;
        }
        else {
            vehicleEnterText(vehicleFirst, vehicleSecond);
            countOfVehicleInGarage = 2;
            return true;
        }
    }

    @Override
    public boolean enterGarage(Vehicle vehicle) {
       if(countOfVehicleInGarage == 2){
           System.out.println("No space in the garage. Wait when vehicle leave Garage\"");
           return false;
       }
       else {
           vehicleEnterText(vehicle);
           countOfVehicleInGarage++;
           return true;
       }
    }

    @Override
    public boolean leaveGarage(Vehicle vehicle) {
        if(countOfVehicleInGarage == 0){
            System.out.println("No vehicle in garage");
            return false;
        }
        else {
            vehicleLeaveText(vehicle.getClass().getSimpleName());
            countOfVehicleInGarage--;
            return true;
        }
    }

    @Override
    public boolean leaveGarage(Vehicle vehicleFirst, Vehicle vehicleSecond) {
        if(countOfVehicleInGarage < 2){
            System.out.printf("In garage %s vehicle. Try another method",
                    countOfVehicleInGarage == 0? "Zero" : "One");
            return false;
        }
        else {
            vehicleLeaveText(vehicleFirst.getClass().getSimpleName(),
                    vehicleSecond.getClass().getSimpleName());
            countOfVehicleInGarage = 0;
            return true;
        }
    }
}
