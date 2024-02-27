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
        Integer score = 0;
        for (char c : frameScore.replaceAll("[^0-9]", "").toCharArray()) {
            score += Integer.valueOf(String.valueOf(c));
        }
        return score;
    }

}
