package designPatterns.strategyDesignPattern.examples.vehicle;

public class Main {
    public static void main(String[] args){
        DriveStrategy normalDrive  = new NormalDrive();
        DriveStrategy specialDrive = new SpecialDrive();

        Vehicle sportyVehicle = new SportVehicle(specialDrive);
        Vehicle passangerVehicle = new PassangerVehicle(normalDrive);
        Vehicle offRoadVehicle = new OffroadVehicle(specialDrive);

        sportyVehicle.drive();
        passangerVehicle.drive();
        offRoadVehicle.drive();
    }
}
