package net.jsrois;

import java.util.Arrays;

public class BowlingScore {

    public Integer of(String frames) {

        return Arrays.stream(frames.split("\s"))
                .map(this::getScoreForFrame)
                .reduce((t, u) -> t + u)
                .get();
    }

    private Integer getScoreForFrame(String frameScore) {
        // 9- 73 8-
        return frameScore.chars()
                .filter( c -> Character.isDigit(c))
                .map(Character::getNumericValue)
                .sum();
    }

}
