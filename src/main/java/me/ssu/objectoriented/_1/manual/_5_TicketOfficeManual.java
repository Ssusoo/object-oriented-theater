package me.ssu.objectoriented._1.manual;

public class _5_TicketOfficeManual {
/* 5. 매표소(TicketOffice)
	: 관람객(Audience)이 소극장에 입장하기 위해서 매표소(TicketOffice)에서
	: 초대장을 티켓으로 교환하거나 구매해야 함.
	: 매표소에서는 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관 되어 있어야 함.
	: 판매하거나
	5-1) 변수
		5-1)-1. 현금(Amount)
		5-1)-2. 티켓(Tickets)
			-> 판매하거나 교환해 줄 티켓의 목록이 있어야함.
	5-2) 메소드
		5-2)-1. 판매 금액 증가, plusAmount(현금), +=
		5-2)-2. 판매 금액 감소, minusAmount(현금), -=
		5-2)-3. 티켓을 판매, getTicket
			-> tickets 컬렉션에서 맨 첫 번째 위치에 저장된 Ticket을 반환하는 것으로 구현
			return tickets.remove(0);
	5-3) 생성자
        5-3)-1. 매표소, TicketOffice(현금, 티켓들)
*/
}