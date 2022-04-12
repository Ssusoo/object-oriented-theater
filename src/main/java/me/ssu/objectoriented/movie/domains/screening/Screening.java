package me.ssu.objectoriented.movie.domains.screening;


import me.ssu.objectoriented.movie.domains.customer.Customer;
import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.movie.Movie;
import me.ssu.objectoriented.movie.domains.reservation.Reservation;

import java.time.LocalDateTime;

/**
 * 1th, 상영(Screening)
 *  상영할 영화에 대한 상태 정보, 순번 일치 여부 체크, 상영시작시간 정보
 *  기본 요금을 반환 메서드, 예매 후 예매정보, 요금 계산
 */
public class Screening {

    private Movie movie;                    // 상영할 영화
    private int sequence;                   // 순번
    private LocalDateTime whenScreened;     // 상영시작시간

    // TODO 1th, 상영 객체 상태
    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    // TODO 1th, 상영시작시간
    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    // TODO 1th, 순번 일치 여부 체크
    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    // TODO 1th, 기본 요금을 반환하는 메서드
    public Money getMovieFee() {
        return movie.getFee();
    }

    // TODO 1th, 영화 예매 후 예매정보를 담고 있는 Reservation의 객체 생성 후 반환
    //  Customer 예매자에 대한 정보를 담고 있음.
    //  audienceCount 인원수
    //  this == Screening screening임.
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    // TODO 요금 계산
    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
