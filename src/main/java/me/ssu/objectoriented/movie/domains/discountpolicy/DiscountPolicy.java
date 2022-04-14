package me.ssu.objectoriented.movie.domains.discountpolicy;

import me.ssu.objectoriented.movie.domains.condition.DiscountCondition;
import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 5th, 할인 정책과 할인 조건
 *  1) 금액 할인 정책, 2) 비율 할인 정책
 */
public abstract class DiscountPolicy {

    // TODO 5th, 할인 조건
    private List<DiscountCondition> conditions = new ArrayList<>();

    /* TODO DiscountPolicy(할인 정책)
        DiscountCondition(할인 조건)의 리스트인 conditions를 객체 변수로 가지기 때문에
        하나의 할인 정책은 여러 개의 할인 조건을 포함할 수 있다.
    */
    public DiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    //
    public Money calculateDiscountAmount(Screening screening) {

        // TODO 전체 할인 조건(DiscountCondition) each의 isSatisfied 메서드를 호출
        //  할인 조건을 만족하는지 안 하는지 검증 p53부터
        for (DiscountCondition each : conditions) {
           if (each.isSatisfiedBy(screening)) {
               return getDiscountAmount(screening);
           }
       }
       return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
