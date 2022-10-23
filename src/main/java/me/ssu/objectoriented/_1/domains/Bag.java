package me.ssu.objectoriented._1.domains;

// 가방 or 소지품(Bag)
public class Bag {
	private Invitation invitation;  // 초대장
	private Ticket ticket;          // 입장권
	private Long amount;            // 현금

	// TODO 1) 초대장 존재 유무
	public boolean hasInvitation() {
		return invitation != null;  // 초대장이 없으면 true
	}

	// TODO 2) 초대장을 입장권으로 교환하는 메소드
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	// TODO 3) 현금을 증가(환불)
	public void plusAmount(Long amount) {
		this.amount += amount;
	}

	// TODO 4) 현금을 감소(지불)
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}
}