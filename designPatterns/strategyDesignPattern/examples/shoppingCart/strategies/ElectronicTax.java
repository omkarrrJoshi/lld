package designPatterns.strategyDesignPattern.examples.shoppingCart.strategies;

public class ElectronicTax implements TaxStrategy{

    @Override
    public double calculateTax(double price) {
        return price + 0.3 * price;
    }
    
}
