package StrategyPattern_Right;

class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new SportVehicle();
        // this created the obj of SportVehicle and call the construtor which
        // assign made pass the obj of Special Drving to the Vehicle class
        //And now the vehicle class DriveStrategy has the obj of Special driving
        // so when calling the vehicle.drive we are calling the special driving method
        vehicle.drive();


        // agar normal drive ka chaihye to
        Vehicle v1=new PassengerVechical();
        v1.drive();
    }
}
