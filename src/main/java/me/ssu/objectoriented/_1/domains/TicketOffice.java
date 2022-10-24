package me.ssu.objectoriented._1.domains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 매표소(TicketOffice)
public class TicketOffice {
	private Long amount;    // 현금(관객들에게 교환해줄 현금)
	private List<Ticket> tickets = new ArrayList<>();   // 티켓들(관객들에게 판매할 티켓)

	// TODO 1) 매표소에는 관람객에게 판매할 티켓들과 현금이 있어야 함
	public TicketOffice(Long amount, Ticket... tickets) {
		this.amount = amount;
		this.tickets.addAll(Arrays.asList(tickets));
	}

	// TODO 2) 티켓 판매
	//  (tickets 컬렉션에서 맨 첫 번째 위치에 저장된 Ticket을 반환하는 것으로 구현)
	public Ticket getTicket() {
		return tickets.remove(0);
	}

	// TODO 3) 판매금액 증가(티켓 판매 금액 보관)
	public void plusAmount(Long amount) {
		this.amount += amount;
	}

	// TODO 4) 판매금액 감소(티켓 판매 금액 보관)
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
}