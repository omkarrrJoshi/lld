package designPatterns.strategyDesignPattern.examples.shoppingCart;

import java.lang.reflect.Array;
import java.util.*;

import designPatterns.strategyDesignPattern.examples.shoppingCart.cart.Cart;
import designPatterns.strategyDesignPattern.examples.shoppingCart.product.Product;
import designPatterns.strategyDesignPattern.examples.shoppingCart.productCategories.Clothings;
import designPatterns.strategyDesignPattern.examples.shoppingCart.productCategories.Electronic;
import designPatterns.strategyDesignPattern.examples.shoppingCart.productCategories.Furniture;
import designPatterns.strategyDesignPattern.examples.shoppingCart.productCategories.ProductCategory;
import designPatterns.strategyDesignPattern.examples.shoppingCart.strategies.ClothingTax;
import designPatterns.strategyDesignPattern.examples.shoppingCart.strategies.ElectronicTax;
import designPatterns.strategyDesignPattern.examples.shoppingCart.strategies.FurnitureTax;
import designPatterns.strategyDesignPattern.examples.shoppingCart.strategies.TaxStrategy;

public class Main {
    public static void main(String[] args) {
        TaxStrategy electronicsTax = new ElectronicTax();
        TaxStrategy clothingTax = new ClothingTax();
        TaxStrategy furnitureTax = new FurnitureTax();

        ProductCategory electronics = new Electronic("electronics", electronicsTax);
        ProductCategory clothings = new Clothings("clothings", clothingTax);
        ProductCategory firniture = new Furniture("furniture", furnitureTax);

        
        Product mobile = new Product("mobile", electronics, 10000);
        Product chair = new Product("chair", firniture, 1000);
        Product shirt = new Product("shirt", clothings, 100);

        Cart cart = new Cart();
        cart.addProduct(shirt, 5);
        cart.addProduct(chair, 2);
        cart.addProduct(mobile, 1);
        double totalPrice = cart.checkout();
        
        System.out.println("Total cart price: " + totalPrice);

    }
}
