package designPatterns.strategyDesignPattern.examples.vehicle;

public class SportVehicle implements Vehicle{

    DriveStrategy driveStrategy;

    public SportVehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        System.out.println("driving sport vehicle with " + driveStrategy.drive());
    }

    @Override
    public void Display() {
        System.out.println("showing display of sporty vehicle");
    }
    
}
