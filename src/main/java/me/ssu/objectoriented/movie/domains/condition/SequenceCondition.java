package me.ssu.objectoriented.movie.domains.condition;

import me.ssu.objectoriented.movie.domains.screening.Screening;

/**
 * 7th, 순번 조건
 *  파라미터로 전달 된 Screening의 상영순번과 일치할 경우
 *  할인 가능한 것으로 판단해서 true, false를 반환함.
 */
public class SequenceCondition implements DiscountCondition {

    // TODO 할인 여부 판단 기준으로 사용함.
    private int sequence; // 순번

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    /**
     * 할인 여부 판단
     * @param screening
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        // TODO 파라미터로 전달 된 Screening의 상영순번과 일치할 경우
        //  할인 가능한 것으로 판단해서 true, false를 반환함.
        return screening.isSequence(sequence);
    }
}
