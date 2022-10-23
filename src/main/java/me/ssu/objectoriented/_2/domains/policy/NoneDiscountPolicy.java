package me.ssu.objectoriented._2.domains.policy;

import me.ssu.objectoriented._2.domains.money.Money;
import me.ssu.objectoriented._2.domains.screening.Screening;

/**
 * 13th, 좀 더 유연한 설계-2
 *  Movie 클래스에서 0원이라는 할인 요금을 계산할 책임을 그대로 유지시키기 위해
 *  NoneDiscountPolicy 클래스를 추가한 거임.
 *
 * 16th, extends DefaultDiscountPolicy -> implements DiscountPolicy
 */
public class NoneDiscountPolicy implements DiscountPolicy {

    // TODO 13th, extends DefaultDiscountPolicy
//    @Override
//    protected Money calculateDiscountAmount(Screening screening) {
//        return Money.ZERO;
//    }

    // TODO 16th, implements DiscountPolicy
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
