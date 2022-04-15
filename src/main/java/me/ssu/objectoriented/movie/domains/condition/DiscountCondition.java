package me.ssu.objectoriented.movie.domains.condition;

import me.ssu.objectoriented.movie.domains.screening.Screening;

/**
 * 6th, 할인 조건 인터페이스
 *  Screening 클래스에서 상속 받아 구현해서 사용할 거임.
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
