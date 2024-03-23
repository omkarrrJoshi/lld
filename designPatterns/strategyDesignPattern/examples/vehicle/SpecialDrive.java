package designPatterns.strategyDesignPattern.examples.vehicle;

public class SpecialDrive implements DriveStrategy{

    @Override
    public String drive() {
        return "special drive";
    }
    
}
