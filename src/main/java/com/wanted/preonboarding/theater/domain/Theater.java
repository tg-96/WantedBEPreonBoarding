package com.wanted.preonboarding.theater.domain;

import com.wanted.preonboarding.theater.domain.Ticket.Ticket;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Theater {
    public void enter(Audience audience, TicketSeller ticketSeller) {
        //audience가 invitation 있다면 ticket을 공짜로 준다.
        if (audience.checkInvitation()) {
            Ticket ticket = ticketSeller.giveTicket(audience.showTicketName());
            audience.haveTicket(ticket);
            System.out.println("공짜");
            //audience가 invitation 없다면 ticket을 판매한다.
        } else {
            Ticket ticket = ticketSeller.sellTicket(audience.showTicketName());
            audience.buyTicket(ticket);
            System.out.println("돈냄");
        }
    }
}
