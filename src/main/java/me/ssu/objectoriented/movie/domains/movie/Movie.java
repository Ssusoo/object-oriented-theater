package me.ssu.objectoriented.movie.domains.movie;

import me.ssu.objectoriented.movie.domains.policy.DiscountPolicy;
import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

import java.time.Duration;

/**
 * 4th, 영화 클래스
 */
public class Movie {

    private String title;                   // 영화제목
    private Duration runningTime;           // 상영시간
    private Money fee;                      // 요금(기본요금)
    private DiscountPolicy discountPolicy;  // 할인조건

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    /**
     * discountPolicy에게 calculateDiscountAmount 메시지를 전송해
     *  할인 요금을 반환함.
     * @param screening
     * @return
     */
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
