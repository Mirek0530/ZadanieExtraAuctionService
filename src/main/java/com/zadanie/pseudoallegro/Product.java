package com.zadanie.pseudoallegro;

public class Product {
    private int productId;
    private String productCategory;
    private String productName;

    public Product(int productId, String productCategory, String productName) {
        this.productId = productId;
        this.productCategory = productCategory;
        this.productName = productName;
    }

    public String getProductName() {
        return this.productName;
    }
}
