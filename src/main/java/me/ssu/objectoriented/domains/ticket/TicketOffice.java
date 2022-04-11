package me.ssu.objectoriented.domains.ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4th, 소극장에 입장하기 위한 매표소
 *  1) 초대장을 티켓으로 교환
 *  2) 현금으로 티켓 구매
 *  *매표소에는 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관
 */
public class TicketOffice {

    private Long amount;                                // 판매금액
    private List<Ticket> tickets = new ArrayList<>();   // 판매하거나 교환해 줄 티켓 목록

    /**
     * 4th, 소극장에 입장하기 위한 매표소 객체 상태
     * @param amount
     * @param tickets
     */
    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    /**
     * 4th, 티켓을 판매하는 메서드
     * @return
     */
    public Ticket getTickets() {
        return tickets.remove(0);
    }

    // TODO 판매 금액 더하기
    public void plusAccount(Long amount) {
        this.amount += amount;
    }

    // TODO 판매 금액 빼기
    public void minusAccount(Long amount) {
        this.amount -= amount;
    }
}
