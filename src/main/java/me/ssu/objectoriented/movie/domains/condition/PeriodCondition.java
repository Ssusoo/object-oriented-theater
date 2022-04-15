package me.ssu.objectoriented.movie.domains.condition;

import me.ssu.objectoriented.movie.domains.screening.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * 8th, 기간 조건
 *  상영 시작 시간이 특정한 기간 안에 포함되는지
 *  여부를 판단해 할인 여부를 결정함.
 */
public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfWeek;    // 요일
    private LocalTime startTime;    // 시작시간
    private LocalTime endTime;      // 종료시간

    public PeriodCondition(DayOfWeek dayOfWeek,
                           LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        /* TODO 해당 메서드는 인자로 전달된 Screening의 상영 요일이 dayOfWekk과 같고
             상영시작시간이 startTime과 endTime 사이에 있을 경우 true를 반환
             그렇지 않으면 false를 반환
        */
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
