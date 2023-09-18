package com.mjc.stage2;

import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product e : filteredProducts) {
            if (filteringStrategy.filter(e)) {
                filteredProducts.add(e);
            }
        }
        return filteredProducts;
    }
    // Write your code here!
}
