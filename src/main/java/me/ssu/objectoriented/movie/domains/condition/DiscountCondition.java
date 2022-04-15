package me.ssu.objectoriented.movie.domains.condition;

import me.ssu.objectoriented.movie.domains.screening.Screening;

/**
 * 6th,
 */
public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
