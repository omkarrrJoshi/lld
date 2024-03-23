package designPatterns.strategyDesignPattern.examples.shoppingCart.productCategories;

import designPatterns.strategyDesignPattern.examples.shoppingCart.strategies.TaxStrategy;

public abstract class ProductCategory {
    String name;
    TaxStrategy taxStrategy;

    public ProductCategory(String name, TaxStrategy taxStrategy){
        this.name = name;
        this.taxStrategy = taxStrategy;
    }

    public abstract double calculateTax(double price);
}
