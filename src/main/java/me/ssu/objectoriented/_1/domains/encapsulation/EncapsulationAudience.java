package me.ssu.objectoriented._1.domains.encapsulation;

import me.ssu.objectoriented._1.domains.Audience;
import me.ssu.objectoriented._1.domains.Bag;
import me.ssu.objectoriented._1.domains.Ticket;

// 캡슐화한 관람객
// TODO 개선해야 하는 이유?
//  AutonomyTicketSeller는 관람객(Audience)의 getBag() 메소드를 호출해
//  1) 관람객 내부의 Bag 객체에 직접 접근한다.
//  2) Bag에 접근하는 객체가 AutonomyTheater에서 AutonomySeller로 역할만 바뀌었을 뿐임.
//  3) 자율적인 존재가 아님.
// TODO 해결방법?
//  1) Bag에 접근하는 모든 로직을 EncapsulationAudience에 buy 메소드 추가하기
//  2) AutonomyTicketSeller의 sellTo 메소드에서 getBag 메소드 접근하는 부분을 buy 메소드로 옮기기
public class EncapsulationAudience {
	private Bag bag;

	public EncapsulationAudience(Bag bag) {
		this.bag = bag;
	}

	// TODO 2) Audience가 직접 Bag를 처리하기 때문에 외부에서는 더 이상
	//  Audience가 Bag을 소유하고 있다는 사실을 알 필요가 없다.
	//	public Bag getBag() {
	//		return bag;
	//	}

	// TODO 3) Bag의 존재를 내부에서 캡슐화하기
	public Long buy(Ticket ticket) {
		if (bag.hasInvitation()) {
			bag.setTicket(ticket);
			return 0L;
		} else {
			bag.setTicket(ticket);
			bag.minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}
}