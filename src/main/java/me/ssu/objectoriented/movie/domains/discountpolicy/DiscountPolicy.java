package me.ssu.objectoriented.movie.domains.discountpolicy;

import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
