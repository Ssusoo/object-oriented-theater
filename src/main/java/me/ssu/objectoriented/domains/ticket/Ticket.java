package me.ssu.objectoriented.domains.ticket;

/**
 * 7th Step, 공연 관람을 하기위해 티켓 소지
 *  공연 관람을 원하는 모든 사람들은 티켓을 소지하고 있어야 함.
 */
public class Ticket {
    private Long fee;   // 요금

    public Long getFee() {
        return fee;
    }
}
