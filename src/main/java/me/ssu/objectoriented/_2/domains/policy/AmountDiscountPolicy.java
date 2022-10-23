package me.ssu.objectoriented._2.domains.policy;

import me.ssu.objectoriented._2.domains.condition.DiscountCondition;
import me.ssu.objectoriented._2.domains.money.Money;
import me.ssu.objectoriented._2.domains.screening.Screening;

/**
 * 9th, 금액 할인 정책
 *  할인 조건을 만족할 경우 일정한 금액을 할인해주는
 *  금액 할인 정책을 구현.
 *
 */
public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;   // 할인요금

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    /**
     * 금액 할인 정책 구현
     * @param screening
     * @return
     */
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
