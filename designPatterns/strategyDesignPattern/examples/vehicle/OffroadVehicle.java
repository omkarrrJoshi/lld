package designPatterns.strategyDesignPattern.examples.vehicle;

public class OffroadVehicle implements Vehicle{

    DriveStrategy driveStrategy;

    public OffroadVehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        System.out.println("driving offroad vehicle with " + driveStrategy.drive());
    }

    @Override
    public void Display() {
        System.out.println("showing display of offroad vehicle");
    }
    
}
