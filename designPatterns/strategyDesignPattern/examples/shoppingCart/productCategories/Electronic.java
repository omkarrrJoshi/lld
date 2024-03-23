package designPatterns.strategyDesignPattern.examples.shoppingCart.productCategories;

import designPatterns.strategyDesignPattern.examples.shoppingCart.strategies.TaxStrategy;

public class Electronic extends ProductCategory{

    public Electronic(String name, TaxStrategy taxStrategy) {
        super(name, taxStrategy);
    }

    @Override
    public double calculateTax(double price) {
        return this.taxStrategy.calculateTax(price);
    }
    
}
