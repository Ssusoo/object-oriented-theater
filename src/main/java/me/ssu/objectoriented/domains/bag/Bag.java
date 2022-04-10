package me.ssu.objectoriented.domains.bag;

import me.ssu.objectoriented.domains.invate.Invitation;
import me.ssu.objectoriented.domains.ticket.Ticket;

/**
 * Third Step, 소지품을 보관할 수 있는 가방
 *  1) 이벤트 당첨자는 초대장을 보관하는 가방
 *  2) 일반 관람객 현금을 소지
 *  *소지품에는 초대장, 현금, 티켓
 */
public class Bag {

    private Long amount;            // 현금
    private Invitation invitation;  // 초대장
    private Ticket ticket;          // 티켓

    // TODO 초대장 소유 체크(있으면 이벤트 당첨자, 없으면 일반 관람객)
    public boolean hasInvitation() {
        return invitation != null;
    }

    // TODO 티켓 소유 체크(있으면 입장, 없으면 티켓 구매)
    public boolean hasTicket() {
        return ticket != null;
    }

    // TODO 초대장을 티켓으로 교환하는 메서드
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // TODO 현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    // TODO 현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    /**
     * 현금만 보관(가방 객체 상태 - 일반 관람객)
     * @param amount
     */
    public Bag(Long amount) {
        this.amount = amount;
    }

    /**
     * 초대장과 현금(가방 객체 상태 - 이벤트 당첨자)
     * @param amount
     * @param invitation
     */
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }
}
