package me.ssu.objectoriented._1.domains.autonomy;

import me.ssu.objectoriented._1.domains.Audience;
import me.ssu.objectoriented._1.domains.Ticket;
import me.ssu.objectoriented._1.domains.TicketOffice;

// 판매원(TicketSeller) 1)과 2)
// 자율성이 높은 판매원으로 클래스명 수정(AutonomyTicketSeller)
public class AutonomyTicketSeller {

	private TicketOffice ticketOffice;

	// TODO 1) 판매원은 자신이 일하는 매표소(TicketOffice)를 알고 있어야 함.
	public AutonomyTicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	// TODO 2) 자율성 주면서 삭제됨. 판매원은 자신이 일하는 매표소(TicketOffice)의 정보를 알고 있어야 함.
	// TODO 삭제된 이유는?
	//  퍼플픽이던 매표소 정보를 직접 접근 할 수 없다.
	//  결과적으로 판매원을 통해서만 '매표소 정보'를 접근할 수 있다.
	//	public TicketOffice getTicketOffice() {
	//		return ticketOffice;
	//	}

	// TODO 3) 관람객
	public void sellTo(Audience audience) {
		if (audience.getBag().hasInvitation()) {
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().setTicket(ticket);
		} else {
			Ticket ticket = ticketOffice.getTicket();
			audience.getBag().minusAmount(ticket.getFee());
			ticketOffice.plusAmount(ticket.getFee());
			audience.getBag().setTicket(ticket);
		}
	}
}