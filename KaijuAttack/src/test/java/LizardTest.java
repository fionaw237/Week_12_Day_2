import Monsters.Lizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LizardTest {

    Lizard lizard;

    @Before
    public void setUp() {
        lizard = new Lizard("Godzilla", 300, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Godzilla", lizard.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(300, lizard.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(20, lizard.getAttackValue());
    }

    @Test
    public void canMove(){
        assertEquals("Godzilla is moving", lizard.move());
    }
}
