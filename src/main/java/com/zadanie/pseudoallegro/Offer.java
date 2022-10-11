package com.zadanie.pseudoallegro;

import java.util.UUID;

public class Offer {
    private UUID offerId;
    private User user;
    private UUID auctionId;
    private boolean isBuyNow;
    private boolean isBid;

    public Offer(User user, UUID auctionId, boolean isBuyNow, boolean isBid) {
        this.user = user;
        this.auctionId = auctionId;
        this.isBuyNow = isBuyNow;
        this.isBid = isBid;
        offerId = UUID.randomUUID();
    }

    public UUID getOfferId() {
        return this.offerId;
    }

    public UUID getAuctionId() {
        return this.auctionId;
    }

    public boolean isBuyNow() {
        return this.isBuyNow;
    }

    public boolean isBid() {
        return this.isBid;
    }
}
