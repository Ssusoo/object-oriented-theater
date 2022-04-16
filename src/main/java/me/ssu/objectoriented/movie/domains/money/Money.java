package me.ssu.objectoriented.movie.domains.money;

import java.math.BigDecimal;

/**
 * 2th, 금액과 관련된 다양한 계산 클래스
 */
public class Money {

    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    /* TODO Integer(String) a = Integer.valueOf(1 or 문자열)
        : 입력한 값을 Number 객체형으로 반환
    */
    private static Money wons(int amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    /* TODO BigDecimal 사칙연산
        add() : 더하기, subtract() : 빼기
        multiply() : 곱하기, divide() 나누기
    */
    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount
                .multiply(BigDecimal.valueOf(percent)));
    }

    /* TODO compareTo() : 두 값(문자열이나 숫자 둘다 허용)을 비교해 int 값으로 반환하는 함수
        문자열 비교 abcd = zefd == // -25
        숫자 비교 후 동일한 값이면 0 작으면 -1 크면 1 반환
    */
    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    // TODO compareTo() : 두 값(문자열이나 숫자 둘다 허용)을 비교해 int 값으로 반환하는 함수
    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
}
