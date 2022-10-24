package me.ssu.objectoriented._1.domains.encapsulation;

import me.ssu.objectoriented._1.domains.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 캡슐화한 매표소
public class EncapsulationTicketOffice {
	private Long amount;    // 현금(관객들에게 교환해줄 현금)
	private List<Ticket> tickets = new ArrayList<>();   // 티켓들(관객들에게 판매할 티켓)

	// TODO 1) 매표소에는 관람객에게 판매할 티켓들과 현금이 있어야 함
	//	public EncapsulationTicketOffice(Long amount, Ticket... tickets) {
	//		this.amount = amount;
	//		this.tickets.addAll(Arrays.asList(tickets));
	//	}

	// TODO 2) 티켓 판매(public -> private)
	//  (tickets 컬렉션에서 맨 첫 번째 위치에 저장된 Ticket을 반환하는 것으로 구현)
	private Ticket getTicket() {
		return tickets.remove(0);
	}

	// TODO 3) 판매금액 증가(티켓 판매 금액 보관)(public -> private)
	private void plusAmount(Long amount) {
		this.amount += amount;
	}

	// TODO 4) 판매금액 감소(티켓 판매 금액 보관)(public -> private)
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}

	// TODO 5) 매표소 캡슐화로 인한 AutonomyTicketSeller 판매금액 증가 관련 메소드 수정
	public void sellTicketTo(EncapsulationAudience encapsulationAudience) {
		plusAmount(encapsulationAudience.encapsulationBagBuy(getTicket()));
	}
}