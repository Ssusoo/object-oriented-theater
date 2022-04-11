package me.ssu.objectoriented.domains.theater;

import me.ssu.objectoriented.domains.audience.Audience;
import me.ssu.objectoriented.domains.ticket.TicketSeller;

/**
 * 7th, 소극장을 구현하는 Theater
 *  소극장은 먼저 관람객의 가방 안에 초대장이 들어 있는지 확인
 *
 * 8th, 극장의 결합도 낮추기 -> 판매원이랑 역할 나누기
 *  이벤트 관람객, 일반 관람객,
 *  판매원 초대장을 티켓으로 티켓을 판매하는 로직 처리의 결합도를 낮추기
 */
public class Theater {

    private TicketSeller ticketSeller;

    /**
     * 7th, 관람객을 입장시키는 극장 객체 상태
     * @param ticketSeller
     */
    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 8th, 입구 메서드
     * @param audience
     */
    public void enter(Audience audience) {
        // TODO 극장의 결합도를 낮춘 후
        //  수정된 Theater 클래스 어디서도 ticketOffice에 접근하지 않다는 사실 확인.
        //  Theater는 ticketOffice가 TicketSeller 내부에 존재한다는 사실을 알지 못함.
        //  Theater는 단지 ticketSeller가 sellTo 메시지를 이해하고 응답할 수 있다는 사실만 알고 있음.
        ticketSeller.sellTO(audience);

        // TODO 결함도를 낮추기 위해 TicketSeller 클래스로 옮기기
        //  초대장이 있는 이벤트 관람객과 일반 관람객의 상태와
        //  판매원이 초대장을 티켓으로 교환하는 상황과 티켓을 구매하는 방식의
        //  의존성을 극장에게 위임하는 게 아니라 판매원에게로 넘겨 결합도 낮추기
        // 초대장이 있는 이벤트 관람객이면
//        if (audience.getBag().hasInvitation()) {
//            // 판매원은 매표소에서 초대장을 티켓으로 교환해줌.
//            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
//
//            // 이벤트 관람객이면 초대장을 티켓으로 교환 후 가방에 넣음.
//            audience.getBag().setTicket(ticket);
//
//            // 초대장이 없는 일반 관람객이면
//            } else {
//            // 판매원은 매표소에서 티켓을 판매함.
//            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
//
//            // 일반 관람객은 가방에서 티켓 금액만큼 차감.
//            audience.getBag().minusAmount(ticket.getFee());
//
//            // 판매원은 매표소에 티켓 금액만큼 증가.
//            ticketSeller.getTicketOffice().plusAccount(ticket.getFee());
//
//            // 일반 관람객은 돈을 티켓으로 교환 후 가방에 넣음.
//            audience.getBag().setTicket(ticket);
//        }
    }
}
