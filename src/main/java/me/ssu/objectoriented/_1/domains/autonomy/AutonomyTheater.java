package me.ssu.objectoriented._1.domains.autonomy;

import me.ssu.objectoriented._1.domains.TicketSeller;

// 자율성이 높은 소극장(AutonomyTheater)
public class AutonomyTheater {
	private TicketSeller ticketSeller;

	public AutonomyTheater(TicketSeller ticketSeller) {
		this.ticketSeller = ticketSeller;
	}

	// TODO 의존성이 높은 소극장의 입구 메소드 -> 판매원에게 역할로 주기
	//  enter -> sellTo로 수정
}