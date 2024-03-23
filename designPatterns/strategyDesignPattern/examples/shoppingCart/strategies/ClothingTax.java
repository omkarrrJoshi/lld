package designPatterns.strategyDesignPattern.examples.shoppingCart.strategies;

public class ClothingTax implements TaxStrategy{

    @Override
    public double calculateTax(double price) {
        return price + 0.2 * price;
    }
    
}
