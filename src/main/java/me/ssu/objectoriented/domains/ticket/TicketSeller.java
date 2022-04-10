package me.ssu.objectoriented.domains.ticket;

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
     * @return
     */
    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
