package me.ssu.objectoriented._2.domains.condition;

import me.ssu.objectoriented._2.domains.screening.Screening;

/**
 * 6th, 할인 조건 인터페이스
 *  1) SequenceCondition(순번 조건)
 *  2) PeriodCondition(기간 조건)으로 상속받아 사용할 거임.
 */

/**
 * 인터페이스(다중 상속)
 *  일반 메소드를 받을 수 없어 추상 클래스보다 더 엄격함.
 *
 *  인터페이스 상속시 더 엄격함.
 *      자식클래스에서 인터페이스를 상속 받으면 메소드를
 *      무조건 사용해야 한다.
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
