package me.ssu.objectoriented._1.manual;

public class _1_FullManual {
/* 1th, 관람객을 유치할 수 있는 로직(로직 구성 및 예외적인 상황)
로직 구성
	관람객을 유치할 수 있는 로직을 설정할 때
	초대장, 티켓, 가방, 관람객, 매표소, 판매원으로 구성한다.

	예외적인 상황은 이벤트 당첨된 관람객과 일반 관람객의 구분이 필요하다.
	이벤트 당첨된 관람객은 초대장을 갖고 있으며 그것을 티켓으로 교환받을 수 있다.
	반면 일반 관람객은 자신의 사비를 지불해 티켓을 구매할 수 있다.

	초대장에는 초대 일자가 있다.
	지불의 경우에는 현금(Amount).

관람객을 유치할 수 있는 로직의 예외적인 상황
——————————————————————————————————————————
	1) 입장 관객(예외)
		1-1) 이벤트 당첨 관객
			초대장 -> 티켓으로 교환
		1-2) 일반 관객
			티켓 구매
	2) 이벤트 여부 확인
		2-1) 이벤트 당첨 관객
			초대장 -> 티켓으로 교환
		2-2) 일반 관객
			티켓 구매
*/
}