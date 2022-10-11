package com.zadanie.pseudoallegro;

public class Auction {
    private User user;
    private String auctionName;
    private Product product;
    private double price;
    private boolean hasBuyNowOption;
    private boolean hasBidOption;

    public Auction(User user, String auctionName, Product product, double price, boolean hasBuyNowOption, boolean hasBidOption) {
        this.user = user;
        this.auctionName = auctionName;
        this.product = product;
        this.price = price;
        this.hasBuyNowOption = hasBuyNowOption;
        this.hasBidOption = hasBidOption;
    }

    public boolean isBuyNowOption() {
        return this.hasBuyNowOption;
    }

    public boolean isBidOption() {
        return this.hasBidOption;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return "User ID: " + this.user + ", Auction: \"" + this.auctionName + "\", Product: " + this.product.getProductName() + ", Price: " + price + ", BuyNow: " + hasBuyNowOption + ", BidOption: " + hasBidOption;
    }
}
