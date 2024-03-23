package designPatterns.strategyDesignPattern.examples.vehicle;

public class PassangerVehicle implements Vehicle{

    DriveStrategy driveStrategy;

    public PassangerVehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        System.out.println("driving passanger vehicle with " + driveStrategy.drive());
    }

    @Override
    public void Display() {
        System.out.println("showing display of passanger vehicle");
    }
    
}
