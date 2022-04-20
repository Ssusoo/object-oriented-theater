package me.ssu.objectoriented.movie.domains.movie;

import me.ssu.objectoriented.movie.domains.policy.DefaultDiscountPolicy;
import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

import java.time.Duration;

/**
 * 4th, 영화 클래스
 *
 * 11th, Movie 생성자에서 DiscountPolicy(할인 정책) 인스턴스 상태와 갯수
 *
 * 13th, 좀 더 유연한 설계-1
 */
public class Movie {

    private String title;                   // 영화제목
    private Duration runningTime;           // 상영시간
    private Money fee;                      // 요금(기본요금)
    private DefaultDiscountPolicy discountPolicy;  // 할인조건

    // TODO 11th, Movie의 생성자는 오직 하나의 DiscountPolicy 인스턴스만 받을 수 있도록 선언돼 있음.
    public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy discountPolicy) {
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
        // TODO 13th, 좀 더 유연한 설계-1(NoneDiscountPolicy 클래스 추가)
        if (discountPolicy == null) {
            return fee; // 기본요금
        }

        // TODO 11th, Movie 생성자에서 DiscountPolicy(할인 정책) 인스턴스 상태와 갯수
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
