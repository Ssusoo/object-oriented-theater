package me.ssu.objectoriented._1.domains;

// 소극장(Theater)
public class Theater {
	private TicketSeller ticketSeller;

	// TODO 1) 소극장에는 판매원이 있어야 함.
	public Theater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	// TODO 2) 입구(enter)
	public void enter(Audience audience) {
		// 관람객 가방에 초대권이 있으면 이벤트에 당첨된 관람객
		if (audience.getBag().hasInvitation()) {
			// 판매원에게 받은 티켓
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			// 티켓을 가방에 보관한 관람객
			audience.getBag().setTicket(ticket);
		} else {
			// 판매원에게 받은 티켓
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			// 티켓을 현금으로 구매한 관람객
			audience.getBag().minusAmount(ticket.getFee());
			// 티켓을 판매한 판매원

			//
			audience.getBag().setTicket(ticket);
		}
	}
}
