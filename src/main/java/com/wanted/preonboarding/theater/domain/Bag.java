package com.wanted.preonboarding.theater.domain;
import com.wanted.preonboarding.theater.domain.Ticket.Ticket;

public class Bag {
    private Long amount;
    private final Invitation invitation;
    private Ticket ticket;

    public Bag(long amount){
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }
    public void takeTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }
    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }
    public void plusAmount(long amount) {
        this.amount += amount;
    }
}
