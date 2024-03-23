package designPatterns.strategyDesignPattern.examples.shoppingCart.product;

import designPatterns.strategyDesignPattern.examples.shoppingCart.productCategories.ProductCategory;

public class Product {
    String name;
    ProductCategory category;
    double price;

    public Product(String name, ProductCategory category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public double getPriceAfterTax(){
        return this.category.calculateTax(this.price);
    }

    public String getName(){
        return this.name;
    }

    public ProductCategory getCategory(){
        return this.category;
    }
}
