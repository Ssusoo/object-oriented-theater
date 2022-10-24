package me.ssu.objectoriented._1.domains;

// 판매원(TicketSeller)
public class TicketSeller {

	private TicketOffice ticketOffice;  // 매표소(TicketOffice)

	// TODO 1) 판매원은 자신이 일하는 매표소(TicketOffice)를 알고 있어야 함.
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	// TODO 2) 판매원은 자신이 일하는 매표소(TicketOffice)의 정보를 알고 있어야 함.
	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}
}