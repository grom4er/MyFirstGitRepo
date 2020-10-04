package Module2.Lessons7;

abstract class Garage {
    enum State {
        ALREADY,
        SUCCESS,
        FAIL
    }

    protected Vehicle[] parkingPlaces;

    Garage(int n) {
        parkingPlaces = new Vehicle[n];
    }

    protected State enterA(Vehicle v){

        for( int i = 0; i < parkingPlaces.length; ++i ){
            if( parkingPlaces[i] == v )
                return State.ALREADY;
        }
        for( int i = 0; i < parkingPlaces.length; ++i ){
            if( parkingPlaces[i] == null ){
                parkingPlaces[i] = v;
                return State.SUCCESS;
            }
        }

        return State.FAIL;
    }

    protected State leaveA(Vehicle v) {
        for (int i = 0; i < parkingPlaces.length; ++i) {
            if (parkingPlaces[i] == v) {
                parkingPlaces[i] = null;
                return State.SUCCESS;
            }
        }

        return State.FAIL;
    }
}

class MiniGarage extends Garage {
    MiniGarage() {
        super(1);
    }

    public boolean enter(Car car) {
        return super.enterA(car) == State.SUCCESS;
    }

    public boolean leave(Car car) {
        return super.leaveA(car) == State.SUCCESS;
    }
}

class MidGarage extends MiniGarage {
    public boolean enter(Truck truck) {
        return super.enterA(truck) == State.SUCCESS;
    }

    public boolean leave(Truck truck) {
        return super.leaveA(truck) == State.SUCCESS;
    }
}

class BigGarage extends Garage {

    BigGarage() {
        super(2);
    }

    public boolean enter(Vehicle... vehicle) {
        for (int i = 0; i < vehicle.length; i++) {
            if (super.enterA(vehicle[i]) != State.SUCCESS) {
                return false;
            }
            System.out.printf("%s enter the garage\n", vehicle[i].getClass().getSimpleName());
        }
        return true;
    }
    public boolean leave(Vehicle ...vehicles){
       boolean temp = false;
        for(int i = 0; i< vehicles.length; i++){
            if(super.leaveA(vehicles[i]) == State.SUCCESS){
                System.out.printf("%s vehicle leave\n", vehicles[i].getClass().getSimpleName());
                temp = true;

            }
        }
        return temp;
    }

}

