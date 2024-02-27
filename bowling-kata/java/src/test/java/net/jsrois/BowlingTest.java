package net.jsrois;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    @Test
    @DisplayName("En los tiros normales cuentan los bolos que has tirado")
    public void normal_throw() {
        BowlingScore score = new BowlingScore();

        assertThat(score.of("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-"), equalTo(90));
        assertThat(score.of("9- 9- 9- 8- 9- 9- 9- 9- 9- 9-"), equalTo(89));
        assertThat(score.of("9- 9- 41 8- 9- 9- 9- 9- 9- 9-"), equalTo(85));
    }

}
