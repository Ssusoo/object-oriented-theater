package me.ssu.objectoriented._1.domains;

// 입장권(Ticket)
public class Ticket {
/* TODO Long(참조형 타입, Wrapper type)과 long(기본형 타입, Primitive type) 차이?
	1) Type
		Long vs long 등등
	2) 값 비교
	 2-1) Wrapper type == 불가능
	    -> .equals()로 비교 가능
	 2-2) Primitive type == 가능
*/
	private Long fee;   // 회비

	public Long getFee() {
		return fee;
	}
}