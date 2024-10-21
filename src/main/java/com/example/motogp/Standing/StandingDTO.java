package com.example.motogp.Standing;

public class StandingDTO {
    private Standing standing;
    private int rank;

    public StandingDTO(Standing standing, int rank) {
        this.standing = standing;
        this.rank = rank;
    }

    public Standing getStanding() {
        return standing;
    }

    public int getRank() {
        return rank;
    }
}