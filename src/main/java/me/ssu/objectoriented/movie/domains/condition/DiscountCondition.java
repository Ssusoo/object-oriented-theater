package me.ssu.objectoriented.movie.domains.condition;

import me.ssu.objectoriented.movie.domains.screening.Screening;

/**
 * 6th, 할인 조건 인터페이스
 *  1) SequenceCondition(순번 조건)
 *  2) PeriodCondition(기간 조건)으로 상속받아 사용할 거임.
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
