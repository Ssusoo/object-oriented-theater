package me.ssu.objectoriented._1.domains.depency;

import me.ssu.objectoriented._1.domains.Audience;
import me.ssu.objectoriented._1.domains.Ticket;
import me.ssu.objectoriented._1.domains.TicketSeller;

// 소극장(Theater)
public class DependencyTheater {
	private TicketSeller ticketSeller;

	// TODO 1) 소극장에는 판매원이 있어야 함.
	public DependencyTheater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	// TODO 2) 입구(enter)
	//  입구 로직 때문에 의존성이 높다. Theater -> DependencyTheater로 클래스 수정
	public void enter(Audience audience) {
		// 관람객 가방에 초대권이 있으면 이벤트에 당첨된 관람객
		if (audience.getBag().hasInvitation()) {
			// 판매원에게 받은 티켓
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			// 관람객의 가방에 교환 티켓 넣기
			audience.getBag().setTicket(ticket);
		} else {
			// 판매원에게 받은 티켓
			Ticket ticket = ticketSeller.getTicketOffice().getTicket();
			// 티켓을 현금으로 구매한 관람객
			audience.getBag().minusAmount(ticket.getFee());
			// 티켓을 판매한 판매원
			ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
			// 관람객의 가방에 구매 티켓 넣기
			audience.getBag().setTicket(ticket);
		}
	}
}