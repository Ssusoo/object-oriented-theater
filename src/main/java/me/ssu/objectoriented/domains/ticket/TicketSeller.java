package me.ssu.objectoriented.domains.ticket;

import me.ssu.objectoriented.domains.audience.Audience;

/**
 * Sixth Step, 판매원
 * 자신이 일하는 매표소를 알고 있어야 함.
 */
public class TicketSeller {

    private TicketOffice ticketOffice;  // 매표소

    /**
     * 판매원 객체 상태
     * @param ticketOffice
     */
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /**
     * 매표소의 상태를 볼 수 있는 판매원
     * TicketSeller에서 getTicketOffice 메서드가 제거된 이유?
     *  ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하게 됨.
     * @return
     */
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTO(Audience audience) {
        // TODO 초대장이 있는 이벤트 관람객이면
        if (audience.getBag().hasInvitation()) {

            // TODO 판매원은 매표소에서 초대장을 티켓으로 교환해줌.
//            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
            Ticket ticket = ticketOffice.getTickets();

            // TODO 이벤트 관람객이면 초대장을 티켓으로 교환 후 가방에 넣음.
            audience.getBag().setTicket(ticket);

        // TODO 초대장이 없는 일반 관람객이면
        } else {
            // TODO 판매원은 매표소에서 티켓을 판매함.
//            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
            Ticket ticket = ticketOffice.getTickets();

            // TODO 일반 관람객은 가방에서 티켓 금액만큼 차감.
            audience.getBag().minusAmount(ticket.getFee());

            // TODO 판매원은 매표소에 티켓 금액만큼 증가.
//            ticketSeller.getTicketOffice().plusAccount(ticket.getFee());
            ticketOffice.plusAccount(ticket.getFee());

            // TODO 일반 관람객은 돈을 티켓으로 교환 후 가방에 넣음.
            audience.getBag().setTicket(ticket);
        }
    }
}
