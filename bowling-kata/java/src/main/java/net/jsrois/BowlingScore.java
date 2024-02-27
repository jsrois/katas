package net.jsrois;

import java.util.Arrays;


public class BowlingScore {

    public Integer of(String frames) {

        return Arrays.stream(frames.split("\s"))
                .map(f -> {
                    Integer score = Integer.valueOf(String.valueOf(f.charAt(0)));
                    String secondDigit = String.valueOf(f.charAt(1));
                    if (secondDigit.matches("[0-9]")) {
                        score += Integer.valueOf(secondDigit);
                    }

                    return score;
                })
                .reduce((t, u) -> t + u)
                .get();
    }

}
