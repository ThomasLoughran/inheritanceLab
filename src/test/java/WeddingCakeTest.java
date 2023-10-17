import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WeddingCakeTest {

    WeddingCake weddingCake;

    @BeforeEach
    void setUp(){
        weddingCake = new WeddingCake("wedding cake", "vanilla", 50, 3);
    }

    @Test
    void canSetMessage(){
        weddingCake.setMessage("Woo Hoo!");
        assertThat(weddingCake.getMessage()).isEqualTo("Woo Hoo!");
    }

    @Test
    void canGetInstruciton(){
        assertThat(weddingCake.getInstruction()).isEqualTo("I'm for sharing!");
    }

    @Test
    void canGetServings(){
        assertThat(weddingCake.servings()).isEqualTo(50);
    }
}
