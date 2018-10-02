import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    Salmon salmon;
    Tuna tuna;

    @Before
    public void setUp() {
        salmon = new Salmon();
        bear = new Bear();
        tuna = new Tuna();
    }

    @Test
    public void catEatSalmon() {
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void canEatTuna(){
        bear.eat(tuna);
        assertEquals(1, bear.foodCount());
    }
}
