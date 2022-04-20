package me.ssu.objectoriented.movie.domains.policy;

import me.ssu.objectoriented.movie.domains.condition.DiscountCondition;
import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 5th, 할인 정책과 할인 조건
 *  1) 금액 할인 정책, 2) 비율 할인 정책
 *
 * 12th, 한 개의 할인조건과 여러 개의 할인 조건(Movie, DiscountPolicy)
 *  Movie 클래스의 생성자는 DiscountPolicy 한 개만 받을 수 있게 제약되어 있지만
 *  DiscountPolicy의 경우 여러 개의 할인 조건을 포함할 수 있음.
 *
 *  14th, DiscountPolicy -> DefaultDiscountPolicy로 변경
 */

/**
 * 추상 클래스(일반 메소드 추상 메소드 둘 다 사용 가능)
 *  추상 메소드
 *      선언부만 있고 구현부는 없으며 리턴 역시 없다.
 *
 *  추상 클래스 상속시 강제성
 *      추상 클래스로 만든 추상 메소드의 경우 상속 받은 자식 클래스는
 *      추상 메소드를 오버라이딩(재정의) 해 무조건적으로 사용해야 함.
 */
public abstract class DefaultDiscountPolicy {

    // TODO 5th, 할인 조건
    /* TODO 5th, DiscountPolicy(할인 정책)
        DiscountCondition(할인 조건)의 리스트인 conditions를 객체 변수로 가지기 때문에
        하나의 할인 정책은 여러 개의 할인 조건을 포함할 수 있다.
    */
    private List<DiscountCondition> conditions = new ArrayList<>();

    /*TODO 12th, Movie 클래스의 생성자와 다르게 DiscountPolicy의 생성자는
        여러 개의 DiscountPolicy를 허용한다.
    */
    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    // TODO 5th, 할인금액
    public Money calculateDiscountAmount(Screening screening) {

        // TODO 전체 할인 조건(DiscountCondition) each의 isSatisfied 메서드를 호출
        for (DiscountCondition each : conditions) {
           if (each.isSatisfiedBy(screening)) {
               return getDiscountAmount(screening);
           }
       }
       return Money.ZERO;
    }

    // TODO 추상 메소드(상속받으면 무조건적으로 써야 함)
    abstract protected Money getDiscountAmount(Screening screening);
}
