import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrayBakeTest {

    TrayBake trayBake;

    @BeforeEach
    void Setup(){
        trayBake = new TrayBake("brownie", "chocolate", 5);
    }

    @Test
    void canGetHasSprinkles(){
        assertThat(trayBake.hasSprinkles()).isEqualTo(false);
    }

    @Test
    void canSetHasSprinkles(){
        trayBake.setHasSprinkles(true);
        assertThat(trayBake.hasSprinkles()).isEqualTo(true);
    }

    @Test
    void canGetCost(){
        assertThat(trayBake.getCost()).isEqualTo(5);
    }

}
