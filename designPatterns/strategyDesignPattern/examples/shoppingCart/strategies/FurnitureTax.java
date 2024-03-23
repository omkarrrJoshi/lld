package designPatterns.strategyDesignPattern.examples.shoppingCart.strategies;

public class FurnitureTax implements TaxStrategy{

    @Override
    public double calculateTax(double price) {
        return price + 0.18 * price;
    }
    
}
