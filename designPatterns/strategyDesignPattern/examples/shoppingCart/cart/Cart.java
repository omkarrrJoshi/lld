package designPatterns.strategyDesignPattern.examples.shoppingCart.cart;

import java.util.*;

import designPatterns.strategyDesignPattern.examples.shoppingCart.product.Product;

public class Cart {
    Map<Product, Integer> map;

    public Cart(){
        this.map = new HashMap<>();
    }

    public void addProduct(Product product){
        int quantity = 1;
        if(map.containsKey(product)){
            quantity += map.get(product);
        }
        map.put(product, quantity);
    }

    public void addProduct(Product product, int quantity){
        if(map.containsKey(product)){
            quantity += map.get(product);
        }
        map.put(product, quantity);
    }

    public double checkout(){
        double totalPrice = 0;
        for(Product product: map.keySet()){
            int quantity = map.get(product);
            System.out.println("Product" + product.getName() + " with quanity " + quantity);
            System.out.println("Price of single unit without tax " + product.getPrice());
            System.out.println("Price of single unit with tax " + product.getPriceAfterTax());
            System.out.println("Price for " + quantity + " products: " + quantity * product.getPriceAfterTax());
            totalPrice += quantity * product.getPriceAfterTax();
            System.out.println();
        }
        return totalPrice;
    }
}
