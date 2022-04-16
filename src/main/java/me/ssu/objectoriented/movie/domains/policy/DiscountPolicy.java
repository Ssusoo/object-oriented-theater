package me.ssu.objectoriented.movie.domains.policy;

import me.ssu.objectoriented.movie.domains.condition.DiscountCondition;
import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 5th, 할인 정책과 할인 조건
 *  1) 금액 할인 정책, 2) 비율 할인 정책
 *
 * 12th, 한 개의 할인조건과 여러 개의 할인 조건(Movie, DiscountPolicy)
 *  Movie 클래스의 생성자는 DiscountPolicy 한 개만 받을 수 있게 제약되어 있지만
 *  DiscountPolicy의 경우 여러 개의 할인 조건을 포함할 수 있음.
 */
public abstract class DiscountPolicy {

    // TODO 5th, 할인 조건
    private List<DiscountCondition> conditions = new ArrayList<>();

    /* TODO 5th, DiscountPolicy(할인 정책)
        DiscountCondition(할인 조건)의 리스트인 conditions를 객체 변수로 가지기 때문에
        하나의 할인 정책은 여러 개의 할인 조건을 포함할 수 있다.
    */
    /*TODO 12th, Movie 클래스의 생성자와 다르게 DiscountPolicy의 생성자는
        여러 개의 DiscountPolicy를 허용한다.
    */
    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    // TODO 5th, 할인금액
    public Money calculateDiscountAmount(Screening screening) {

        // TODO 전체 할인 조건(DiscountCondition) each의 isSatisfied 메서드를 호출
        for (DiscountCondition each : conditions) {
           if (each.isSatisfiedBy(screening)) {
               return getDiscountAmount(screening);
           }
       }
       return Money.ZERO;
    }
    abstract protected Money getDiscountAmount(Screening screening);
}
