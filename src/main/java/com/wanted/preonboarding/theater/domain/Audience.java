package com.wanted.preonboarding.theater.domain;
import com.wanted.preonboarding.theater.domain.Ticket.Ticket;

public class Audience {
    private final Bag bag;
    private String TicketName;
    public Audience(Bag bag,String buyTicketName){
        this.bag = bag;
        this.TicketName =buyTicketName;
    }

    public String showTicketName() {
        return TicketName;
    }

    public boolean checkInvitation(){
        return bag.hasInvitation();
    }

    public void buyTicket(Ticket ticket){
        bag.minusAmount(ticket.showFee());
        bag.takeTicket(ticket);
    }

    public void haveTicket(Ticket ticket){
        bag.takeTicket(ticket);
    }
}