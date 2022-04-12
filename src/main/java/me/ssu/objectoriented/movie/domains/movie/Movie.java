package me.ssu.objectoriented.movie.domains.movie;

import me.ssu.objectoriented.movie.domains.money.Money;
import me.ssu.objectoriented.movie.domains.screening.Screening;

import javax.management.Query;

public class Movie {

    private Money fee;

    public Movie(Money fee) {
        this.fee = fee;
    }

    public Money getFee() {
        return fee;
    }

    public Query calculateMovieFee(Screening screening) {
        return null;
    }
}
