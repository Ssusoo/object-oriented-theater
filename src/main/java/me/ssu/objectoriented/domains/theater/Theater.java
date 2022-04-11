package me.ssu.objectoriented.domains.theater;

import me.ssu.objectoriented.domains.audience.Audience;
import me.ssu.objectoriented.domains.ticket.TicketSeller;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            ticketSeller.getTicketOffice().getTickets();
        }
    }
}
