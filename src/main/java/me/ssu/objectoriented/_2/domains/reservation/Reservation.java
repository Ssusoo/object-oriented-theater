package me.ssu.objectoriented._2.domains.reservation;

import me.ssu.objectoriented._2.domains.customer.Customer;
import me.ssu.objectoriented._2.domains.money.Money;
import me.ssu.objectoriented._2.domains.screening.Screening;

/**
 * 3th, 예매 클래스
 *  고객과 상영정보 예매 요금 인원수를 포함한 클래스
 */
public class Reservation {

    private Customer customer;      // 고객
    private Screening screening;    // 상영
    private Money fee;              // 예매 요금
    private int audienceCount;      // 인원수

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
