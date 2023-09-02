package com.wanted.preonboarding.theater.domain;
import com.wanted.preonboarding.theater.domain.Ticket.Ticket;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private long amount;
    private final List<Ticket> tickets;

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets = Arrays.asList(tickets);
    }

    public Ticket selectByTicketName(String ticketName) {
        return tickets.stream().filter(t -> t.getTicketName().equals(ticketName)).findFirst().get();
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }
}
