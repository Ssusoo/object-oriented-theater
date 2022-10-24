package me.ssu.objectoriented._1.domains;

// 가방 or 소지품(Bag)
public class Bag {
	private Invitation invitation;  // 초대장
	private Ticket ticket;          // 입장권
	private long amount;            // 현금

	// TODO 1) 초대장 존재 유무
	public boolean hasInvitation() {
		return invitation != null;  // 초대장이 없으면 true
	}

	// TODO 2) 초대장을 입장권으로 교환하는 메소드
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	// TODO 3) 현금을 증가(환불)
	public void plusAmount(long amount) {
		this.amount += amount;
	}

	// TODO 4) 현금을 감소(지불)
	public void minusAmount(long amount) {
		this.amount -= amount;
	}

	// TODO 5) 이벤트에 당첨된 관람객의 경우(초대장과 현금)
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}

	// TODO 6) 이벤트에 당첨되지 않은 관람객의 경우(현금만)
	public Bag(long amount) {
		this(null, amount);
	}
}