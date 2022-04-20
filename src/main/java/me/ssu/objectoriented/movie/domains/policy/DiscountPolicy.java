package me.ssu.objectoriented.movie.domains.policy;

import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

/**
 * 15th, 기존 DicountPolicy를 DefaultDiscountPolicy로 변경 후
 *  새로운 Interface DiscountPolicy 추가
 */
public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
