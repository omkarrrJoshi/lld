package designPatterns.strategyDesignPattern.examples.vehicle;

public class NormalDrive implements DriveStrategy{

    @Override
    public String drive() {
        return "nromal drive";
    }
    
}
