package me.ssu.objectoriented._1.domains.encapsulation;

import me.ssu.objectoriented._1.domains.Invitation;
import me.ssu.objectoriented._1.domains.Ticket;

// 캡슐화한 가방
public class EncapsulationBag {
	private Long amount;                // 현금
	private Ticket ticket;              // 관람권(티켓)
	private Invitation invitation;      // 초대장

	// TODO 1) 초대장 존재 유무(public -> private)
	private boolean hasInvitation() {
		return invitation != null;  // 초대장이 없으면 true
	}

	// TODO 2) 초대장을 입장권으로 교환하는 메소드(public -> private)
	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	// TODO 3) 현금을 증가(환불)(public -> private)
	private void plusAmount(Long amount) {
		this.amount += amount;
	}

	// TODO 4) 현금을 감소(지불)(public -> private)
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}

	// TODO 5)와 6)의 경우 7) 이벤트 관람객인지 일반 관람객인지 구분하는 로직 때문에 필요가 없음.
	// TODO 5) 이벤트에 당첨된 관람객의 경우(초대장과 현금)
	//	public EncapsulationBag(Invitation invitation, Long amount) {
	//		this.invitation = invitation;
	//		this.amount = amount;
	//	}

	// TODO 6) 이벤트에 당첨되지 않은 관람객의 경우(현금만)
	//	public EncapsulationBag(Long amount) {
	//		this(null, amount);
	//	}

	// TODO 7) EncapsulationAudience의 buy() 메소드에서 bag 관련 캡슐화하기
	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			// 티켓 구매
			setTicket(ticket);
			// 이벤트 교환권으로 인해 0원 리턴하기
			return 0L;
		} else {
			// 티켓 구매
			setTicket(ticket);
			// 티켓 구매로 인한 차감 금액
			minusAmount(ticket.getFee());
			// 차감 금액 리턴하기
			return ticket.getFee();
		}
	}
}