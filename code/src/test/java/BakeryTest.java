import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    @BeforeEach
    void setUp(){
        bakery = new Bakery("Regent Street");
    }

    @Test
    void canGetCake(){
        assertThat(bakery.getSizeOfCakes()).isEqualTo(0);
    }

    @Test
    void canAddCake(){
        TrayBake trayBake = new TrayBake("brownie", "chocolate", 5);
        WeddingCake weddingCake = new WeddingCake("wedding cake", "vanilla", 200, 4);
        SpongeCake spongeCake = new SpongeCake("sponge cake", "vanilla", 5);
        bakery.addCake(trayBake);
        bakery.addCake(weddingCake);
        bakery.addCake(spongeCake);
        assertThat(bakery.getSizeOfCakes()).isEqualTo(3);
    }

}
