package me.ssu.objectoriented.movie.domains.movie;

import me.ssu.objectoriented.movie.domains.discountpolicy.DiscountPolicy;
import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

import javax.management.Query;
import java.time.Duration;

/**
 * 4th, 영화 클래스
 */
public class Movie {

    private String title;                   // 영화제목
    private Duration runningTime;           // 상영시간
    private Money fee;                      // 요금
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

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
