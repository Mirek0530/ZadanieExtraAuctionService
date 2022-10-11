package com.zadanie.pseudoallegro;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class PseudoAllegroApplication {

    public static void main(String[] args) {
        AuctionService auctionService = new AuctionService();
        User user1 = new User(514231, "Mirek0530");
        User user2 = new User(548901, "JackSparrow_03");
        User user3 = new User(697803, "MickeyMouse");

        Product product1 = new Product(341523, "Gry i konsole", "XBOX Series X");
        Product product2 = new Product(553212, "Elektronika", "Redmi Note 7");
        Product product3 = new Product(674532, "Kosmetyki", "Lacoste L12.12");
        Product product4 = new Product(877544, "Gry i konsole", "Red Dead Redemption 2 - XBOX Version");
        Product product5 = new Product(131253, "Elektronika", "iPhone 12 mini");

        UUID auctionId1 = auctionService.createNewAuction(user1, "Konsola XBOX Series X OKAZJA!", product1, 1599.00, false, true);
        UUID auctionId2 = auctionService.createNewAuction(user2, "Redmi Note 7 używany, sprawny", product2, 699.00, true, true);
        UUID auctionId3 = auctionService.createNewAuction(user3, "Perfumy męskie Lacoste", product3, 299.00, true, false);
        UUID auctionId4 = auctionService.createNewAuction(user1, "RDR2 Xbox - płyta blu-ray", product4, 99.00, true, false);
        UUID auctionId5 = auctionService.createNewAuction(user2, "iPhone 12 mini uszkodzony", product5, 899.00, true, true);

        auctionService.getAuction(auctionId3);

        auctionService.getAuctions();

        //auctionService.search();

        Offer offer1 = new Offer(user1, auctionId2, true, false);

        auctionService.buy(offer1);

        Offer offer2 = new Offer(user3, auctionId1, false, true);

        auctionService.makeAnOffer(offer2, 1650.00);

    }

}
