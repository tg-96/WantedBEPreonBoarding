package com.wanted.preonboarding.theater.domain;

import com.wanted.preonboarding.theater.domain.Ticket.Ticket;

public class TicketSeller {
    private final TicketOffice ticketOffice;
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
    public Ticket giveTicket(String ticketName){
        return ticketOffice.selectByTicketName(ticketName);
    }
    public Ticket sellTicket(String ticketName){
        Ticket ticket = ticketOffice.selectByTicketName(ticketName);
        ticketOffice.plusAmount(ticket.showFee());
        return ticket;
    }

}
