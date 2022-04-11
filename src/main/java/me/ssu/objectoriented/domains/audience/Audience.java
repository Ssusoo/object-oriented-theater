package me.ssu.objectoriented.domains.audience;

import me.ssu.objectoriented.domains.bag.Bag;
import me.ssu.objectoriented.domains.ticket.Ticket;

/**
 * 4th, 소지품을 보관할 수 있는 관람객
 *  외부의 제3자가 자신의 가방을 열어보도록 허용
 *
 * 11th, Audience의 결합도를 낮춘 설계
 *  외부의 제3자가 자신의 가방을 열어보도록 허용하지 않음.
 */
public class Audience {

    private Bag bag;    // 가방

    /**
     * 4th, 가방을 소유할 수 있는 관람객 객체 상태
     * @param bag
     */
    public Audience(Bag bag) {
        this.bag = bag;
    }

    // TODO 가방을 소지할 수 있는 관람객
//    public Bag getBag() {
//        return bag;
//    }

    /**
     * 11th, Audience의 결합도를 낮춘 설계
     * @param ticket
     * @return
     */
    public Long buy(Ticket ticket) {
        // TODO 11th, 초대장이 있는 이벤트 관람객이라면
        if (bag.hasInvitation()) {
            // TODO 초대장 있으면 초대장을 티켓으로 교환
            bag.setTicket(ticket);
            return 0L;
        // TODO 11th, 초대장이 없는 관람객이라면
        } else {
            // TODO 초대장이 없으면 현금으로 티켓 구매
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

}
