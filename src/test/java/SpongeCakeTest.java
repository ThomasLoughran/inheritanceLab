import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpongeCakeTest {

    SpongeCake spongeCake;

    @BeforeEach
    void setUp(){
        spongeCake = new SpongeCake("sponge cake", "strawberry", 10);
    }

    @Test
    void canAddTopping(){
        spongeCake.addToppings("cream");
        assertThat(spongeCake.getToppingsSize()).isEqualTo(1);
    }

}
