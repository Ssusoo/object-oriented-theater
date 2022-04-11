package me.ssu.objectoriented.domains.theater;

import me.ssu.objectoriented.domains.audience.Audience;
import me.ssu.objectoriented.domains.ticket.Ticket;
import me.ssu.objectoriented.domains.ticket.TicketSeller;

/**
 * Seventh, 소극장을 구현하는 Theater
 *  소극장은 먼저 관람객의 가방 안에 초대장이 들어 있는지 확인
 */
public class Theater {

    private TicketSeller ticketSeller;

    /**
     * 관람객을 입장시키는 극장 객체 상태
     * @param ticketSeller
     */
    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 입구 메서드
     * @param audience
     */
    public void enter(Audience audience) {
        // TODO 초대장이 있는 이벤트 관람객이면
        if (audience.getBag().hasInvitation()) {

            // TODO 판매원은 매표소에서 초대장을 티켓으로 교환해줌.
            Ticket ticket = ticketSeller.getTicketOffice().getTickets();

            // TODO 이벤트 관람객이면 초대장을 티켓으로 교환 후 가방에 넣음.
            audience.getBag().setTicket(ticket);

        // TODO 초대장이 없는 일반 관람객이면
        } else {
            // TODO 판매원은 매표소에서 티켓을 판매함.
            Ticket ticket = ticketSeller.getTicketOffice().getTickets();

            // TODO 일반 관람객은 가방에서 티켓 금액만큼 차감.
            audience.getBag().minusAmount(ticket.getFee());

            // TODO 판매원은 매표소에 티켓 금액만큼 증가.
            ticketSeller.getTicketOffice().plusAccount(ticket.getFee());

            // TODO 일반 관람객은 돈을 티켓으로 교환 후 가방에 넣음.
            audience.getBag().setTicket(ticket);
        }
    }
}
