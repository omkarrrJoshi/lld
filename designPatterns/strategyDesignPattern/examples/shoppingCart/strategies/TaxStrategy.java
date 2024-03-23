package designPatterns.strategyDesignPattern.examples.shoppingCart.strategies;

public interface TaxStrategy {
    public double calculateTax(double price);
}
