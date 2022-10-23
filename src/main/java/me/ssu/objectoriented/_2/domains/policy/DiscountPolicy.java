package me.ssu.objectoriented._2.domains.policy;

import me.ssu.objectoriented._2.domains.money.Money;
import me.ssu.objectoriented._2.domains.screening.Screening;

/**
 * 15th, 기존 DicountPolicy를 DefaultDiscountPolicy로 변경 후
 *  새로운 Interface DiscountPolicy 추가
 */
public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
