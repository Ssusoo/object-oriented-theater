package me.ssu.objectoriented.domains.bag;

import me.ssu.objectoriented.domains.invate.Invitation;
import me.ssu.objectoriented.domains.ticket.Ticket;

/**
 * 3th Step, 소지품을 보관할 수 있는 가방
 *  1) 이벤트 당첨자는 초대장을 보관하는 가방
 *  2) 일반 관람객 현금을 소지
 *  *소지품에는 초대장, 현금, 티켓
 *
 * 12th, Bag의 결합도를 낮춘 설계
 *  현상태, Audience에 의해 끌려다니는 존재임.
 *  변경 후, Bag을 자율적인 존재로 바꾸기
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
//    public boolean hasTicket() {
//        return ticket != null;
//    }

    // TODO 초대장을 티켓으로 교환하는 메서드
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // TODO 현금 증가
//    public void plusAmount(Long amount) {
//        this.amount += amount;
//    }

    // TODO 현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    /**
     * 3th, 현금만 보관(가방 객체 상태 - 일반 관람객)
     * @param amount
     */
//    public Bag(Long amount) {
//        this.amount = amount;
//    }

    /**
     * 3h, 초대장과 현금(가방 객체 상태 - 이벤트 당첨자)
     * @param amount
     * @param invitation
     */
//    public Bag(Long amount, Invitation invitation) {
//        this.amount = amount;
//        this.invitation = invitation;
//    }

    /**
     * 12th, Bag의 결합도를 낮춘 설계
     *  Audience에 있는 Bag에 대한 의존성을
     *  Bag으로 가져와 의존성을 줄이기
     * @param ticket
     * @return
     */
    public Long hold(Ticket ticket) {
        // TODO 11th, 초대장이 있는 이벤트 관람객이라면
        if (hasInvitation()) {
            // TODO 초대장 있으면 초대장을 티켓으로 교환.
            setTicket(ticket);
            return 0L;
            // TODO 11th, 초대장이 없는 관람객이라면
        } else {
            // TODO 초대장이 없으면 현금으로 티켓 구매.
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
