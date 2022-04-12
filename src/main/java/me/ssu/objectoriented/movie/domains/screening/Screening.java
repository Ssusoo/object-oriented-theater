package me.ssu.objectoriented.movie.domains.screening;

import me.ssu.objectoriented.movie.domains.movie.Movie;

import java.time.LocalDateTime;

/**
 *  1th, 상영(Screening)
 */
public class Screening {

    private Movie movie;                    // 영화
    private int sequence;                   // 순번
    private LocalDateTime whenScreened;     // 상영시작시간

    /**
     * 1th,
     * @param movie
     * @param sequence
     * @param whenScreened
     */
    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    // TODO 1th, 상영시작시간
    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    // TODO 1th, 순번
    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    // TODO 1th,
}
