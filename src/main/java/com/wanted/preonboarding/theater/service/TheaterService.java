package com.wanted.preonboarding.theater.service;
import com.wanted.preonboarding.theater.domain.*;
import com.wanted.preonboarding.theater.domain.Ticket.TicketA;
import com.wanted.preonboarding.theater.domain.Ticket.TicketB;
import com.wanted.preonboarding.theater.domain.Ticket.TicketC;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TheaterService {
    private final Theater theater;
    public String enter(boolean isInvite, String ticketName) {
        Audience audience;
        if(isInvite){
            audience = new Audience(new Bag(new Invitation(LocalDateTime.now()),10000L),ticketName);
        }else{
            audience = new Audience(new Bag(null,10000L),ticketName);
        }

        TicketSeller ticketSeller = new TicketSeller(new TicketOffice(0L,new TicketA(),new TicketB(),new TicketC()));

        theater.enter(audience,ticketSeller);

        return "have a good time.";
    }


}
