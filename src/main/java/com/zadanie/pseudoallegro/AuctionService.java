package com.zadanie.pseudoallegro;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AuctionService {

    private HashMap<UUID, Auction> database;

    public AuctionService() {
        database = new HashMap<>();
    }

    public UUID createNewAuction(User user, String auctionName, Product product, double startPrice, boolean isBuyNowOption, boolean isBidOption) {
        Auction auction = new Auction(user, auctionName, product, startPrice, isBuyNowOption, isBidOption);
        UUID auctionId = UUID.randomUUID();
        database.put(auctionId, auction);

        return auctionId;
    }

    public void getAuction(UUID auctionId) {
        System.out.println(database.get(auctionId));
    }

    public void getAuctions() {
        for (Map.Entry<UUID, Auction> entry : database.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
/*
    public void search() {

    }
*/
    public void buy(Offer offer) {
        if (database.get(offer.getAuctionId()).isBuyNowOption() && offer.isBuyNow()) {
            System.out.println("Przedmiot zakupiony!");
            database.remove(offer.getAuctionId());
        } else {
            System.out.println("Aukcja nie zawiera opcji KUP TERAZ.");
        }
    }

    public void makeAnOffer(Offer offer, double amount) {
        if (database.get(offer.getAuctionId()).isBidOption() && offer.isBid()) {
            if (database.get(offer.getAuctionId()).getPrice() < amount) {
                database.get(offer.getAuctionId()).setPrice(amount);
                System.out.println("Stawka przyjęta, prowadzisz w licytacji.");
            } else {
                System.out.println("Proponowana stawka jest niższa niż aktualna wartość.");
            }
        } else {
            System.out.println("Auckcja nie zawiera opcji LICYTUJ.");
        }
    }
}
