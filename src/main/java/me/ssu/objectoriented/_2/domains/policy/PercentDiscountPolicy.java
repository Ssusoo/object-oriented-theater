package me.ssu.objectoriented._2.domains.policy;

import me.ssu.objectoriented._2.domains.condition.DiscountCondition;
import me.ssu.objectoriented._2.domains.money.Money;
import me.ssu.objectoriented._2.domains.screening.Screening;

/**
 * 10th, 비율 할인 정책
 *  일정 비율을 차감한다는 거임.
 */
public class PercentDiscountPolicy extends DefaultDiscountPolicy {

    private double percent; // 할인 비율 변수

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        Money times = screening.getMovieFee().times(percent);
        return times;
    }
}
