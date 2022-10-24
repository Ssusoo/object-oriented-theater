package me.ssu.objectoriented._1.domains.autonomy;

import me.ssu.objectoriented._1.domains.Audience;

// 자율성이 높은 소극장(AutonomyTheater)
public class AutonomyTheater {
	// TODO 1) 자율성이 높은 판매원
	private AutonomyTicketSeller autonomyTicketSeller;

	// TODO 2) 자율성이 높은 판매원 파라미터의 생성자
	public AutonomyTheater(AutonomyTicketSeller autonomyTicketSeller) {
		this.autonomyTicketSeller = autonomyTicketSeller;
	}

	// TODO 2) 의존성이 높은 소극장의 입구 메소드 -> 판매원에게 역할로 주기
	//  입구(enter) 메소드 의존성 낮추기
	//  소극장(AutonomyTheater)은 더 이상 매표소(TicketOffice)에 접근하지 않는다.
	// TODO 결론?
	//  1) 소극장의 입장에서 매표소가 판매원 내부에 존재한다는 사실을 모른다.
	//  2) 단지, 소극장의 상황에서는 판매원이 sellTo() 메소드를 이해하고 응답할 수 있다는 사실만 알고 있다.
	public void enter(Audience audience) {
		autonomyTicketSeller.sellTo(audience);
	}
}